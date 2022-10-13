package shapes;

public class Triangle extends Shape 
{
	float base;
	float height;

	public Triangle(String colour,float base, float height) 
	{
		super(colour);
		this.base=base;;
		this.height=height;
		System.out.println("Processing abstract class Triangle Constructor\n");
	}	
		
	public void calculateArea() 
	{
		System.out.println(((base*height)/2));
	}
}
