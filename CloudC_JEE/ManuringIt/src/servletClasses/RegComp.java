package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_MYSQL.ConnectionClass;

/**
 * Servlet implementation class RegComp
 */
@WebServlet("/RegComp")
public class RegComp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegComp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cid=(Integer)request.getSession().getAttribute("cid");
		byte crop1,crop2,crop3,sow,harv;
		sow=Byte.parseByte(request.getParameter("s1"));
		harv=Byte.parseByte(request.getParameter("h1"));
		crop1=Byte.parseByte(request.getParameter("rcrop1"));
		crop2=Byte.parseByte(request.getParameter("rcrop2"));
		crop3=Byte.parseByte(request.getParameter("rcrop3"));
		insert("rabicombi",cid,sow,harv,crop1,crop2,crop3);
		
		sow=Byte.parseByte(request.getParameter("s2"));
		harv=Byte.parseByte(request.getParameter("h2"));
		crop1=Byte.parseByte(request.getParameter("kcrop1"));
		crop2=Byte.parseByte(request.getParameter("kcrop2"));
		crop3=Byte.parseByte(request.getParameter("kcrop3"));
		insert("kharifcombi",cid,sow,harv,crop1,crop2,crop3);
		
		sow=Byte.parseByte(request.getParameter("s3"));
		harv=Byte.parseByte(request.getParameter("h3"));
		crop1=Byte.parseByte(request.getParameter("scrop1"));
		crop2=Byte.parseByte(request.getParameter("scrop2"));
		crop3=Byte.parseByte(request.getParameter("scrop3"));
		insert("summercombi",cid,sow,harv,crop1,crop2,crop3);
		response.sendRedirect("landingPage.jsp");
		return;
	}

	private void insert(String table, int cid, byte sow, byte harv, byte crop1, byte crop2, byte crop3) {
		// TODO Auto-generated method stub
		Connection con=ConnectionClass.dbcon();
		String sql="";
		try {
			sql="replace into "+table+" values(?,?,?,?,?,?)";
			PreparedStatement pstate=con.prepareStatement(sql);
			pstate.setInt(1, cid);
			pstate.setByte(2, sow);
			pstate.setByte(3, harv);
			pstate.setByte(4, crop1);
			pstate.setByte(5, crop2);
			pstate.setByte(6, crop3);
			
			pstate.execute();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
