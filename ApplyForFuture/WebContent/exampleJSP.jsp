<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	request.setAttribute("title", "JSP to servlet");
%>


<%
	/* here we can put java code, that will be converted 
	to java servlet but we want to mix both
	we can use JSP as a layout to get view and we send data to it 
	JSP will be displayed to the client
	*/
	Object message = request.getAttribute("message");
	if(message != null ) {
%>
<%} %>

From session: ${msgSession}<br/>
From App context: ${msgAppContext}<br/>

<jsp.include page="/includes/footer.jsp"></jsp.include>