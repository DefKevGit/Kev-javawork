package serialization;

import java.io.Serializable;

public class Product implements Serializable //Marker interface (no method)
{
	public int prodId;
	public String name;
	public transient int price;
	public String brand;
	
	public Product(int prodiId, String name, int price, String brand) 
	{
		super();
		this.prodId = prodiId;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	
	
}
