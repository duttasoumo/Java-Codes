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
import otherClasses.SCD_List;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String unm=request.getParameter("uname");
		String pass=request.getParameter("psw");
		
		Connection con=ConnectionClass.dbcon();
		String sql="";
		try {
			sql="select * from user_login where user=? and password=SHA2(?,256)";
			PreparedStatement state=con.prepareStatement(sql);
			state.setString(1, unm);state.setString(2, pass);
			ResultSet rs=state.executeQuery();
			if(!rs.next()){
				response.sendRedirect("index.jsp");return;
			}
			sql="replace into user_login(user,password) values(?,SHA2(?,256));";
			state=con.prepareStatement(sql);
			state.setString(1, unm);
			state.setString(2, pass);
			state.execute();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("SQL Error At Login!!");
		}
		response.sendRedirect("landingPage.jsp");
	}

}
