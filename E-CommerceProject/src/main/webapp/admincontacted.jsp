<%@page import="com.model.ContactModel"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.ProductModel"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Admin Panel</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Custom CSS -->
 
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <!-- Custom CSS -->
  <style>
    /* Add custom styles here */
    body {
      background-color: #f4f4f4;
    }
    .sidebar {
      background-color: #343a40;
      color: white;
      height: 100vh;
    }
    .content {
      padding: 20px;
    }
  </style>

  
</head>
<body>

	<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>

<%
	if(session.getAttribute("projectadmin")!=null)
	{
		
	
	

%>
  
    <div class="row">
      <!-- Sidebar -->
      <div class="col-md-3 col-lg-2 sidebar">
        <div class="pt-3">
          <h2>Admin Panel</h2>
          
          
          
          <ul class="nav flex-column mt-3">
            <li class="nav-item">
              <a class="nav-link" href="adminaddproducts.jsp" style="color: white;">Add Products</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="adminviewproducts.jsp" style="color: white;">View All Products</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="adminplacedorder.jsp" style="color: white;">Placed Order</a>
            </li>
             <li class="nav-item">
              <a class="nav-link" href="admincontacted.jsp" style="color: white;">Queries</a>
            </li>
             <li class="nav-item">
              <a class="nav-link" href="adminlogout.jsp" style="color: red;">Logout</a>
            </li>
            
          </ul>
        </div>
      </div>

      <!-- Main Content -->
      <div class="col-md-9 col-lg-10 content">
       
        <h2>Welcome to the Admin Panel</h2>
       	  <table class="scroll table table-bordered  " style="background-color:#343a40; color: white; ">
         <thead>
            <th>Fullname</th>
			<th>Email</th>
			<th>Query</th>
			<th colspan="2">Actions</th>
			<!-- <th>Product Image</th>
			<th colspan="2"><b>Actions</b></th> -->
         </thead>
         <tbody >
           <%
			List<ContactModel> list = Dao.viewcontactquery();
			for(ContactModel m : list)
			{
				
				String data = m.getStatus();//Pending
				String data2="";
				if(data.equals("Pending"))
				{
					data2 = "resolved";
				}
				else
				{
					data2 = "Pending";
				}
				
			%>
			<tr>			
				<form action="updatequerystatus.jsp" method="post">
				</td><td><%=m.getFullname() %></td><td><%=m.getEmail() %></td><td><%=m.getQuery() %></td><td>
				
				<select name="statusoption">
					<option value="<%=data%>"><%=data%></option>
					<option value="<%=data2%>"><%=data2%></option>					
				</select>
				
				<input type="hidden" name="id" value="<%=m.getId() %>">
				<input type="submit" value="update">				
				</td>	
				</form>
			</tr>	
			
			<%
				}
			%>
         </tbody>
      </table>
      <%
		}
		else
		{
			response.sendRedirect("adminlogin.jsp");
		}
      %> 	 
       
      </div>
    </div>
  </div>
 <div class="container ">
     
   </div>

</body>
</html>
    