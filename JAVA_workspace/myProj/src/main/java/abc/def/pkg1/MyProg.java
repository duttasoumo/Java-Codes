package abc.def.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyProg {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","user","user");
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from test where col1=1");  
		while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
		con.close();
		abc x = new abc("A");
		abc x1 = new abc("B");
		x.start();
		x1.start();
	}
}

class abc extends Thread {
	String x;
	public abc(String x) {
		this.x=x;
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i++)
			System.out.println("Hello"+i+x);
		
	}
}
