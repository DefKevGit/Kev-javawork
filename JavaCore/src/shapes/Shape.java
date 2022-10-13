package shapes;

public abstract class Shape 
{
	String colour;
	public Shape (String colour)
	{
		this.colour=colour;
		System.out.println("Processing abstract class Shape Constructor\n");
	}
	public abstract void calculateArea();
}
