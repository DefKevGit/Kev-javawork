package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test 
{
	
	public static void main(String[] args) 
	{
		try 
		{
			String url="jdbc:mysql://localhost:3306/practise sql";
			String username="root";
			String password="pass";
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Established connection with server");
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong when connecting to server");
		}
	}
}
