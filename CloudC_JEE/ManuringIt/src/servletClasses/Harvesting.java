package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_MYSQL.ConnectionClass;
import otherClasses.RStoAL;

/**
 * Servlet implementation class Harvesting
 */
@WebServlet("/Harvesting")
public class Harvesting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Harvesting() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		byte month;
		try{
		month=Byte.parseByte(request.getParameter("month"));
		}
		catch (NumberFormatException e)
		{
		    month = 1;
		}
		request.getSession().setAttribute("month", month);
		request.getSession().setAttribute("list", list(month));
		request.getRequestDispatcher("harvesting.jsp").include(request, response);
		response.getWriter().println("<script>$('[name="+month+"]').focus(); </script>");
	}
	
	private ArrayList<String []> list(byte month){
		ResultSet rs=null;
		String table[]={"rabicombi","kharifcombi","summercombi"};
		int c=0;ArrayList<String []> ar=null;
		Connection con=ConnectionClass.dbcon();
		try {
			
			String sql="select name,phone,dist,state,crop1,crop2,crop3,c.cid from custinfo c,"+table[c++]+" r where c.cid=r.cid and harvesting=?;";
			PreparedStatement pstate =con.prepareStatement(sql);
			pstate.setByte(1, month);
			rs=pstate.executeQuery();
			if(rs==null || !rs.first()){
				sql="select name,phone,dist,state,crop1,crop2,crop3,c.cid from custinfo c,"+table[c++]+" r where c.cid=r.cid and harvesting=?;";
				pstate =con.prepareStatement(sql);
				pstate.setByte(1, month);
				rs=pstate.executeQuery();
			}else{
				if(rs==null || !rs.first()){
					sql="select name,phone,dist,state,crop1,crop2,crop3,c.cid from custinfo c,"+table[c++]+" r where c.cid=r.cid and harvesting=?;";
					pstate =con.prepareStatement(sql);
					pstate.setByte(1, month);
					rs=pstate.executeQuery();
				}
				else if(rs==null || !rs.first()) return null;
			}
			if(rs.first())
			ar=RStoAL.convertResultSet(rs,con);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar;
	}
	

}
