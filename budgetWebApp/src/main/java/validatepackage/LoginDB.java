package validatepackage;

import java.sql.*;


public class LoginDB {
	
	public boolean validateUser(UserLogin user) throws ClassNotFoundException{
			
			boolean status = false;		
	
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/budgettracker", "CST2355", "CST2355Database");
					
				PreparedStatement ps = connection.prepareStatement("select * from users where username = ? AND passwd = ? ")){
					ps.setString(1, user.getUsername());
					ps.setString(2, user.getPassword());
					ResultSet rs = ps.executeQuery();
					System.out.println(ps);
					status = rs.next();
				}
			
			catch(SQLException e){
				printSQLException(e);
			}
			return status;
		}

	private void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}

}
