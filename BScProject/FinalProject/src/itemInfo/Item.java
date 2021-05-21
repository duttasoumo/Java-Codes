package itemInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Item {
	public static String getName(int x) {
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		String sql="select ItemName from items where ItemID=?";
		PreparedStatement state;
		String name=null;
		try {
			state = con.prepareStatement(sql);
			state.setInt(1, x);
			ResultSet rs=state.executeQuery();
			rs.next();
			name=rs.getString("ItemName");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in SQL ItemName");
		}
		return name;
		
	}
	
	public static String getImg(int x) {
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		String sql="select ImageID from items where ItemID=?";
		PreparedStatement state;
		String img="images\\";
		try {
			state = con.prepareStatement(sql);
			state.setInt(1, x);
			ResultSet rs=state.executeQuery();
			rs.next();
			img+=rs.getString("ImageID");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error in SQL ItemImage");
		}
		return img;
		
	}

}
