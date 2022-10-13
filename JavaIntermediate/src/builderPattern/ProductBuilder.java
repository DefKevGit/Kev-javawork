package builderPattern;

public class ProductBuilder 
{
	private int id;
	private String name;
	private String brand;
	private int price;
	
	public ProductBuilder() 
	{
		super();
	}

	public Product buildProduct()
	{
		return new Product(id, name, brand,price);
	}
	
	public ProductBuilder(int id, String name, String brand, int price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	public ProductBuilder id(int passedId)
	{
		this.id=passedId;
		return this;
	}
	
	public ProductBuilder name(String passedName)
	{
		this.name=passedName;
		return this;
	}
	
	public ProductBuilder brand(String passedBrand)
	{
		this.brand=passedBrand;
		return this;
	}
	
	public ProductBuilder price(int passedPrice)
	{
		this.price=passedPrice;
		return this;
	}
	
	
}
