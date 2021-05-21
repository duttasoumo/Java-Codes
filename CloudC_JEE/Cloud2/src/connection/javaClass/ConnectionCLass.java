package connection.javaClass;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionCLass {

	public static Connection dbcon() {
		// TODO Auto-generated method stub
		Connection con=null;
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="system";
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			con=DriverManager.getConnection(url,username,password);  
			
		}catch(Exception e){
			System.out.print(e.getMessage());
		}
		return con;
	}

}
