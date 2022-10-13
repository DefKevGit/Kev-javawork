package listOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Product 
{
	private String name;
	private int price;
	private int quantity;
	private String brand;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void getProduct(ArrayList<Product> list)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a name");
		String findName=scan.nextLine();
		for (int i=0;i<list.size();i++)
		{
			if(list.get(i).name.equals(findName))
			{
				System.out.println(list.get(i));
			}
		}
		
	}
	
	public Product() {}
	
	public Product(String name, int price,int quantity,String brand)
	{
		super();
		this.name= name;
		this.price= price;
		this.quantity= quantity;
		this.brand= brand;
		
	}
	@Override
	public String toString() {
		return "Product name=" + name + "\n price=" + price + "\n quantity=" + quantity + "\n brand=" + brand+"\n\n";
	}
	
}	

