<%@page import="com.dao.Dao"%>
<%@page import="com.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

	<style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 2px solid #ccc;
        }
        th, td {
            padding: 15px;
            text-align: left;
        }
        img {
            max-width: 100px;
            max-height: 100px;
        }
        .swd-button {
            background: #f2db18;
            border: 1px solid white;
            border-radius: 5px;
            color: white;
            font: bold 12px Arial, Helvetica, sans-serif;
            padding: 10px 15px;
            text-decoration: none;
            text-transform: uppercase;
            margin-top: 15px;
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
    if(session.getAttribute("projectadmin") != null) {
%>

    <jsp:include page="header.jsp"/>

    <table>
        <thead>
            <tr>
                 
                <th>Product Name</th>
                <th>Product Price</th>
                <th>Product Description</th>
                <th>Actions</th>
                
            </tr>
        </thead>
        <tbody>
            <%
                List<ProductModel> list = Dao.viewproducts();
                for (ProductModel m : list) {
            %>
            <tr>
                
                <td><%= m.getP_name() %></td>
                <td><%= m.getP_price() %></td>
                <td><%= m.getP_des() %></td>
                <td>
                    <form action="" method="get">
                        <input type="hidden" name="id" value="<%= m.getId() %>">
                        <input type="submit" class="swd-button" value="Edit">
                    </form>
                    <form action="" method="get">
                        <input type="hidden" name="id" value="<%= m.getId() %>">
                        <input type="submit" class="swd-button" value="Remove">
                    </form>
                </td>
            </tr>
            <%
                }
            %>
        </tbody>
    </table>

<%
    } else {
        response.sendRedirect("admindashboard.jsp");
    }
%>

    <jsp:include page="footer.jsp"/>

</body>
</html>
