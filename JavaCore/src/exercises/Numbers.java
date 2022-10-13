package exercises;

import java.util.stream.IntStream;

import java.util.Scanner;

public class Numbers 
{
	public static void main(String[] args) 
	{
		boolean loop=true;
		
		do
		{	
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter a number between 10-99 ");
			int number=scan.nextInt();
			if(number<10 || number>99 )
			{
				System.out.println("you did not make a valid selection");
			}
			else
			{
				loop=false;
			}
		}while(loop==true);
		
		
		
		
		
	}

}
