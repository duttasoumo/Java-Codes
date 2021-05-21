package tableL2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;

import hash.Hashing;
import itemSet.ItemSet_2;
import tableL1.ViewL1;

public class TableH2 {

	@SuppressWarnings("unchecked")
	public int insert(String trans) throws SQLException{
		
		ItemSet_2 iset=new ItemSet_2(trans);
			String ar[]=iset.combi();// set of all combination
			LinkedList<String> h[];
			h=new LinkedList[7];
			for(int i=0;i<7;i++){
				h[i]=new LinkedList<String>();
			}
			Hashing hash=new Hashing();
			for(int i=0;i<ar.length;i++){
				String s[]=ar[i].split(",");
				int y=Integer.parseInt(s[0]);
				int x=Integer.parseInt(s[1]);
				if(!ViewL1.isL1(y) || !ViewL1.isL1(x))
						continue;
				
				hash.setY(y);
				hash.setX(x);
				int index=hash.getHash();
				h[index].add(ar[i]);
			}
		return runSQL(h);
		}	


	public int runSQL(LinkedList<String>[] h) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		int x=-1;
		String sql="insert into h2 values(?,?,?,?,?,?,?)";
		int flag=0;
		do{
			flag=0;
			PreparedStatement ps=con.prepareStatement(sql);
			for(int i=0;i<7;i++){
				if(h[i].isEmpty())
					ps.setNull(i+1,java.sql.Types.VARCHAR);
				else{
					String item=(h[i].remove()).toString();
					ps.setString(i+1, item);
					flag=1;
				}
			}
		if(flag==1)   x=ps.executeUpdate();	
		}while(flag==1);
		con.close();
		return x;
	}

}
