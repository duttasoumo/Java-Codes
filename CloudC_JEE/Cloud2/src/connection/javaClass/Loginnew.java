package connection.javaClass;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginnew
 */
@WebServlet("/Loginnew")
public class Loginnew extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Beann b=new Beann();
		String name=request.getParameter("name");
		int marks=Integer.parseInt(request.getParameter("marks"));
		int roll=Integer.parseInt(request.getParameter("roll"));
		b.setMarks(marks);
		b.setName(name);
		b.setRoll(roll);
		UseSql sql=new UseSql();
		int x=sql.insert(b);
		if(x!=0)
			response.sendRedirect("display.jsp");
		else
			response.sendRedirect("Login.jsp");
	}

}