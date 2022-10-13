package methodOverLoading;

public class Sample
{
 //method-overloading is when we have more than one method with the same name but
 //differ in terms of : number of args, data of args, order of args
	public void sum(int x,int y)
    {
    }
	
	public void sum(float x,float y) 
	{
	}
	
	public void sum(int x,float y)
	{}
	
	public void sum(float y, int x)
	{}
	
	public void sum(double x,double y, double z)
	{}
	
	public void sum(int x,int y, int z)
	{}
	
	
	
}
