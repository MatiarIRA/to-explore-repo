package com.trackSessionDataUsingHiddenFields;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Preview
 */
@WebServlet("/Preview")
public class Preview_HiddenForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Preview_HiddenForm() {
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
		out.println("<!Doctype HMTL>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Preview</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>Please confirm your information</h3>");
		
		out.println("<p>Guest Name : " + guestName + "</p>");
		out.println("<p>Email id : " + email + "</p>");
		out.println("<form name='frm' action='SaveData' method='post'>");
		out.println("<input type='hidden' name='guestName' value='" + guestName + "'/>");

		out.println("<input type='hidden' name='email' value='" + email + "'/>");

		out.println("<input type='submit' name='btnSave' value='Save Data'/>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
