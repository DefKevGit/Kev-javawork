package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) 
	{

		try 
		{
			String url = "jdbc:mysql://localhost:3306/practise sql";
			String username = "root";
			String password = "pass";
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Established connection with server");

			String query = "Insert into customers values(107, 'Kev','1245', 'kev@gmail.com','Teignmouth',15000)";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("One recored inserted successfully");

		}

		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong when connecting to server");
		}
		
	}
	
}
