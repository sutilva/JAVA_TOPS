import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String mobileName = req.getParameter("mobileName");
		String mobilePrice = req.getParameter("mobilePrice");
		String mobileDescription = req.getParameter("mobileDescription");
		
		
		Model m = new Model();
		m.setId(id2);
		m.setMobileName(mobileName);
		m.setMobilePrice(mobilePrice);
		m.setMobileDescription(mobileDescription);
		
		
		int status = Dao.updatedata(m);
		
		if(status>0)
		{
			resp.sendRedirect("DashboardServlet");
		}
		else
		{
			out.print("fail");
		}
		
		
	}
}