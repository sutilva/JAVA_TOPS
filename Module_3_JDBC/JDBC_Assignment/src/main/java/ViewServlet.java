import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet { 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		List<Model> list = Dao.viewdata();
		
		
		try {
			out.print("<center>");
			
			out.print("<a href='index.html'>Add Data</a>");
			out.print("<br>");
			out.print("<br>");
			out.print("<br>");
			out.print("<table border='1' cellpadding='5px' cellspacing='5px'>");
			out.print("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Age</th><th>Email</th><th>Password</th><th>Edit</th><th>Delete</th></tr>");
			
			for(Model m : list)
			{
				
				out.print("<tr><td>"+m.getId()+"</td><td>"+m.getFname()+"</td><td>"+m.getLname()+"</td><td>"+m.getAge()+"</td><td>"+m.getEmail()+"</td><td>"+m.getPassword()+"</td><td><a href='EditServlet?id="+m.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+m.getId()+"'>Delete</a></td></tr>");
				
			}
			
			out.print("</table>");
			out.print("</center>");
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			out.close();
		}
		
		
	}

}
