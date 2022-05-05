package registerpackage;
import java.sql.*;

public class RegisterDB {
	
	
	public int registerUser(UserRegister user) throws ClassNotFoundException{
		
			
			String sql = "insert into users(id, firstname, lastname, email, username, passwd) values (?,?,?,?,?,?)";
			int result = 0;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_NAME", "USERNAME", "PASSWORD");
				
			PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1,1);	
			ps.setString(2, user.getFirstname());
			ps.setString(3, user.getLastname());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getUsername());
			ps.setString(6, user.getPassword());
			
			
			System.out.println(ps);
			result = ps.executeUpdate();
			
		}
		catch(Exception e) {
			System.out.println("Oops, there's been an error!");
			e.printStackTrace();
		}
		return result; 
		
	}
	

	

}
