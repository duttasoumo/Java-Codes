package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;
import java.time.Instant;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_MYSQL.ConnectionClass;

/**
 * Servlet implementation class UpdateSales
 */
@WebServlet("/UpdateSales")
public class UpdateSales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSales() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con=ConnectionClass.dbcon();
		Enumeration<String> en=request.getParameterNames();
		String sql="";
		String param1=en.nextElement();
		String param2=en.nextElement();
		if(param2.equals("sub")){
			if(request.getParameter(param2).equals("true"))
				sql="update sales set sub=1 where cid=?";
			else
				sql="update sales set sub=0 where cid=?";
		}
		else {
			if(param2.equals("pay")){
				if(request.getParameter(param2).equals("true"))
					sql="update sales set payment=1,payDate=DATE(NOW()) where cid=?";
				else
					sql="update sales set payment=0,payDate=null where cid=?";
			}
			
			else if(request.getParameter(param2)!="")
					sql="update sales set amount=amount+"+Float.parseFloat(request.getParameter(param2))+" where cid=?";
		}
			try{
				PreparedStatement state=con.prepareStatement(sql);
				state.setInt(1, Integer.parseInt(request.getParameter( param1)));
				state.execute();
				con.close();
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			response.sendRedirect("Sales");
	}

}
