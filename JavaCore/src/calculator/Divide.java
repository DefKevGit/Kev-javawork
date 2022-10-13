package calculator;

import java.util.Scanner;

public class Divide 
{
	public void divide()
	{
		float result;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Selection: Divide (This will divide the first number by the second)\nPlease enter the first number");
		Float num7=scan.nextFloat();
		System.out.println("Please enter the second number:");
		Float num8=scan.nextFloat();
		result=num7/num8;
		System.out.println("\n"+num7+" / "+num8+" = "+result);
	}

}
