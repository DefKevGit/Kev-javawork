package shapes;

public class Square extends Shape 
{
	float sideLength;

	public Square(String colour,float sideLength) 
	{
		super(colour);
		this.sideLength=sideLength;
		System.out.println("Processing abstract class Square Constructor\n");
	}	
		
	public void calculateArea() 
	{
		System.out.println(sideLength*sideLength);
	}
}
