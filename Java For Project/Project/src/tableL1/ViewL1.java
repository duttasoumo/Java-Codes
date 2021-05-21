package tableL1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewL1 {

	public int insert(int minSup_count){
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		int x=-1;
		String sql="Create or Replace View L1 as select item from c1 where sup_count>?";
		try {
			PreparedStatement state=con.prepareStatement(sql);
			state.setInt(1,minSup_count );
			x=state.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public static boolean isL1(int x) throws SQLException{
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		String sql="select * from l1 where item=?";
		ResultSet rs=null;
		PreparedStatement state=con.prepareStatement(sql);
		state.setString(1,Integer.toString(x));
		rs=state.executeQuery();
		boolean val=rs.next();
		con.close();
		return val;
	}
	
}
