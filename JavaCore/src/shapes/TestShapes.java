package shapes;


public class TestShapes 
{
	public static void main(String[] args) 
	{
		Triangle t=new Triangle("green", 4,8 );
		Square s=new Square("blue", 7);
		Circle c=new Circle("red",10);
		
		
		System.out.println("\nI am a "+t.colour+" triangle and my surface area is ");
		t.calculateArea();
		System.out.println("\nI am a "+s.colour+" square and my surface area is ");
		s.calculateArea();
		System.out.println("\nI am a "+c.colour+" circle and my surface area is ");
		c.calculateArea();
	}
}