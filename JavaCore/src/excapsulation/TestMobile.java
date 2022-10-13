package excapsulation;

public class TestMobile 
{
	public static void main(String[] args) 
	{
	 Mobile x=new Mobile();
	 x.setBrand("Samsung");
	 System.out.println(x.getBrand());
	 x.setRam(18);
	 System.out.println(x.getRam());
	 
	}
}
