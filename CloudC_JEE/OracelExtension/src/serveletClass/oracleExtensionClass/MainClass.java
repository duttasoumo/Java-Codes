package serveletClass.oracleExtensionClass;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainClass
 */
@WebServlet("/MainClass")
public class MainClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:XE","system","system");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			stmt.execute("insert into t values("+id+",'"+name+"')");
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from t");  
			PrintWriter out=response.getWriter();
			out.println("<table align=\"center\">");
			while(rs.next())  
				out.println("<tr><td>"+rs.getInt(1)+"<td/><td>"+rs.getString(2)+"<td/><tr/>"); 
			out.println("<table/>");
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			 
			
		}
	}
