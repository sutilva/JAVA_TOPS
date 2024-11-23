import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/send")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
		HttpSession sess = req.getSession();
		
		String e = req.getParameter("email");
		String p = req.getParameter("password");
		
		Model m = new Model();
		m.setEmail(e);
		m.setPassword(p);
		
		Model m2 = Dao.logincheck(m);
		
		if(m2!=null)
		{
			sess.setAttribute("mysession",true);
			sess.setAttribute("email", e);
			resp.sendRedirect("DashboardServlet");
			
		}
		else
		{
			out.print("Login Fail");
		}
		
	}
}