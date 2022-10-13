package shapes;

public class Circle extends Shape 
{
	float radius;

	public Circle(String colour,float radius) 
	{
		super(colour);
		this.radius=radius;
		System.out.println("Processing abstract class Circle Constructor\n");
		
	}	
		
		
		
	public void calculateArea() 
	{
		System.out.println(Math.PI*(radius*radius));
	}
}
