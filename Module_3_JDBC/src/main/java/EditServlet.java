import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		Model m = Dao.editdata(id2);
		
		out.print("<form action ='EditServlet2' method='post'>");
		
		
		out.print("<p>");
		out.print("<input type='hidden' name='id' value='"+m.getId()+"'/>");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<label>Enter First Name: </label>");
		out.print("<input type='text' name='fname' value='"+m.getFname()+"'/>");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<label>Enter Last Name: </label>");
		out.print("<input type='text' name='lname' value='"+m.getLname()+"'/>");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<label>Enter Email: </label>");
		out.print("<input type='email' name='email' value='"+m.getEmail()+"'/>");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<label>Enter Birth Year: </label>");
		out.print("<input type='text' name='byear' value='"+m.getByear()+"'/>");
		out.print("</p>");
		
		out.print("<p>");
		out.print("<input type='submit' value='Edit'/>");
		out.print("</p>");
		
		out.print("</form>");
	}

}
