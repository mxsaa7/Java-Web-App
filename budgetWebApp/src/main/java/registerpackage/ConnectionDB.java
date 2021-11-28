package registerpackage;
import java.sql.*;

public class ConnectionDB {
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/budgetTracker", "CST2355", "CST2355Database" );

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}	

}
