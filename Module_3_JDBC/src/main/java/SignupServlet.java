import java.io.DataOutput;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("html/text");
		PrintWriter out = resp.getWriter();
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String byear = req.getParameter("byear");
		
		Model m = new Model();
		
		m.setFname(fname);
		m.setLname(lname);
		m.setEmail(email);
		m.setByear(byear);
		
		int status = Dao.insertdata(m);
		
		if(status > 0) {
			out.print("Success !!");
			resp.sendRedirect("ViewServlet");
		}
		else {
			out.print("Fail");
		}
		
	}

}
