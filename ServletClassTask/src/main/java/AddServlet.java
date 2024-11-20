import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		HttpSession sess = req.getSession();
		
		String myEmail = (String) sess.getAttribute("myemail");
		
		String mobileName1 = req.getParameter("mobileName");
		String mobilePrice1 = req.getParameter("mobilePrice");
		String mobileDescription1 = req.getParameter("mobileDescription");
		
		Model model = new Model();
		
		
		model.setMobileName(mobileName1);
		model.setMobilePrice(mobilePrice1);
		model.setMobileDescription(mobileDescription1);
		model.setEmail(myEmail);
		
		int status = Dao.insertdMobile(model);
		
		if(status>0) {
			out.print("Success");
			resp.sendRedirect("DashboardServlet");
		}
		else {
			out.print("Fail");
		}
		
	}

}
