package arrays;

import java.util.Scanner;

public class Array3 
{
	static String[] units={"","one", "two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String[] tens={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	static String thousand;
	static String hundred;
	
			
		public void array()
		{
		
			String[][] names = new String [9999] [4];
			for (int i=0; i<names.length;i++)
			{
				if((i+1)/1000>0)
					names[i][0]=units[(i+1)/1000]+" thousand";
				else {
					names[i][0]=units[(i+1)/1000];
				}
				if(((i+1)/100)%10>0)
					names[i][1]=units[((i+1)/100)%10]+" hundred";
				else {
					names[i][1]=units[((i+1)/100)%10];
				}
					
				
				names[i][2]=tens[((i+1)/10)%10];
				names[i][3]=units[((i+1)%10)];
				
				if(names[i][2]==tens[1])
				{	
					names[i][2]=units[(i%100)+1];
					names[i][3]="";
				}
				
			}
		    
		   //ystem.out.println(names[1020][0]+" "+names[1020][1]+" "+names[1020][2]+" "+names[1020][3]);
		  
		    System.out.println("\n");
		   System.out.println(names[9998][0]+" "+names[9998][1]+" "+names[9998][2]+" "+names[9998][3]);
		   System.out.println(names[1098][0]+" "+names[1098][1]+" "+names[1098][2]+" "+names[1098][3]);
		   //System.out.println(names[1009][0]+" "+names[1009][1]+" "+names[1009][2]+" "+names[1009][3]);
		   //System.out.println(names[1010][0]+" "+names[1010][1]+" "+names[1010][2]+" "+names[1010][3]);
		   System.out.println(names[998][0]+" "+names[998][1]+" "+names[998][2]+" "+names[998][3]);
		   System.out.println(names[98][2]+" "+names[98][3]);
		   //System.out.println(names[13][0]+" "+names[13][1]+" "+names[13][2]+" "+names[13][3]);
		   System.out.println(names[8][3]);
		   //System.out.println("\n");
		    
		    Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number from 1 - 9999");
			int selection=scan.nextInt();
			int selecti=selection-1;
			if(selection>998)
			{
				System.out.println(names[selecti][0]+" "+names[selecti][1]+" "+names[selecti][2]+" "+names[selecti][3]);
			}
			
			else if(selection>98 & selection<999)
			{
				System.out.println(names[selecti][1]+" "+names[selecti][2]+" "+names[selecti][3]);
		}
			else if(selection>8 & selection<99)
			{
				System.out.println(names[selecti][2]+" "+names[selecti][3]);
			}else
				
			{
				System.out.println(names[selecti][3]);
			}
					
	 }
	 	
}
