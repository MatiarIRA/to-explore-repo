package com.ui.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userName");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");
		String country = request.getParameter("country");
		// String[] languages = request.getParameterValues("language");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<div>");
		out.println("<p>Username : " + username + "</p>");
		out.println("<p>Password : " + pw + "</p>");
		out.println("<p>Sex : " + gender + "</p>");
		out.println("<p>Hobbies : </p>");
		for (int i = 0; i < hobbies.length; i++) {
			out.println(hobbies[i] + "<br>");
		}
		out.println("<p>Country : " + country + "</p>");
		out.println("<p>Language : " + gender + "</p>");
//		out.println("<p>Languages : </p>");
//		for (int i = 0; i < languages.length; i++) {
//			out.println(languages[i] + "<br>");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>USING POST METHOD</h1>");
		doGet(request, response);
	}

}
