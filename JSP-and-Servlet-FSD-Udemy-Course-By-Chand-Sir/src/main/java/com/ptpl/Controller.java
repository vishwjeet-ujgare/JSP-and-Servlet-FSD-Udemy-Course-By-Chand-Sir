package com.ptpl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String param = request.getParameter("page");
		System.out.println(param);
		

		switch (param) {
		case "L238":
			getServletContext().getRequestDispatcher("/com/ptpl/section20/L238/Basic_Application_On_MVC/indexL238.jsp")
					.forward(request, response);
			break;
		case "L238-login":
			getServletContext().getRequestDispatcher("/com/ptpl/section20/L238/Basic_Application_On_MVC/login.jsp")
					.forward(request, response);
			break;
		case "L238-signUp":
			getServletContext().getRequestDispatcher("/com/ptpl/section20/L238/Basic_Application_On_MVC/signUp.jsp")
					.forward(request, response);
			break;
		case "L238-about":
			getServletContext().getRequestDispatcher("/com/ptpl/section20/L238/Basic_Application_On_MVC/about.jsp")
					.forward(request, response);
			break;
		case "L238-logedIn":
//			 // Retrieve the username and password from the request parameters
		    String username = request.getParameter("username");
		    String password = request.getParameter("password");
		    
		      // Redirect the user to the "loggedIn" page
//		      response.sendRedirect(request.getContextPath() + "/com/ptpl/section20/L238/Basic_Application_On_MVC/logedIn.jsp");
			getServletContext().getRequestDispatcher("/com/ptpl/section20/L238/Basic_Application_On_MVC/logedIn.jsp").forward(request, response);
			break;
		default:
			getServletContext().getRequestDispatcher("/com/ptpl/section20/L238/Basic_Application_On_MVC/notFound.jsp")
			.forward(request, response);
		}

	}

}
