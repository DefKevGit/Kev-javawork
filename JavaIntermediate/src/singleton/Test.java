package singleton;

public class Test
{
	public static void main(String[] args) 
	{
		System.out.println(Sample.getObjectSample());
		Sample.getObjectSample().hello();
		Sample.getObjectSample().hi();
		
		
	}
}
