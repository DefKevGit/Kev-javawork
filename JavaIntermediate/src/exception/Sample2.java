package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample2 
{
	public static void main(String[] args) 
	{
		try
		{	int x=10;
			int y=0;// causes / 0 error
			int z=x/y;
			int[] nums=new int[5];
			nums[4]=200;// causes out of range error
			Connection con=DriverManager.getConnection("","","");// causes SQL error
		}
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | SQLException e) 
		{ 
			System.out.println(e.getMessage()); 
			System.out.println("We can not div a num by zero");
		}
		finally
		{
			System.out.println("This " +"FINALLY METHOD"+  " will ALWAYS be executed with try/ catch");
		}
	}
}