package connection_MySQL;

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class ConnectionClass {
		
	 public static Connection dbcon(){
		 
		/*String DB_URL ="jdbc:mysql://192.168.1.115:3306/project?useSSL=false";
		 String user="user1";
		 String password="pass1";
		*/
		 String DB_URL ="jdbc:mysql://127.0.0.1:3306/schema?useSSL=false";
		 String user="user";
		 String password="user";
		 Connection con=null;
		 
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con=DriverManager.getConnection(DB_URL,user,password);
		}
		catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			   System.exit(1);
			}
		catch(Exception e){
			System.err.println("Error in DB connection\n"+e.getMessage());
		}
		return con;
	 }

	}
