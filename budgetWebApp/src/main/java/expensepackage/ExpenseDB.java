package expensepackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ExpenseDB {
	
	
	public int UserExpense(UserExpense expense) throws ClassNotFoundException{
		
		
		String sql = "insert into expenses(id, firstname, amount, expense_type, expense_date) values (?,?,?,?,?)";
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/budgetTracker", "CST2355", "CST2355Database");
			
		PreparedStatement ps = con.prepareStatement(sql)){
		ps.setInt(1,1);	
		ps.setString(2, expense.getFirstname());
		ps.setString(3, expense.getAmount());
		ps.setString(4, expense.getType());
		ps.setString(5, expense.getDate());
		
		
		
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
