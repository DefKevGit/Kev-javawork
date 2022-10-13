package methods;

public class testTV
{
	public static void main(String[] args) 
	{
		Television tele=new Television();
		tele.brand="Samsung";
		tele.price=1200;
		tele.screensize=55;
		tele.turnOn();
		int x=tele.switchToChannel();
		System.out.println(x);
		System.out.println(tele.switchToChannel());
		
		double discount=tele.getDiscount();
		System.out.println(discount);
		
		double discountOnBF=tele.discountOnBlackFriday(30);
		System.out.println(discountOnBF);
		
		double discountAtTheEnd=tele.discountOnBlackFriday(50);
		System.out.println(discountAtTheEnd);
		
		double totalDiscount=tele.discountWithCityBank(30, 25);
		System.out.println(totalDiscount);
		
	}
}
