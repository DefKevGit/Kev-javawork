package exception;

public class Shopping 
{	//Handling the Exception -->take responsibility of fixing all the issues by itself
	public void addToCart()
	{
		try
		{
		String[] cart=new String[5];
		cart[5]="Mobile";
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
		
	//Declaring the Exception --> will pass the ownership to calling environment
	public void makePayment() throws Exception
	{
		int x=10;
		int y=0;
		int z=x/y;
	}
	
}
