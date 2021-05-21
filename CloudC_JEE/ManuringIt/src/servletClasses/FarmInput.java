package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_MYSQL.ConnectionClass;
import otherClasses.RStoAL;

/**
 * Servlet implementation class FarmInput
 */
@WebServlet("/FarmInput")
public class FarmInput extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FarmInput() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con=ConnectionClass.dbcon();
		String sql="SELECT distinct state FROM custinfo c,farminput f where c.cid=f.cid order by state;";
		 String state = "";
		PreparedStatement pstate;
		try {
			pstate = con.prepareStatement(sql);
			ResultSet rs=pstate.executeQuery();
			ArrayList<String> ar=RStoAL.convertResultSet(rs);
			state=request.getParameter("state");
			state=state==null?ar.get(0):state;
			request.setAttribute("stateList",ar );
			request.setAttribute("state", state);
			request.setAttribute("list", list(state,con));
			con.close();
			request.getRequestDispatcher("farmInput.jsp").include(request, response);
			response.getWriter().print("<script>$('[name=\""+state+"\"]').focus(); </script>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private ArrayList<String []> list(String state,Connection con) {
		// TODO Auto-generated method stub
		ArrayList<String []> ar=new ArrayList<String[]>();
		ResultSet rs;
		DateFormatSymbols dfs = new DateFormatSymbols();
	    String[] months = dfs.getMonths();
		String sql="select c.cid,name,phone,pesticide,fertilizer,fertiquant,manure,(select name from tools where id=tools),sowing,harvesting from custinfo c,farminput f where c.cid=f.cid and c.state=? order by updated desc";
		try {
			PreparedStatement pstate=con.prepareStatement(sql);
			pstate = con.prepareStatement(sql);
			pstate.setString(1, state);
			rs=pstate.executeQuery();
			while(rs.next()){
				String temp[]={rs.getInt(1)+"",rs.getString(2),rs.getString(3),rs.getInt(4)+"",rs.getString(5),rs.getInt(6)+"",rs.getInt(7)+"",rs.getString(8)==null?"":rs.getString(8),months[rs.getByte(9)-1],months[rs.getByte(10)-1]};
				ar.add(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar;
	}

}
