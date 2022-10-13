package calculator;
import java.util.Scanner;
public class Calculator 
{
	public static void main(String[] args)
	{
	    Float result;
	    boolean loop=true;
	    Scanner scan=new Scanner(System.in);
	    
		do 
		{
			System.out.println("\nPlease select an operation from the list below by entering a number key:\n1:Add\n2:Subtract\n3:Multiply\n4:Divide");
			String choice1=scan.next();
			boolean loop1=true;
			Scanner scan1=new Scanner(System.in);
			
			switch(choice1) 
			{
				case "1":
				Add add=new Add();
				add.add();
				do 
				{
					System.out.println("\nWould you like to perform another calculation?(Y/N)");
					String repeat=scan1.next();
					if(repeat.equalsIgnoreCase("Y")) 
					{
						loop1=false;
					}			
					else if(repeat.equalsIgnoreCase("N")) 
					{
						System.out.println("Thank you for using the calculator");
						scan.close();
						scan1.close();
						System.exit(0);
						
					}
					else
					{	
						System.out.println("Please press Y or N");
				    }
				}while(loop1==true);

				break;
			
			case "2":
				Subtract subtract=new Subtract();
				subtract.subtract();
				do 
				{
					System.out.println("\nWould you like to perform another calculation?(Y/N)");
					String repeat=scan1.next();
					if(repeat.equalsIgnoreCase("Y")) 
					{
						loop1=false;
					}			
					else if(repeat.equalsIgnoreCase("N")) 
					{
						System.out.println("Thank you for using the calculator");
						scan.close();
						scan1.close();
						System.exit(0);
						
					}
					else
					{	
						System.out.println("Please press Y or N");
				    }
				}while(loop1==true);
				break;
				
			case "3":
				Multiply multiply=new Multiply();
				multiply.multiply();
				
				
				do 
				{
					System.out.println("\nWould you like to perform another calculation?(Y/N)");
					String repeat=scan1.next();
					if(repeat.equalsIgnoreCase("Y")) 
					{
						loop1=false;
					}			
					else if(repeat.equalsIgnoreCase("N")) 
					{
						System.out.println("Thank you for using the calculator");
						scan.close();
						scan1.close();
						System.exit(0);
						
					}
					else
					{	
						System.out.println("Please press Y or N");
				    }
				}while(loop1==true);
				break;
				
			case "4":
				Divide divide=new Divide();
				divide.divide();
				do 
				{
					System.out.println("\nWould you like to perform another calculation?(Y/N)");
					String repeat=scan1.next();
					if(repeat.equalsIgnoreCase("Y")) 
					{
						loop1=false;
					}			
					else if(repeat.equalsIgnoreCase("N")) 
					{
						System.out.println("Thank you for using the calculator");
						scan.close();
						scan1.close();
						System.exit(0);
						
					}
					else
					{	
						System.out.println("Please press Y or N");
				    }
				}while(loop1==true);				
				break;
				
			default:
				System.out.println("You did not enter a valid selection");
				
			}
		
		}while(loop==true);
	}
}
