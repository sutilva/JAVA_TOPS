<%@page import="com.dao.Dao"%>
<%@page import="com.model.SignupModel"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>
	
	<jsp:include page="header.jsp"/>
	
	
	<%
				
		String name = session.getAttribute("myname").toString();
		String email = session.getAttribute("myemail").toString();
		String phone = session.getAttribute("myphone").toString();
		
		SignupModel m = new SignupModel();
		m.setFullname(name);
		m.setEmail(email);
		m.setPhone(phone);
	
	%>
	
		<p class="text-center">
			<label><%= m.getFullname() %></label>	
		</p>
		
		<p class="text-center">
			<label><%= m.getEmail() %></label>	
		</p>
		
		<p class="text-center">
			<label><%= m.getPhone() %></label>	
		</p>
	
	
	<jsp:include page="footer.jsp"/>

</body>
</html>