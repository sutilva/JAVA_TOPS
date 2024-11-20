import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String confirmPassword = req.getParameter("confirmPassword");
		String phone = req.getParameter("phone");
		String mobileName1 = "iPhone 16";
		String mobilePrice1 = "90000";
		String mobileDescription1 = "Very expensive phone";
		
		Model model = new Model();
		Model model2 = new Model();
		
		if(confirmPassword.equals(password)){
			
			
			model.setName(name);
			model.setSurname(surname);
			model.setEmail(email);
			model.setGender(gender);
			model.setPhone(phone);
			model.setPassword(password);
			
			model2.setMobileName(mobileName1);
			model2.setMobilePrice(mobilePrice1);
			model2.setMobileDescription(mobileDescription1);
			model2.setEmail(email);
		}
		
		else {
			out.print("Password didn't match!! ");
			out.print("<br>");
			out.print("<a href='signup.html'> Sign-Up </a>");
		}
		
		int mStatus = Dao.insertdMobile(model2);
		int status = Dao.insertdata(model);
		//Dao.insertdMobile(model2);
		
		if(status>0 && mStatus >0)
		{
			resp.sendRedirect("DashboardServlet");
		}
		else
		{
			out.print("fail");
		}
		
		
	}

}
