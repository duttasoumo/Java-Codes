package driver;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import itemSetTable.ResultSetTable;

/**
 * Servlet implementation class DrverServlet
 */
@WebServlet("/DrverServlet")
public class DrverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DrverServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int x=Integer.parseInt(request.getParameter("item"));
		ResultSetTable rs=new ResultSetTable();
		ArrayList<String> ar=null;
		try {
			ar=rs.insert(x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("arrayL", ar);
		request.getRequestDispatcher("itemSelect.jsp").forward(request, response);
	}

}
