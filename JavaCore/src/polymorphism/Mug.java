package polymorphism;

public class Mug 
{
	public void addLiquid(Liquid x)
	{
		if(x instanceof Milk)
		{
			System.out.println("Swirling Milk.");
		}else if(x instanceof Tea)
		{
			System.out.println("Swirling Tea");
		}else if (x instanceof Coffee)
		{
			System.out.println("Swirling Coffee");
		}else if (x instanceof Juice)
		{
			System.out.println("Swirling Juice");
		}
		else
			System.out.println("Swirling some liquid");
		
	}
}