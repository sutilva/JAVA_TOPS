<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="m" class="com.model.ContactModel"/>
<jsp:setProperty property="*" name="m"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		String option = request.getParameter("statusoption");
		String email = request.getParameter("email");		
	
		int status = Dao.updatequerystatus(option, email);
		
		if(status>0)
		{			
			response.sendRedirect("admincontacted.jsp");
		}
		else 
		{
			System.out.println("error");
		}
	
		
	%>
		


</body>
</html>