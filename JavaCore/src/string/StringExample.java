package string;

import java.util.Scanner;

public class StringExample 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		//String exampleString1= "This is the first example";
		System.out.println("Please enter something: ");
		String exampleString1=scan.nextLine();
		int example1Length = exampleString1.length();
		System.out.println("The length of the string is "+example1Length);
	 
	 
		String exampleString2= "Any old rubbish";
		String exampleString3= "old";
		String exampleString4= "not";
	 
	 
	 
		System.out.println(exampleString2.substring(0,3));
		System.out.println(exampleString2.substring(4,7));
		System.out.println(exampleString2.substring(8,15));
	 
		System.out.println(exampleString2.substring(8,15));
		System.out.println(exampleString2.substring(4,7));
		System.out.println(exampleString2.substring(0,3));
		System.out.println(exampleString2.contains(exampleString3));
		System.out.println(exampleString2.contains(exampleString4));
		scan.close();
	 }	
}
