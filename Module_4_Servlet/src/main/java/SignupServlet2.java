import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SignupServlet2")
public class SignupServlet2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		
		session.getAttribute("myOTP");
		
		
		String userOTP = req.getParameter("otp");
		
		Model model = new Model();
		
		//Passing fname, lname, email, pass, otp from SignupServlet to SignupServlet2
		String sysOTP = (String) session.getAttribute("myOTP");		
		String fname = (String) session.getAttribute("fname");
		String lname = (String) session.getAttribute("lname");
		String email = (String) session.getAttribute("email");
		String password = (String) session.getAttribute("password");
		
		if(userOTP.equals(sysOTP)) {
			
			
			model.setFname(fname);
			model.setLname(lname);
			model.setEmail(email);
			model.setPassword(password);
			
			int status = Dao.insertdata(model);
			//Dao.insertdMobile(model2);
			
			if(status>0)
			{
				session.setAttribute("mysession",true);
				session.setAttribute("email", email);
				resp.sendRedirect("DashboardServlet");
				
			}
			else
			{
				out.print("fail");
			}
						
		}
		else {
			out.print("Fail Sign-up");
			out.print("<br> <a href= 'signup.html'> Sign-up </a>");
		}
	}
}
