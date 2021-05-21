package servletClasses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import connection_MYSQL.ConnectionClass;

/**
 * Servlet implementation class CropInputs
 */
@WebServlet("/CropInputs")
public class CropInputs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CropInputs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		int cid=0;
		try{
		cid=Integer.parseInt(request.getParameter("cid"));
		request.getSession().setAttribute("cid", cid);
		}catch(NumberFormatException e){
			response.sendRedirect("landingPage.jsp");
			return;
		}
		Connection con=ConnectionClass.dbcon();
		ResultSet rs=null;
		String sql="";
		String tab[]={"RABI","KHARIF","SUMMER"};
		String season[]=new String[3];
		try {
		for(int c=0;c<3;c++){
			String table=tab[c]+"COMBI";
			sql="select sowing,harvesting from "+table+" where cid=?";
			PreparedStatement pstate=con.prepareStatement(sql);
			pstate.setInt(1,cid);
			rs=pstate.executeQuery();
			if(rs.next()){
				byte sow=rs.getByte(1),harv=rs.getByte(2);month++;
				//System.out.println(sow+" "+harv);
				if(sow>harv){
					if(month<=harv) month+=12;		// for seasons like NOV to FEB
					harv+=12;
				}
				if(month>=sow && month<=harv){
					season[0]=tab[c];
					DateFormatSymbols dfs = new DateFormatSymbols();
				    String[] months = dfs.getMonths();
					season[1]=months[rs.getByte(1)-1];
					season[2]=months[rs.getByte(2)-1];
					request.setAttribute("season",season);
					request.setAttribute("list", info(cid,table,con));
					request.setAttribute("toolList", toolList(con));
					request.getRequestDispatcher("cropInputs.jsp").forward(request, response);
					return;
					}
				}
			}
		con.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		response.sendRedirect("landingPage.jsp"); 
		return;
}

	private String[] info(int cid,String table,Connection con) throws SQLException {
		// TODO Auto-generated method stub
		String sql="select name,aid,c.cid,crop1,crop2,crop3 from custinfo c,"+table+" r where c.cid=r.cid and c.cid=?";
		PreparedStatement pstate=con.prepareStatement(sql);
		pstate.setInt(1,cid);
		ResultSet rs=pstate.executeQuery();
		String []ar=new String[7];
		int i=0;
		if(rs.next()){
			ar[i++]=rs.getString(i);
			ar[i++]=rs.getBigDecimal(i)+"";
			ar[i++]=rs.getBigDecimal(i)+"";
			String crop1="-",crop2="-",crop3="-";
			if(rs.getByte(4)!=0){
				sql="select name from crop where id=?";
				PreparedStatement preparedStatement=con.prepareStatement(sql);
				preparedStatement.setByte(1, rs.getByte(4));
				ResultSet resultSet=preparedStatement.executeQuery();
				resultSet.next();
				crop1=resultSet.getString(1);
			}
			if(rs.getByte(5)!=0){
				sql="select name from crop where id=?";
				PreparedStatement preparedStatement=con.prepareStatement(sql);
				preparedStatement.setByte(1, rs.getByte(5));
				ResultSet resultSet=preparedStatement.executeQuery();
				resultSet.next();
				crop2=resultSet.getString(1);
			}
			if(rs.getByte(6)!=0){
				sql="select name from crop where id=?";
				PreparedStatement preparedStatement=con.prepareStatement(sql);
				preparedStatement.setByte(1, rs.getByte(6));
				ResultSet resultSet=preparedStatement.executeQuery();
				resultSet.next();
				crop3=resultSet.getString(1);
			}
			ar[i++]=crop1;
			ar[i++]=crop2;
			ar[i++]=crop3;
			sql="select tools from farminput f,sales s where f.cid=s.cid and f.cid=? and sub='1';";
			PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setInt(1, cid);
			ResultSet resultSet=preparedStatement.executeQuery();
			int tool=(resultSet.next())?resultSet.getByte("tools"):0;
			rs=con.prepareStatement("select name from tools where id="+tool).executeQuery();
			if(rs.next()) ar[i]=rs.getString(1);
			else		  ar[i]="";
		}
		return ar;
	}
	private ArrayList<String> toolList(Connection con){
		String sql="";
		ArrayList<String> ar=new ArrayList<String>();
		ResultSet rs=null;
		sql="select name from tools order by id";
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

}
