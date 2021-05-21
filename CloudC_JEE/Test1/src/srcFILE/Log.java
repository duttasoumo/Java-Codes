package srcFILE;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Log
 */
@WebServlet("/Log")
public class Log extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uid=request.getParameter("id");
		String pass=request.getParameter("pwd");
		if(uid.equalsIgnoreCase("Admin") && pass.equals("admin")){
			RequestDispatcher rd=request.getRequestDispatcher("myfeedback.jsp");
			rd.forward(request, response);
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("log.jsp");
			rd.include(request, response);
			PrintWriter out=response.getWriter();
			out.println("<p align=\"center\">Error in LOGIN !!</p>");
		}
	}

}
