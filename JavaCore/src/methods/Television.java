package methods;

public class Television 
{
	String brand;
	int price;
	int screensize;
	
	public void turnOn()
	{
		System.out.println("Shows display");
	}
	
	public int switchToChannel()
	{
		return 1;
	}
	
	public double getDiscount()
	{
		return (price*10/100);
	}
	
	public double discountOnBlackFriday(int dis)
	{
		System.out.println("");
		return (price*dis/100);
	}
	
	public double discountWithCityBank(int dis, int cityDiscount)
	{
		System.out.println("");
		int totalDiscount=dis+cityDiscount;
		return (price*(totalDiscount)/100);
	}
	
	
}
