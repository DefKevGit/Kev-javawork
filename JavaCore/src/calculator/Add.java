package calculator;
import java.util.Scanner;

public class Add 
{
	public void add()
	{
		float result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Selection: Add (This will add one number to a second)\nPlease enter the first number");
		Float num1=scan.nextFloat();
		System.out.println("Please enter the second number:");
		Float num2=scan.nextFloat();
		result=num1+num2;
		System.out.println("\n"+num1+" + "+num2+" = "+result);
		
	}
}
