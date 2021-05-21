package tableL3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewL3 {
	
	public int insert(int minSup_count){
	
		return 0;
	}

	public static ArrayList<String> isL3(int x) throws SQLException {
		
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		String sql="select * from l3";
		PreparedStatement smt=con.prepareStatement(sql);
		ResultSet rs=smt.executeQuery();
		ArrayList<String> ar=new ArrayList<String>();
		while(rs.next())
		{
			String itemSet=rs.getString(1);
		String tmp[]=itemSet.split(",");
		if( Integer.parseInt(tmp[0])==x || Integer.parseInt(tmp[1])==x || Integer.parseInt(tmp[2])==x)
			ar.add(itemSet);
		}
		return ar;
		}
}
