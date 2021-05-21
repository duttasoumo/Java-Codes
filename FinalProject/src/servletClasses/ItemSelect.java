package servletClasses;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import itemSetTable.ResultSetTable;

/**
 * Servlet implementation class ItemSelect
 */
@WebServlet("/itemSelect")
public class ItemSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ItemSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(request.getParameter("but"));
		ResultSetTable rs=new ResultSetTable();
		ArrayList<String> ar=null;
		ar=rs.insert(x);
		System.out.println("ItemSelect.java --> ButPressed : "+ar.get(0));
		request.getSession().setAttribute("arrayL", ar);
		request.getRequestDispatcher("itemSet.jsp").forward(request, response);
	}

}
