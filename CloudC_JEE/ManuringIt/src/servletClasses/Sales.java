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

/**
 * Servlet implementation class Sales
 */
@WebServlet("/Sales")
public class Sales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sales() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con=ConnectionClass.dbcon();
		String sql="select c.cid,name,phone,sub,price,amount,payment,DATE_FORMAT(payDate, '%d-%m-%y') from farminput f,custinfo c,sales s where c.cid=s.cid and f.cid=c.cid and (sub=0 or payment=0);";
		try{
				PreparedStatement state=con.prepareStatement(sql);
				ResultSet rs=state.executeQuery();
				request.getSession().setAttribute("list", list(rs));
				con.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		request.getRequestDispatcher("sales.jsp").forward(request, response);
	}
		private ArrayList<String []> list(ResultSet rs) throws SQLException{
			 ArrayList<String []> ar=new  ArrayList<String []>();
			while(rs.next()){
				String row[]={rs.getInt(1)+"",rs.getString(2),rs.getBigDecimal(3)+"",(rs.getByte(4)==1)?"checked":"",(rs.getFloat(5)-rs.getFloat(6))+"",rs.getFloat(6)+"",(rs.getByte(7)==1)?"checked":"",(rs.getString(8)==null)?"DUE":rs.getString(8)};
				ar.add(row);
			}
			return ar;
	}

}
