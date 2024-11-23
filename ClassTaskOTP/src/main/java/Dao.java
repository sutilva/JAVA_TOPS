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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/otp_example","root","");

		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static int insertdata(Model m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into signup_otp (fname,lname,email,password) values (?,?,?,?)");
			
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());			
			ps.setString(4,m.getPassword());
			
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return status;
	}
	
	public static Model logincheck(Model m)
	{
		Model m2 = null;
		
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from signup_otp where email=? and password=?");
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String email = set.getString(4);				
				String password = set.getString(5);
			
				m2 = new Model();
				m2.setId(id);
				m2.setFname(fname);
				m2.setLname(lname);
				m2.setEmail(email);								
				m2.setPassword(password);
			}
			
			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;
		
	}
	
	public static List<Model> viewdata(String myemail) {
		Connection con = Dao.getconnect();
		ArrayList<Model> list = new ArrayList<>();
		
		try {
			PreparedStatement ps = con.prepareStatement("Select * from signup_otp where email=?");
			
			ps.setString(1, myemail);
			ResultSet set = ps.executeQuery();
			
			while(set.next()) {
				
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);				
				String email = set.getString(4);
				String password = set.getString(5);
				
				Model m = new Model();
				
				m.setId(id);
				m.setFname(fname);
				m.setLname(lname);				
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
