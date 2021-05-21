package connection.javaClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UseSql {

	public int insert(Beann b){
		int i=0;
		Connection con=null;
		String sql="insert into table1 values(?,?,?)";
		PreparedStatement pstmt=null;
		try{
			con=ConnectionCLass.dbcon();
			pstmt=con.prepareStatement(sql);

			pstmt.setInt(1,b.getRoll());
			pstmt.setString(2,b.getName());
			pstmt.setInt(3,b.getMarks());
			i=pstmt.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		return i;
	}
	public ResultSet disp(){
		String sql="select * from table1";
		Connection con=null;
		ResultSet rs = null;
		PreparedStatement pstmt=null;
		try{
			con=ConnectionCLass.dbcon();
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
		}catch(Exception e){
			e.printStackTrace();
		}
		return rs;
	}
}
