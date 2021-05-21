import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_connection {
	
 public static Connection con(String table){
	 
	 String DB_URL ="jdbc:mysql://localhost/"+table;
	 String user="user";
	 String password="user";
	 Connection con=null;
	 
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(DB_URL,user,password);
	}
	catch(Exception e){
		System.err.println("Error in DB connection\n"+e.getMessage());
	}
	return con;
 }
}
