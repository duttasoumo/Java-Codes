package connectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionClass {

	public String conn(String id,String name) {
		// TODO Auto-generated method stub
		String s="";
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:XE","system","system");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			stmt.execute("insert into t values("+id+",'"+name+"')");
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from t"); 
			while(rs.next())  
				s+=rs.getInt(1)+";"+rs.getString(2)+"\n"; 
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}
		return s; 
	}

}
