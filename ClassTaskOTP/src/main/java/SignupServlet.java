import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;
import java.util.Random;

import javax.mail.MessagingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	
	ServletContext context;
	
	String user, host, port, pass;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		
		Random random = new Random();
		
		int otp = 100000 + random.nextInt(900000);
		String otpString = String.valueOf(otp);
		
		String recp = req.getParameter("email");
		String subject = "Verify";
		String content = "OTP: "+ otpString;
		
		
		
		Model model = new Model();
		
		
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");		
		String confirmPassword = req.getParameter("confirmPassword");
		
		if(confirmPassword.equals(password)){
			
			
			session.setAttribute("fname", fname);
			session.setAttribute("lname", lname);
			session.setAttribute("email", email);
			session.setAttribute("password", password);
			session.setAttribute("myOTP", otpString);
		
		try 
		{
			EmailUtility.sendEmail(host, port, user, pass, recp, subject,content);
		}
		catch (MessagingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			out.print("<form action='SignupServlet2' method='post'>");
			out.print("<p>Enter OTP: <input type='text' name='otp'></p>");
			out.print("<p><input type='submit' value='Verify'></p>");
			out.print("</form>");
		
		}
		else {
			out.print("Password didn't match!! ");
			out.print("<br>");
			out.print("<a href='signup.html'> Sign-Up </a>");
		}
		
		
		
	}

}
