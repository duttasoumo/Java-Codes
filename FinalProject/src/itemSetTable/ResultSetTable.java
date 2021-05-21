package itemSetTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tableLen2.ViewL2;
import tableLen3.ViewL3;

public class ResultSetTable {
	public ArrayList<String> insert(int item){
		ArrayList<String> resSet=new ArrayList<String>();
		try {
			Connection con=connection_MySQL.ConnectionClass.dbcon();
			String sql="TRUNCATE resset";
			con.prepareStatement(sql).execute();
			sql="insert into resset values(?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,Integer.toString(item));
			ps.execute();
			resSet.add(Integer.toString(item));
			ArrayList<String> ar=ViewL2.isL2(item);
			if(ar!=null){
			for (String res : ar){
				ps.setString(1,res);
				ps.execute();
				resSet.add(res);
			}
			
			ar=ViewL3.isL3(item);
			if(ar!=null)
			for (String res : ar){
				ps.setString(1,res);
				ps.execute();
				resSet.add(res);
			}
			}
			//show(con);
			con.close();		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resSet;
		
	}
				// to be deleted
	public void show(Connection con) throws SQLException{
		String sql="SELECT * FROM resset order by length(itemSet);";
		ResultSet rs = con.prepareStatement(sql).executeQuery();
		while(rs.next()){
			System.out.println(rs.getString(1));
		}
	}
}
