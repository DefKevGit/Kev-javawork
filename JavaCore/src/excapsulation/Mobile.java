package excapsulation;

public class Mobile 
{
	private String brand;
	private int ram;
	private String colour;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		if(ram>12) 
		{
			System.out.println("Invalid RAM size!");
		
		}else
		{
			this.ram=ram;}
		}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}
	