package transactionTable;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransactionClass {
	
	public int transaction(String I)
	 {  
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		int x=-1;
		 try{
		 PreparedStatement smt=con.prepareStatement("Insert into transaction (Item_List) values (?)");
			smt.setString(1,I);
			x= smt.executeUpdate();
			con.close();
		 }
		 catch(Exception e)
		 {	System.out.println(e.getMessage());}
		 return x;
	 }

}
