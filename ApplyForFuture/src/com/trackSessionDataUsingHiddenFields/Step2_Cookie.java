package com.trackSessionDataUsingHiddenFields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Step2_Cookie
 */
@WebServlet("/Step2_Cookie")
public class Step2_Cookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Step2_Cookie() {
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
		Cookie guestData = new Cookie("guestName", guestName);
		//guestData.setMaxAge(1800);
		response.addCookie(guestData);
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Greeting</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Guest Name : " + guestName + "</p>");
		out.println("<form name='frm' action='Preview_Cookie' method='post'>");
		out.println("<p>Enter Email Id: <input type='email' name='email'/></p>");

		out.println("<input type='submit' name='btnPreview' value='Show Preview'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
