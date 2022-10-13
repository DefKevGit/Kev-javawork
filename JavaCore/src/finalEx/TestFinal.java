package finalEx;

public class TestFinal
{
	public static void main(String[] args) {
		finalExample obj=new finalExample();
		System.out.println(obj.x);
		System.out.println(obj.y);
		
	
		
			finalExample obj1=new finalExample(444);
			System.out.println(obj1.x);
			System.out.println(obj1.y);
			
			finalExample obj2=new finalExample(111,666);
			System.out.println(obj2.x);
			System.out.println(obj2.y);
	}
}
