package userDefinedException;

public class Election 
{
	public void checkEligibiliy(int age,int age2) throws InvalidAgeException
	{
		if(age<18)
		{	
			throw new InvalidAgeException("You should be min age 18");
		}
		
		else
		{	
			System.out.println(" Please cast your vote");
		}
		
		if(age2<18)
		{	
			throw new InvalidAgeException("You should be min age 18");
		}
		else
		{	
			System.out.println(" Please cast your vote");
		}	
	}
}
