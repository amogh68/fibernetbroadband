package nvidia.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ConnectionJDBC {

	Connection c;
	Statement s;
	
	public ConnectionJDBC() 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/fibernetbroadband","root","root");
			s = c.createStatement();
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	}
	
	
	  public Connection getConnection() {
	        return c;
	    }
}