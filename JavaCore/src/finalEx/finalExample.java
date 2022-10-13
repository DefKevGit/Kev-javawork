package finalEx;

public class finalExample 
{
	final int x=100;
	final int y; //must be initialised OR in constructor.
	static final int big=555;
	public finalExample()
	{
		this.y=333;
		
	}
	
	public finalExample(int temp)
	{
		this.y=temp;
	}
	
	public finalExample(int a,int b)
	{
		b++;
		this.y=a;
	}
}
