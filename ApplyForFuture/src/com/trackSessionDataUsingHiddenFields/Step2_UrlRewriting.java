package com.trackSessionDataUsingHiddenFields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Step2_UrlRewriting
 */
@WebServlet("/Step2_UrlRewriting")
public class Step2_UrlRewriting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Step2_UrlRewriting() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String guestName = request.getParameter("guestName");
		String email = request.getParameter("email");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Greeting</title>");
		out.println("</head>");
		out.println("<body>");
		// using queryString
		String queryString = "guestName=" + guestName + "&email=" + email;
		// 2 hyperlinks to navigate to Preview servlet and the other to navigate to save data servlet
		// update dynamically
		out.println("<a href='Preview_UrlRewriting?" + queryString + "'>Preview Data </a> &nbsp;"
				+ "<a href='SaveData?" + queryString + "'>Save Data </a>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
