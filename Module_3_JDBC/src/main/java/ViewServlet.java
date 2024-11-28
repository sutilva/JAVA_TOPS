import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RespectBinding;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		List<Model> list = Dao.viewdata();
		
		out.print("<p> View </p>");
		out.print("<br>");
		out.print("<a href='index.html'> Add </a>");
		out.print("<br>");
		out.print("<br>");
		out.print("<table border='1' cellpadding='5px' cellspacing='5px'>");
		out.print("<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>Email</th><th>Byear</th><th>Age</th><th>Edit</th><th>Delete</th></tr>");
		//out.print("<tr><th>Id</th><th>Name</th><th>Last Name</th><th>Email</th><th>Password</th><th>Edit</th><th>Delete</th></tr>");
		
		for(Model m2 : list)
		{
			
			out.print("<tr><td>"+m2.getId()+"</td><td>"+m2.getFname()+"</td><td>"+m2.getLname()+"</td><td>"+m2.getEmail()+"</td><td>"+m2.getByear()+"</td><td>"+m2.getAge()+"</td><td><a href='EditServlet?id="+m2.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+m2.getId()+"'>Delete</a></td></tr>");
			
		}
		
		out.print("</table>");		
		out.print("<br>");
		out.print("<br>");	
	}

}
