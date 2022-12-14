package exception;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Sample {

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
		catch (ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something is very wrong!! (divide by 0)");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something is very wrong!! (array)");
		}
		catch ( SQLException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something is very wrong!! (SQL)");
		}
		finally
		{
			System.out.println("This " +"FINALLY"+  "will ALWAYS be executed");
		}
		
	}

}
