package validatepackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	HttpSession session;
	private static final long serialVersionUID = 1L;
	
	private LoginDB loginDB = new LoginDB();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserLogin user = new UserLogin();
		user.setUsername(username);
		user.setPassword(password);
		
		try {
			if (loginDB.validateUser(user)) {
				session = request.getSession();
				session.setAttribute("username", user.getUsername());
				session.setAttribute("password", user.getPassword());
				RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
				dispatcher.forward(request, response);
			}
			else {
				response.sendRedirect("login-redirect.jsp");
			}
			
		} catch (ClassNotFoundException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
