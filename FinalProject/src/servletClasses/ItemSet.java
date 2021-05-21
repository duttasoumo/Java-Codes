package servletClasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ItemSet
 */
@WebServlet("/itemSet")
public class ItemSet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemSet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String x=request.getParameter("rad");
		if(x==null) x=((ArrayList<String>)request.getSession().getAttribute("arrayL")).get(0);
		request.getSession().setAttribute("transac",x+","+request.getSession().getAttribute("transac"));
		System.out.println("IN ItemSelct.java --> \nX : "+x+"\nTRANAC : "+request.getSession().getAttribute("transac"));
		request.getRequestDispatcher("cart.jsp").forward(request, response);
	}
}
