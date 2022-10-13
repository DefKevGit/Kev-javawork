package arrays;
import java.util.Scanner;
public class ArrayUserInput 
{
	public static void main(String[] args) 
	{
		String [] city=new String[5];
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter names of the cities");
		for(int i=0;i<city.length;i++)
		{
			city[i]=scan.nextLine();
		}
		System.out.println("List of cities");
		for(int i=0;i<city.length;i++)
		{
			System.out.println(city[i]);
		}
		
		System.out.println("\n");
		//enhanced for loop array for loop
		for(String x:city)
		{
			System.out.println(x);
		}
	
		System.out.println("\n");
		int[] marks=new int[5];
		marks[0]=100;
		marks[1]=200;
		marks[2]=300;
		marks[3]=400;
		marks[4]=500;
		
		for(int x:marks)
		{
			System.out.println(x);
		}
		scan.close();
	}
}
