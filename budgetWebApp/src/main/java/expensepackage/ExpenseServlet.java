package expensepackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ExpenseServlet
 */
@WebServlet("/expenses")
public class ExpenseServlet extends HttpServlet {
	ExpenseDB expenseDB = new ExpenseDB();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExpenseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("expense.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		String firstname = request.getParameter("fname");
		String amount = request.getParameter("amount");
		String type = request.getParameter("type");
		String date = request.getParameter("date");

		
		UserExpense expense = new UserExpense();
		expense.setFirstname(firstname);
		expense.setAmount(amount);
		expense.setType(type);
		expense.setDate(date);
		
		try {
			expenseDB.UserExpense(expense);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		response.sendRedirect("expense.jsp");
		
	}

}
