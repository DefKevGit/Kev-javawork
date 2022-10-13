package calculator;

import java.util.Scanner;

public class Subtract 
{
	public void subtract()
	{
		Scanner scan=new Scanner(System.in);
		float result;
		System.out.println("Selection: Subtract (This will subtract the second number from the first)\nPlease enter the first number");
		Float num3=scan.nextFloat();
		System.out.println("Please enter the second number:");
		Float num4=scan.nextFloat();
		result=num3-num4;
		System.out.println("\n"+num3+" - "+num4+" = "+result);
	}
}
