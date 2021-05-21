package tableL2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewL2 {

	public int insert(int minSup_count){
		
		return 0;
	}
	
	public static boolean isL2(String x) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		String sql="select * from l2 where item=?";
		ResultSet rs=null;
		PreparedStatement state=con.prepareStatement(sql);
		state.setString(1,x);
		rs=state.executeQuery();
		boolean val=rs.next();
		con.close();
		return val;
	}
	
	public static ArrayList<String> isL2(int x) throws SQLException {
		
	Connection con=connection_MySQL.ConnectionClass.dbcon();
	String sql="select * from l2";
	PreparedStatement smt=con.prepareStatement(sql);
	ResultSet rs=smt.executeQuery();
	ArrayList<String> ar=new ArrayList<String>();
	while(rs.next())
	{
		String itemSet=rs.getString(1);
	String tmp[]=itemSet.split(",");
	if( Integer.parseInt(tmp[0])==x || Integer.parseInt(tmp[1])==x)
		ar.add(itemSet);
	}
	return ar;
	}
}
