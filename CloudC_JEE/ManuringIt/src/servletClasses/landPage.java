package servletClasses;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import otherClasses.SCD_List;

/**
 * Servlet implementation class landPage
 */
@WebServlet("/landPage")
public class landPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public landPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

			SCD_List ob=new SCD_List();
			ob.readExcel();
			request.getSession().setAttribute("stateList",ob.state);
			request.getSession().setAttribute("distList",ob.dist);
			request.getSession().setAttribute("cityList",ob.city);
			request.getRequestDispatcher("reg.jsp").forward(request, response);
			}
}
