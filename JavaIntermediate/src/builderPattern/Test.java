package builderPattern;

public class Test
{
	public static void main(String[] args) 
	{
		Product obj1=new ProductBuilder()
				.name("TV")
				.buildProduct();
		Product obj2=new ProductBuilder()
				.name("Mobile")
				.brand("apple")
				.buildProduct();
		Product obj3=new ProductBuilder()
				.name("TV")
				.brand("Samsung")
				.price(1000)
				.buildProduct();
	}
}
