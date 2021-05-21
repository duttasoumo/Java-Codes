package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import connection_MYSQL.ConnectionClass;

/**
 * Servlet implementation class CropSelect
 */
@WebServlet("/CropSelect")
public class CropSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CropSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cid=0;byte months[]=new byte[6];
		String state = "",dist = "";
		try{
		cid=Integer.parseInt(request.getParameter("cid"));
		}catch(NumberFormatException e){
			request.getSession().invalidate();
			response.sendRedirect("landingPage.jsp");
			response.getWriter().append("<script>window.alert(\"INVALID Customer ID!!\");</script>");
			return;
		}
		Connection con=ConnectionClass.dbcon();
		String sql="select state,dist from custinfo where cid=?";
		try {
			PreparedStatement pstate=con.prepareStatement(sql);
			pstate.setInt(1, cid);
			ResultSet rs=pstate.executeQuery();
			
			if(!rs.next()){
				request.getSession().invalidate();
				response.sendRedirect("landingPage.jsp");
				response.getWriter().append("<script>window.alert(\"INVALID Customer ID!!\");</script>");
				return;
			}
			state=rs.getString("state");
			dist=rs.getString("dist");
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			request.getSession().setAttribute("cid", cid);
			request.getSession().setAttribute("cropList", cropList());
			byte b[]=cropCombi("rabicombi", state, dist);
			request.getSession().setAttribute("rabicombi", b);
			b=cropCombi("kharifcombi", state, dist);
			request.getSession().setAttribute("kharifcombi", b);
			b=cropCombi("summercombi", state, dist);
			request.getSession().setAttribute("summercombi", b);
			
		
		byte[] temp=sow_harv_month("rabicombi", state, dist);
		months[0]=temp[0];
		months[1]=temp[1];
		temp=sow_harv_month("kharifcombi", state, dist);
		months[2]=temp[0];
		months[3]=temp[1];
		temp=sow_harv_month("summercombi", state, dist);
		months[4]=temp[0];
		months[5]=temp[1];
		request.getSession().setAttribute("months", months);
		request.getRequestDispatcher("cropSel.jsp").forward(request, response);
		return;
	}
	private byte[] cropCombi(String table,String state,String dist){
		String sql="";
		byte[] ar=new byte[3];
		Connection con=ConnectionClass.dbcon();
		ResultSet rs=null;
		ar[0]=ar[1]=ar[2]=0;
		try {
			
		sql="select crop1 from custinfo c,"+table+" r where c.cid=r.cid and c.state=? and c.dist=? group by state,dist,crop1 order by count(crop1) desc limit 1";
			PreparedStatement pstate=con.prepareStatement(sql);
			pstate.setString(1, state);
			pstate.setString(2, dist);
			rs=pstate.executeQuery();
			
		if(!rs.next()){
			sql="select crop1 from custinfo c,"+table+" r where c.cid=r.cid and c.state=? group by state,crop1 order by count(crop1) desc limit 1";
			pstate=con.prepareStatement(sql);
			pstate.setString(1, state);
			rs=pstate.executeQuery();
			rs.next();
		}
		if(rs.last())
			ar[0]=rs.getByte(1);
		
		sql="select crop2 from custinfo c,"+table+" r where c.cid=r.cid and c.state=? and c.dist=? group by state,dist,crop2 order by count(crop2) desc limit 1";
			pstate=con.prepareStatement(sql);
			pstate.setString(1, state);
			pstate.setString(2, dist);
			rs=pstate.executeQuery();
		
		if(!rs.next()){
			sql="select crop2 from custinfo c,"+table+" r where c.cid=r.cid and c.state=? group by state,crop2 order by count(crop2) desc limit 1";
			pstate=con.prepareStatement(sql);
			pstate.setString(1, state);
			rs=pstate.executeQuery();
			rs.next();
		}
		if(rs.last())
			ar[1]=rs.getByte(1);

		
		sql="select crop3 from custinfo c,"+table+" r where c.cid=r.cid and c.state=? and c.dist=? group by state,dist,crop3 order by count(crop3) desc limit 1";
			pstate=con.prepareStatement(sql);
			pstate.setString(1, state);
			pstate.setString(2, dist);
			rs=pstate.executeQuery();
		
		if(!rs.next()){
			sql="select crop3 from custinfo c,"+table+" r where c.cid=r.cid and c.state=? group by state,crop3 order by count(crop3) desc limit 1";
			pstate=con.prepareStatement(sql);
			pstate.setString(1, state);
			rs=pstate.executeQuery();
			rs.next();
		}
		if(rs.last())
			ar[2]=rs.getByte(1);

		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ar;
		
	}
	
	private ArrayList<String> cropList(){
		String sql="";
		ArrayList<String> ar=new ArrayList<String>();
		Connection con=ConnectionClass.dbcon();
		ResultSet rs=null;
		sql="select name from crop order by id";
		try {
			PreparedStatement pstate=con.prepareStatement(sql);
			rs=pstate.executeQuery();
			while(rs.next())
				ar.add(rs.getString(1)+"");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ar;
	}
	
	private byte[] sow_harv_month(String table,String state,String dist){
		String sql="";
		byte[] b=new byte[2];
		b[0]=b[1]=0;
		Connection con=ConnectionClass.dbcon();
		ResultSet rs=null;
		try {
			sql="select sowing from custinfo c,"+table+" r where c.cid=r.cid and c.state=? and c.dist=? group by state,dist,sowing order by count(sowing) desc limit 1;";
			PreparedStatement pstate=con.prepareStatement(sql);
			pstate.setString(1,state);
			pstate.setString(2,dist);
			rs=pstate.executeQuery();
			if(!rs.next()){
				sql="select sowing from custinfo c,"+table+" r where c.cid=r.cid and c.state=? group by state,sowing order by count(sowing) desc limit 1;";
				pstate=con.prepareStatement(sql);
				pstate.setString(1,state);
				rs=pstate.executeQuery();
			}
			if(rs.last()) b[0]=rs.getByte(1);
			
			sql="select harvesting from custinfo c,"+table+" r where c.cid=r.cid and c.state=? and c.dist=? group by state,dist,harvesting order by count(harvesting) desc limit 1;";
			pstate=con.prepareStatement(sql);
			pstate.setString(1,state);
			pstate.setString(2,dist);
			rs=pstate.executeQuery();
			if(!rs.next()){
				sql="select harvesting from custinfo c,"+table+" r where c.cid=r.cid and c.state=? group by state,harvesting order by count(harvesting) desc limit 1;";
				pstate=con.prepareStatement(sql);
				pstate.setString(1,state);
				rs=pstate.executeQuery();
			}
			if(rs.last()) b[1]=rs.getByte(1);
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}

}
