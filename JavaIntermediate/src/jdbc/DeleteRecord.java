package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord 
{
	public static void main(String[] args) 
	{

		try 
		{
			String url = "jdbc:mysql://localhost:3306/practise sql";
			String username = "root";
			String password = "pass";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Established connection with server");

			String query="delete from customers where cust_id=107";
			
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("One recored deleted successfully");

		}

		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong when connecting to server");
		}
		
	}
}
