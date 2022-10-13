package arrays;

import java.util.Scanner;

public class Array2 
{
		//THIS IS WHAt I DID! HOW DAFT! BECAUSE I DIDN'T UNDERSTAND ARRAYS!
		
		//Scanner scan=new Scanner(System.in);
		//boolean loop=true;
		//int valueAsInteger;
		//do
		//{
		//	System.out.println("Please enter a value from 10-99");
		//	valueAsInteger=scan.nextInt();
		//	if(valueAsInteger<10 | valueAsInteger >99)
		//	{
		//		System.out.println("You did not enter a number from 10-99\n");
		//	}
		//	else
		//	{
		//		loop=false;
		//	}
	//	}while(loop==true);
	//	String valueAsString=String.valueOf(valueAsInteger);
	//	System.out.println(valueAsString);
	//	String subString1 = valueAsString.substring(0,1);
	//	String subString2 = valueAsString.substring(1,2);
	//	int newValue1 = Integer.parseInt(subString1);
	//	int newValue2 = Integer.parseInt(subString2);
	//	System.out.println("Having taken your number and splitting the digits,\n we have "+newValue1+" and "+newValue2);
	//	System.out.println("Adding them together, we get "+(+newValue1+newValue2));
		
		
	    // I BELIEVE I WAS MEANT TO DO THIS!!! 
		public void array()
		{
		
			int[][] nums = new int [9999] [5];
			for (int i=0; i<nums.length;i++)
			{
				nums[i][0]=i+1;
				nums[i][1]=(i+1)/1000;
				nums[i][2]=((i+1)/100)%10;
				nums[i][3]=((i+1)/10)%10;
				nums[i][4]=(i+1)%10;
			}
		
		//***Testing values of the array at different locations to make sure it works!!***
		//System.out.println(nums[9998][0]+" "+nums[9998][1]+" "+nums[9998][2]+" "+nums[9998][3]+" "+nums[9998][4]);
		//System.out.println(nums[9876][0]+" "+nums[9876][1]+" "+nums[9876][2]+" "+nums[9876][3]+" "+nums[9876][4]);
		//System.out.println(nums[876][0]+" "+nums[876][1]+" "+nums[876][2]+" "+nums[876][3]+" "+nums[876][4]);
		System.out.println(nums[76][0]+" "+nums[76][1]+" "+nums[76][2]+" "+nums[76][3]+" "+nums[76][4]);
		//System.out.println(nums[6][0]+" "+nums[6][1]+" "+nums[6][2]+" "+nums[6][3]+" "+nums[6][4]);
		//System.out.println(nums[0][0]+" "+nums[0][1]+" "+nums[0][2]+" "+nums[0][3]+" "+nums[0][4]);
		
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number from 1 - 9999");
			int selection=scan.nextInt();
			if(nums[selection-1][0]<10)
			{
				System.out.println("The individual digits for "+nums[selection-1][0]+" are "+nums[selection-1][4]);
				System.out.println("The sum of the digits is "+(nums[selection-1][4]));
			}else if(nums[selection-1][0]<100)
			{
				System.out.println("The individual digits for "+nums[selection-1][0]+" are "+nums[selection-1][3]+" "+nums[selection-1][4]);
				System.out.println("The sum of the digits is "+(nums[selection-1][3]+nums[selection-1][4]));
			}else if(nums[selection-1][0]>99 & (nums[selection-1][0]<1000))
			{
				System.out.println("The individual digits for "+nums[selection-1][0]+" are "+nums[selection-1][2]+" "+nums[selection-1][3]+" "+nums[selection-1][4]);
				System.out.println("The sum of the digits is "+(nums[selection-1][2]+nums[selection-1][3]+nums[selection-1][4]));
			
			}else if(nums[selection-1][0]>999 & (nums[selection-1][0]<10000))
			{
				System.out.println("The individual digits for "+nums[selection-1][0]+" are "+nums[selection-1][1]+" "+nums[selection-1][2]+" "+nums[selection-1][3]+" "+nums[selection-1][4]);
				System.out.println("The sum of the digits is "+(nums[selection-1][1]+nums[selection-1][2]+nums[selection-1][3]+nums[selection-1][4]));
			
			}	
			System.out.println(nums[9998][0]);
		}
}	