package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_MYSQL.ConnectionClass;

/**
 * Servlet implementation class Reg
 */
@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Connection con=ConnectionClass.dbcon();
		String sql="replace into custinfo(aid,name,phone,sex,village,block,dist,city,state,size) values(?,?,?,?,?,?,?,?,?,?);";
		try {
			PreparedStatement state=con.prepareStatement(sql);

			state.setString(1,request.getParameter("aid"));
			state.setString(2,request.getParameter("name"));
			state.setString(3,request.getParameter("phno"));
			state.setString(4,request.getParameter("gender"));
			state.setString(5,request.getParameter("village"));
			state.setString(6,request.getParameter("block"));
			state.setString(7,request.getParameter("d"));
			state.setString(8,request.getParameter("c"));
			state.setString(9,request.getParameter("s"));
			System.out.println(request.getParameter("size").toString());
			state.setByte(10,Byte.parseByte(request.getParameter("size")));
			state.execute();
			ResultSet rs=con.prepareStatement("select cid from custinfo where aid="+request.getParameter("aid")).executeQuery();
			rs.next();
			session.RemoveAll.attributes(request.getSession());
			request.getSession().setAttribute("cid", rs.getInt(1));
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("landingPage.jsp").forward(request, response);
	}

}
