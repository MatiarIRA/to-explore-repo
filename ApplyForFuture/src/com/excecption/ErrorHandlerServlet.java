package com.excecption;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ErrorHandlerServlet
 */
@WebServlet("/ErrorHandlerServlet")
public class ErrorHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorHandlerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
		String errorMessage = (String) request.getAttribute("javax.servlet.error.message");
		String requestURI = (String) request.getAttribute("javax.servlet.error.request_uri");
		String servletName = (String) request.getAttribute("javax.servlet.error.servlet_name");
		
		response.setContentType("text/html");
		
		request.setAttribute("statusCode", statusCode);
		request.setAttribute("errorMessage", errorMessage);
		request.setAttribute("requestURI", requestURI);
		request.setAttribute("servletName", servletName);
		
//		HttpSession session = request.getSession();
//		session.setAttribute("msgSession", "valueFromSession");
//		
//		getServletContext().setAttribute("msgAppContext", "valueFromAppContext");
		getServletContext().getRequestDispatcher("/exception.jsp").forward(request, response);
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
