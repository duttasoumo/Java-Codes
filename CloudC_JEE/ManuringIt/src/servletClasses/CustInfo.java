package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormatSymbols;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection_MYSQL.ConnectionClass;

/**
 * Servlet implementation class CustInfo
 */
@WebServlet("/CustInfo")
public class CustInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustInfo() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cid=(Integer.parseInt(request.getParameter("cid")));
		String[] pinfo={},finput={};
		String[][] crop={{}};
		try {  pinfo=pinfo(cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{	crop=crops(cid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finput=finput(cid);
		request.setAttribute("pinfo", pinfo);
		request.setAttribute("crop", crop);
		request.setAttribute("finput",finput);
		request.getRequestDispatcher("custinfo.jsp").forward(request, response);
	}
	
	private String[] pinfo(int cid) throws SQLException{
		Connection con=ConnectionClass.dbcon();
		String sql="SELECT cid,aid,name,phone,sex,village,block,dist,city,state,size FROM custinfo where cid=?";
		PreparedStatement p = con.prepareStatement(sql);
		p.setInt(1, cid);
		ResultSet rs=p.executeQuery();rs.next();
		String[] temp={rs.getInt(1)+"",rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getByte(11)+""};
		return temp;
	}
	
	private String[][] crops(int cid) throws SQLException{
		Connection con=ConnectionClass.dbcon();
		String tab[]={"RABI","KHARIF","SUMMER"};
		DateFormatSymbols dfs = new DateFormatSymbols();
	    String[] months = dfs.getMonths();
	    String [][]ar=new String[3][6];
		for(int i=0;i<3;i++){
			String table=tab[i]+"COMBI";
			String sql2="select sowing,harvesting,(select name from crop where id=crop1),(select name from crop where id=crop2),(select name from crop where id=crop3) from "+table+" where cid=?;";
			PreparedStatement p=con.prepareStatement(sql2);p.setInt(1, cid);
			ResultSet rs=p.executeQuery();
			rs.next();
			ar[i][0]=tab[i];
			ar[i][1]=months[rs.getByte(1)-1];ar[i][2]=months[rs.getByte(2)-1];
			ar[i][3]=rs.getString(3)==null?"":rs.getString(3);
			ar[i][4]=rs.getString(4)==null?"":rs.getString(4);
			ar[i][5]=rs.getString(5)==null?"":rs.getString(5);
		}
		return ar;
	}
	private String[] finput(int cid) {
		Connection con=ConnectionClass.dbcon();
		String sql="select f.cid,pesticide,fertilizer,fertiquant,manure,(select name from tools where id=tools),price-amount as amountPaid,price,sub,sowing,harvesting from farminput f,sales s where f.cid=? and f.cid=s.cid;";
		DateFormatSymbols dfs = new DateFormatSymbols();
	    String[] months = dfs.getMonths();
	    try{
	    PreparedStatement p = con.prepareStatement(sql);
		p.setInt(1, cid);
		ResultSet rs=p.executeQuery();rs.next();
		String[] ar={rs.getInt(1)+"",rs.getInt(2)+"",rs.getString(3)==null?"":rs.getString(3),rs.getInt(4)+"",rs.getInt(5)+"",rs.getString(6)==null?"":rs.getString(6),rs.getFloat(7)+"",rs.getFloat(8)+"",rs.getByte(9)==0?"NO":"YES",months[rs.getByte(10)-1],months[rs.getByte(11)-1]};
		return ar;
		} catch (SQLException e){// TODO Auto-generated catch block
		}
	    String[] ar={"","","","","","","","","","",""};
		return ar;
	}

}
