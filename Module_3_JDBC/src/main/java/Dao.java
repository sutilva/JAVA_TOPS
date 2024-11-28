/*
 * Creating Procedure "CalculateAge"
 * 
 * 
 * DELIMITER $$

CREATE PROCEDURE CalculateAge(IN birth_year INT, OUT age INT)
BEGIN
    DECLARE current_year INT;
    
    -- Get the current year
    SET current_year = 2024;
    
    -- Calculate the age
    SET age = current_year - byear;
    
    
END $$

DELIMITER ;


 *	Creating Trigger to store calculated age in column "age"
 *
 * DELIMITER $$

CREATE TRIGGER before_insert_user
BEFORE INSERT ON callable_statement (table_name)
FOR EACH ROW
BEGIN
    DECLARE current_year INT;

    -- Get the current year
    SET current_year = 2024;

    -- Calculate the age and store it in the 'age' column
    SET NEW.age = current_year - NEW.byear;
END $$

DELIMITER ;

 */




import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	
	public static Connection getconnect() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/module_3","root","");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return con;
	}


	public static int insertdata (Model m) {
		
		int status = 0;
		Connection con = Dao.getconnect();
		
		try {
			
			PreparedStatement ps = con.prepareStatement("insert into callable_statement (fname,lname,email,byear) values (?,?,?,?)");
			
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getByear());
			
			status = ps.executeUpdate();
			
			CallableStatement cs = con.prepareCall("{CALL CalculateAge(?,?)}");
			int intByear = Integer.parseInt(m.getByear());
			
			cs.setInt(1, intByear);
			
			cs.registerOutParameter(2, Types.INTEGER);
			
			cs.execute();			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public static List<Model> viewdata() {
		Connection con = Dao.getconnect();
		ArrayList<Model> list = new ArrayList<>();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from callable_statement");
			ResultSet set = ps.executeQuery();
			
			while(set.next()) {
				
			int id = set.getInt(1);
			String fname = set.getString(2);
			String lname = set.getString(3);
			String email = set.getString(4);
			String byear = set.getString(5);
			String age = set.getString(6);
			
			Model m = new Model();
			
			m.setId(id);
			m.setFname(fname);
			m.setLname(lname);
			m.setEmail(email);
			m.setByear(byear);
			m.setAge(age);
			
			list.add(m);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static Model editdata(int id) {
		
		Connection con = Dao.getconnect();
		Model m = null;
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from callable_statement where id=?");
			ps.setInt(1, id);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next()) {
				
				int id1 = set.getInt(1);
				String fname =set.getString(2);
				String lname = set.getString(3);
				String email = set.getString(4);
				String byear = set.getString(5);
				String age = set.getString(6);
				
			
				m = new Model();
				m.setId(id1);
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				m.setByear(byear);
				m.setAge(age);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return m;
	}
	
	public static int updatedata(Model m)
	{
		int status = 0;
		Connection con = Dao.getconnect();
		
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("update callable_statement set fname=?,lname=?,email=?,byear=? where id=?");
			
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getByear());
			ps.setInt(5,m.getId());
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
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
			PreparedStatement ps = con.prepareStatement("delete from callable_statement where id=?");
			
			ps.setInt(1,id);
			
			
			status = ps.executeUpdate();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return status;
	}
}