package otherClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class RStoAL {

	public static ArrayList<String []> convertResultSet(ResultSet rs,Connection con){
		
		ArrayList<String []> ar=new ArrayList<String []>();
		try {
			do{
				String crop1="-",crop2="-",crop3="-";
				if(rs.getByte(5)!=0){
					String sql="select name from crop where id=?";
					PreparedStatement preparedStatement=con.prepareStatement(sql);
					preparedStatement.setByte(1, rs.getByte(5));
					ResultSet resultSet=preparedStatement.executeQuery();
					resultSet.next();
					crop1=resultSet.getString(1);
				}
				if(rs.getByte(6)!=0){
					String sql="select name from crop where id=?";
					PreparedStatement preparedStatement=con.prepareStatement(sql);
					preparedStatement.setByte(1, rs.getByte(6));
					ResultSet resultSet=preparedStatement.executeQuery();
					resultSet.next();
					crop2=resultSet.getString(1);
				}
				if(rs.getByte(7)!=0){
					String sql="select name from crop where id=?";
					PreparedStatement preparedStatement=con.prepareStatement(sql);
					preparedStatement.setByte(1, rs.getByte(7));
					ResultSet resultSet=preparedStatement.executeQuery();
					resultSet.next();
					crop3=resultSet.getString(1);
				}
				String[] row={rs.getString(8),rs.getString(1),rs.getBigDecimal(2)+"",rs.getString(3),rs.getString(4),crop1,crop2,crop3};
				ar.add(row);
			}while(rs.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			String[] row={"","","","","","","",""};
			ar.add(row);
		}
		return ar;
	}
	public static ArrayList<String> convertResultSet(ResultSet rs) throws SQLException{
		ArrayList<String> ar=new ArrayList<String>();
		if(!rs.first()){
			ar.add("");
		}
		do{
			ar.add(rs.getString(1));
		}while(rs.next());
		return ar;
	}
}
