package completeTrans;

import java.io.IOException;
import java.sql.SQLException;

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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String trans=(String) request.getSession().getAttribute("transcString");
		trans=trans.substring(0,trans.lastIndexOf(','));
		TransactionClass obT=new TransactionClass();
		int x=obT.transaction(trans);
		//System.out.println(x);
		  
		
		TableC1 ob=new TableC1();
		ob.insert(trans);
		//System.out.println(x);
		
		ViewL1 ob2=new ViewL1();
		ob2.insert(2);
	//	System.out.println(x);
		
		TableH2 ob3=new TableH2();
		try {
			ob3.insert(trans);
			//System.out.println(x);
			
			ViewL2 obl2=new ViewL2(); 
			obl2.insert(1);
			//System.out.println(x);
			
			TableH3 ob4=new TableH3();
			ob4.insert(trans);
			//System.out.println(x);
			
			ViewL3 obl3=new ViewL3(); 
			obl3.insert(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getSession().setAttribute("id", x);
		request.getRequestDispatcher("complete.jsp").forward(request, response);;
		
	}

}
