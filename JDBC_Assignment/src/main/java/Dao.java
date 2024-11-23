import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {

	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentcrud","root","");

		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	public static int insertdata(Model m) {
		
		int status = 0;
		Connection con = Dao.getconnect();
		
		try {
			PreparedStatement ps = con.prepareStatement("insert into studentinfo (fname, lname, age, email, password) values (?,?,?,?,?)");
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getAge());
			ps.setString(4, m.getEmail());
			ps.setString(5, m.getPassword());
			
			status = ps.executeUpdate();
			
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static List<Model> viewdata() {
		Connection con = Dao.getconnect();
		ArrayList<Model> list = new ArrayList<>();
		
		try {
			PreparedStatement ps = con.prepareStatement("Select * from studentinfo");
			ResultSet set = ps.executeQuery();
			
			while(set.next()) {
				
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String age = set.getString(4);
				String email = set.getString(5);
				String password = set.getString(6);
				
				Model m = new Model();
				
				m.setId(id);
				m.setFname(fname);
				m.setLname(lname);
				m.setAge(age);
				m.setEmail(email);
				m.setPassword(password);
				
				list.add(m);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
}
