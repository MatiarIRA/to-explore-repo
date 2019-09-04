package com.trackSessionDataUsingHiddenFields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Preview_UrlRewriting
 */
@WebServlet("/Preview_UrlRewriting")
public class Preview_UrlRewriting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Preview_UrlRewriting() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String guestName = request.getParameter("guestName");
		String email = request.getParameter("email");
		
//		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Preview</title>");
		out.println("</head>");
		out.println("<body>");		
		out.println("<p>Guest Name : " + guestName + "</p>");
		out.println("<p>Email id : " + email + "</p>");
		// using queryString
		String queryString = "guestName=" + guestName + "&email=" + email;
		// (we didn't write SaveData servlet) the reason of adding hyperlink in this servlet pages to remind that whenever we need
		// data across the servlet pages is mandatory to rewrite the URL dynamically with the required data
		out.println("<a href='SaveData?" + queryString + "'>Save Data </a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
