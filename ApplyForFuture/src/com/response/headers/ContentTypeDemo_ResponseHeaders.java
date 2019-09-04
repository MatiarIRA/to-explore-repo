package com.response.headers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContentTypeDemo_ResponseHeaders
 */
@WebServlet("/ContentType")
public class ContentTypeDemo_ResponseHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContentTypeDemo_ResponseHeaders() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/vnd.ms-excel");
		PrintWriter out= response.getWriter();
		
		out.println("Rno\tName\tMaths\tPhys\tComputer Sc\tTotal");
		out.println("101\tSekhar\t90\t90\t90\t=SDM(B2:D2");
		out.println("102\tSrinivasan\t95\t95\t95\t=SDM(B2:D2");


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
