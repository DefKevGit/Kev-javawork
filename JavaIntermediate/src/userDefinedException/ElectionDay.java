package userDefinedException;

public class ElectionDay 
{
	public static void main(String[] args) 
	{
		Election obj=new Election();
		try
		{
			obj.checkEligibiliy(18,16);// age set to less than 18 causes invalid age exception
		}
		catch (InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
		CheckCC obj1=new CheckCC();
		try
		{
			obj1.check("1234567891234567","123456789123");// credit card number has more than 16 characters so throws exception
		}
		catch (CreditCardException e)
		{
			System.out.println(e.getMessage());
		}
	}
		
}
