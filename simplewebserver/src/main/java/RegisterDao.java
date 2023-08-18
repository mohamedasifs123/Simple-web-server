import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RegisterDao {
	
	private String dburl="jdbc:mysql://localhost:3306/asif";
	private String dbuname="root";
	private String dbpas="asif";
	private String dod="con.mysql.jdbc.Driver";
	 
	private Connection getConnection()
	{
		Connection con=null;
		
		try {
			DriverManager.getConnection(dburl, dbuname, dbpas);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
		
		 
	}
	
	public String insert() {
		
		
		
	}
	

}
