import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String age = req.getParameter("age");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Model m = new Model();
		
		m.setFname(fname);
		m.setLname(lname);
		m.setAge(age);
		m.setEmail(email);
		m.setPassword(password);
		
		int status = Dao.insertdata(m);
		
		if(status > 0) {
			resp.sendRedirect("ViewServlet");
		}
		else {
			out.print("Fail");
		}
	}
	

}
