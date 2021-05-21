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
 * Servlet implementation class UserReg
 */
@WebServlet("/UserReg")
public class UserReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String unm=request.getParameter("Auser");
		String pass=request.getParameter("Apass");
		
		Connection con=ConnectionClass.dbcon();
		String sql="";
		try {
			sql="select * from user_login where user=? and password=SHA2(?,256)";
			PreparedStatement state=con.prepareStatement(sql);
			state.setString(1, unm);
			state.setString(2, pass);
			ResultSet rs=state.executeQuery();
			if(!rs.next()){
				response.sendRedirect("index.jsp");return;
			}
			unm=request.getParameter("user");
			pass=request.getParameter("pass");
			sql="replace into user_login(user,password) values(?,SHA2(?,256));";
			state=con.prepareStatement(sql);
			state.setString(1, unm);
			state.setString(2, pass);
			state.execute();
			con.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		response.sendRedirect("index.jsp");
	}

}
