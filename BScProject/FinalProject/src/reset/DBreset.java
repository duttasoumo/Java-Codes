package reset;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBreset {
	
	public static void reset() throws SQLException{
		Connection con=connection_MySQL.ConnectionClass.dbcon();
		Statement state=con.createStatement();
		state.addBatch("truncate h2;");
		state.addBatch("truncate h3;");
		state.addBatch("truncate l2;");
		state.addBatch("truncate l3;");
		state.addBatch("truncate resset;");
		state.addBatch("truncate transaction;");
		state.addBatch("alter table transaction AUTO_INCREMENT=1000;");
		state.addBatch("DROP VIEW IF exists l1;");
		state.addBatch("update c1 set sup_count=0;");
		state.executeBatch();
		state.close();
		con.close();
		
	}
}
