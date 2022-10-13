package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ReadRecords
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
			String query="select * from customers";
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String pass=rs.getString(3);
				String email=rs.getString(4);
				String add=rs.getString(5);
				int bal=rs.getInt(6);
				System.out.println("*** "+id+" **** "+name+" **** "+pass+" **** "+email+" **** "+add+" **** "+bal);
			}	
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong when connecting to server");
		}
		
    }
}