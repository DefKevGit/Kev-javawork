package calculator;

import java.util.Scanner;

public class Multiply 
{
	public void multiply()
	{
		float result;
		Scanner scan=new Scanner(System.in);
		System.out.println("Selection: Multiply (This will multiply one number by a second)\nPlease enter the first number");
		Float num5=scan.nextFloat();
		System.out.println("Please enter the second number:");
		Float num6=scan.nextFloat();
		result=num5*num6;
		System.out.println("\n"+num5+" * "+num6+" = "+result);
	}
}
