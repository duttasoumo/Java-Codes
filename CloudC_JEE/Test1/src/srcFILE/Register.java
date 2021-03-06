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
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String contact=request.getParameter("contact");
		String day=request.getParameter("day");
		String mon=request.getParameter("month");
		String yr=request.getParameter("year");
		String pass=request.getParameter("pwd");
		String cpass=request.getParameter("cpwd");
		if(pass.equals(cpass)){
			request.getSession().setAttribute("id", id);
			request.getSession().setAttribute("name", name);
			request.getSession().setAttribute("email", email);
			request.getSession().setAttribute("contact", contact);
			request.getSession().setAttribute("gender",gender);
			request.getSession().setAttribute("dob", day+"/"+mon+"/"+yr);
			request.getSession().setAttribute("pwd",pass);
			RequestDispatcher rd=request.getRequestDispatcher("feedback.jsp");
			rd.forward(request, response);
			
		}else{
			RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
			PrintWriter pout=response.getWriter();
			pout.print("<p align=\"center\">Password not matching !!</p>");
		}
		
	}

}
