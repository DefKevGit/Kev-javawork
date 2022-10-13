package userDefinedException;

public class CheckCC 
{
	public void check(String ccYes,String ccNo) throws CreditCardException
	{
		if(ccYes.length()!=16)
		{
			throw new CreditCardException("Invalid credit card");
		}	
			else
				System.out.println("Payment completed");
		
		if(ccNo.length()!=16)
		{
			throw new CreditCardException("Invalid credit card");
		}	
			else
				System.out.println("Payment completed");
		
	}
}
