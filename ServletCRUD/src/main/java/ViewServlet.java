import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter  out = resp.getWriter();
		
		List<Model> list = Dao.viewdata();
		
		
		try {
            // HTML content
            out.println("<!DOCTYPE html>");
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("<title>Database Records</title>");
            out.println("<style>");
            out.println("h1 { font-size: 30px; color: #fff; text-transform: uppercase; font-weight: 300; text-align: center; margin-bottom: 15px; }");
            out.println("table { width: 100%; table-layout: fixed; }");
            out.println(".tbl-header { background-color: rgba(255,255,255,0.3); }");
            out.println(".tbl-content { height: 300px; overflow-x: auto; margin-top: 0px; border: 1px solid rgba(255,255,255,0.3); }");
            out.println("th { padding: 20px 15px; text-align: left; font-weight: 500; font-size: 12px; color: #fff; text-transform: uppercase; }");
            out.println("td { padding: 15px; text-align: left; vertical-align: middle; font-weight: 300; font-size: 12px; color: #fff; border-bottom: solid 1px rgba(255,255,255,0.1); }");
            out.println("@import url('https://fonts.googleapis.com/css?family=Roboto:400,500,300,700');");
            out.println("body { background: linear-gradient(to right, #25c481, #25b7c4); font-family: 'Roboto', sans-serif; }");
            out.println("section { margin: 50px; }");
            out.println(".made-with-love { margin-top: 40px; padding: 10px; text-align: center; font-size: 10px; font-family: arial; color: #fff; }");
            out.println(".made-with-love i { font-style: normal; color: #F50057; font-size: 14px; position: relative; top: 2px; }");
            out.println(".made-with-love a { color: #fff; text-decoration: none; }");
            out.println(".made-with-love a:hover { text-decoration: underline; }");
            out.println("::-webkit-scrollbar { width: 6px; }");
            out.println("::-webkit-scrollbar-track { -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); }");
            out.println("::-webkit-scrollbar-thumb { -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");

            // Section for the fixed table header
            out.println("<section>");
            out.println("<h1>Records</h1>");
            out.println("<div class='tbl-header'>");
            out.println("<table cellpadding='0' cellspacing='0' border='0'>");
            out.println("<thead>");
            out.println("<tr><th>Id</th><th>Name</th><th>Surname</th><th>Email</th><th>Password</th><th>Edit</th><th>Delete</th><th><a href='index.html'>Add Data</a></th></tr>");
            out.println("</thead>");
            out.println("</table>");
            out.println("</div>");
            out.println("<div class='tbl-content'>");
            out.println("<table cellpadding='0' cellspacing='0' border='0'>");
            out.println("<tbody>");

            // Table data rows
            for(Model m : list)
    		{
    			
    			out.print("<tr><td>"+m.getId()+"</td><td>"+m.getName()+"</td><td>"+m.getSurname()+"</td><td>"+m.getEmail()+"</td><td>"+m.getPassword()+"</td><td><a href='EditServlet?id="+m.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+m.getId()+"'>Delete</a></td><td></td></tr>");
    			
    		}

            out.println("</tbody>");
            out.println("</table>");
            out.println("</div>");
            out.println("</section>");

            

            // JS for handling table scroll width adjustment
            out.println("<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>");
            out.println("<script>");
            out.println("$(window).on('load resize', function() {");
            out.println("  var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();");
            out.println("  $('.tbl-header').css({'padding-right': scrollWidth});");
            out.println("}).resize();");
            out.println("</script>");

            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
	}

}
