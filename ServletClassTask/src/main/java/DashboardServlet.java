import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();		
		
		HttpSession sess = req.getSession();
		
		
		
		String myEmail = (String) sess.getAttribute("myemail");		
		
		List<Model> list = Dao.viewMobile(myEmail);
		
				
		out.print("<p> Welcome to Dashboard</p>");
		out.print("<br>");
		out.print("<a href='LogoutServlet'> Logout </a>");
		out.print("<br>");
		out.print("<br>");
		out.print("<table border='1' cellpadding='5px' cellspacing='5px'>");
		out.print("<tr><th>Id</th><th>Mobile</th><th>Price</th><th>Description</th><th>Edit</th><th>Delete</th></tr>");
		//out.print("<tr><th>Id</th><th>Name</th><th>Surname</th><th>Email</th><th>Password</th><th>Edit</th><th>Delete</th></tr>");
		
		for(Model m2 : list)
		{
			
			out.print("<tr><td>"+m2.getId()+"</td><td>"+m2.getMobileName()+"</td><td>"+m2.getMobilePrice()+"</td><td>"+m2.getMobileDescription()+"</td><td><a href='EditServlet?id="+m2.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+m2.getId()+"'>Delete</a></td></tr>");
			
		}
		
		out.print("</table>");
		
		out.print("<br>");
		out.print("<br>");
		
		
		out.print("<a href='add.html'> Add Phone </a>");
		
	
		
		
		
		
		
	}
	
}