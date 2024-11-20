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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classTask","root","");

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
			PreparedStatement ps = con.prepareStatement("insert into signup (name,surname,email,gender,phone,password) values (?,?,?,?,?,?)");
			
			ps.setString(1,m.getName());
			ps.setString(2,m.getSurname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getGender());
			ps.setString(5,m.getPhone());
			ps.setString(6,m.getPassword());
			
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
			PreparedStatement ps = con.prepareStatement("select * from signup where email=? and password=?");
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id = set.getInt(1);
				String name = set.getString(2);
				String surname = set.getString(3);
				String email = set.getString(4);
				String gender = set.getString(5);
				String phone = set.getString(6);
				String password = set.getString(7);
			
				m2 = new Model();
				m2.setId(id);
				m2.setName(name);
				m2.setSurname(surname);
				m2.setEmail(email);
				m2.setGender(gender);
				m2.setPhone(phone);				
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
	
	public static int insertdMobile(Model m) {
		
		int status = 0;
		Connection con = Dao.getconnect();
		
		
		try {
			PreparedStatement ps = con.prepareStatement("insert into mobileinfo (mobileName, mobilePrice, mobileDescription, email) values (?,?,?,?)");
			ps.setString(1,m.getMobileName());
			ps.setString(2,m.getMobilePrice());
			ps.setString(3,m.getMobileDescription());
			ps.setString(4,m.getEmail());
			
			status = ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return status;
	}
	
	public static List<Model>viewMobile(String myemail)
	{
		Connection con = Dao.getconnect();
		ArrayList<Model> list = new ArrayList<>();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from mobileinfo where email=?");
			
			ps.setString(1,myemail);			
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String mobileName = set.getString(2);
				String mobilePrice = set.getString(3);
				String mobileDescription = set.getString(4);
				
			
				Model m = new Model();
				m.setId(id);
				m.setMobileName(mobileName);
				m.setMobilePrice(mobilePrice);
				m.setMobileDescription(mobileDescription);
				
				
				list.add(m);
			}
			
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;	
		
	}
	
	public static Model editdata(int id)
	{
		Connection con = Dao.getconnect();
		Model m = null;
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from mobileinfo where id=?");
			
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			if(set.next())
			{
				int id1 = set.getInt(1);
				String mobileName =set.getString(2);
				String mobilePrice = set.getString(3);
				String mobileDescription = set.getString(4);
				
			
				 m = new Model();
				m.setId(id1);
				m.setMobileName(mobileName);
				m.setMobilePrice(mobilePrice);
				m.setMobileDescription(mobileDescription);
				
			}
			
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
		
		
	}
	
	public static int updatedata(Model m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("update mobileinfo set mobileName=?,mobilePrice=?,mobileDescription=? where id=?");
			
			ps.setString(1,m.getMobileName());
			ps.setString(2,m.getMobilePrice());
			ps.setString(3,m.getMobileDescription());			
			ps.setInt(4,m.getId());
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return status;
	}
	
	public static int deletedata(int id)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("delete from mobileinfo where id=?");
			
			ps.setInt(1,id);
			
			
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return status;
	}
	
	

}
