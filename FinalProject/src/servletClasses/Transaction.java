package servletClasses;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import tableLen1.TableC1;
import tableLen1.ViewL1;
import tableLen2.TableH2;
import tableLen2.ViewL2;
import tableLen3.TableH3;
import tableLen3.ViewL3;
import transactionTable.TransactionClass;

/**
 * Servlet implementation class Transaction
 */
@WebServlet("/Transaction")
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String trans=null;
		try {
			trans=(String)request.getSession().getAttribute("transac");
			trans=trans.substring(0,trans.length()-1);
			TransactionClass obT=new TransactionClass();
			int x1=obT.transaction(trans);
			
			TableC1 ob1=new TableC1();
			int x=ob1.insert(trans);
			System.out.println(x);
			
			ViewL1 ob2=new ViewL1();
			int y=ViewL1.avg();
			x=ob2.insert(y);
			
			System.out.println(x+" "+y);
			
			TableH2 ob3=new TableH2();
			x=ob3.insert(trans);
			System.out.println(x);
			
			ViewL2 obl2=new ViewL2(); 
			 y=ViewL2.avg();
			x=obl2.insert(y);
			System.out.println(x+" "+y);
			
			TableH3 ob4=new TableH3();
			x=ob4.insert(trans);
			System.out.println(x);
			
			ViewL3 obl3=new ViewL3();
			 y=ViewL3.avg();
			x=obl3.insert(y);
			System.out.println(x+" "+y);
			
			request.getSession().setAttribute("transacID", x1);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		request.getRequestDispatcher("completion.jsp").forward(request, response);
	}

}
