package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_MYSQL.ConnectionClass;

/**
 * Servlet implementation class CropInputStore
 */
@WebServlet("/CropInputStore")
public class CropInputStore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CropInputStore() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con=ConnectionClass.dbcon();
		int cid=((Integer) request.getSession().getAttribute("cid"));
		due(cid,con);
		String sql="replace into farminput(cid,pesticide,fertilizer,fertiquant,manure,tools,price,sowing,harvesting) values(?,?,?,?,?,?,?,?,?)";
		String sql2="replace into sales(cid) values(?)";
		int pesticide=request.getParameter("pesticide")==""?0:Integer.parseInt(request.getParameter("pesticide"));
		int fertWt=request.getParameter("fertilizer")==""?0:Integer.parseInt(request.getParameter("fertilizer"));
		int manure=request.getParameter("manure")==""?0:Integer.parseInt(request.getParameter("manure"));
		float total=request.getParameter("total")==""?0:Float.parseFloat(request.getParameter("total"));
		total+=due(cid,con);
			try{
			PreparedStatement state=con.prepareStatement(sql);
			state.setInt(1,cid);
			state.setInt(2,pesticide);
			state.setString(3,request.getParameter("fert"));
			state.setInt(4,fertWt);
			state.setInt(5,manure);
			state.setByte(6,Byte.parseByte(request.getParameter("tool")));
			state.setFloat(7,total);
			state.setByte(8, month(request.getParameter("sow")));
			state.setByte(9, month(request.getParameter("harv")));
			state.execute();
			state=con.prepareStatement(sql2);
			state.setInt(1,cid);
			state.execute();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
			response.sendRedirect("landingPage.jsp");
	}
	private byte month(String x){
		Date date=null;
		try {
			date = new SimpleDateFormat("MMMM").parse(x);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    return (byte)cal.get(Calendar.MONTH);
	}
	private float due(int cid,Connection con){
		String sql="select price-amount from farminput f,sales s where f.cid=s.cid and f.cid=?;";
		float due=0;
		try {
			PreparedStatement pstate=con.prepareStatement(sql);
			pstate.setInt(1, cid);
			ResultSet rs=pstate.executeQuery();rs.next();
			due=rs.getFloat(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return due;
	}
}
