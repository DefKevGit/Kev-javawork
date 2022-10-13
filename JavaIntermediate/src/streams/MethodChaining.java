package streams;

public class MethodChaining 
{
	int x=10;
	public MethodChaining getObject()
	{
		return this;
	}
	
	public MethodChaining addToX(int y)
	{
		this.x=this.x+y;
		return this;
	}
	
	public int show()
	{
		return this.x;
	}
	
	public MethodChaining msg()
	{
		return this;
	}
}
