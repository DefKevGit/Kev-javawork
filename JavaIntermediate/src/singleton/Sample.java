package singleton;

public class Sample
{
	private static Sample x;
	
	private Sample() {}
    
	public static Sample getObjectSample()
	{
		if(x == null)
		{
			x = new Sample();
		}
		return x;
	}
	
	public void hello()
	{
		System.out.println("Hello");
	}
	
	public void hi()
	{
		System.out.println("Hi");
	}
}
