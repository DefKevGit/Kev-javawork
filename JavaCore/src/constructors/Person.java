package constructors;

public class Person 
{
	String name;
	int age;
	String address;
	String phone;
	
	//Public Person() built-in is nobbled if you create your own
	//Below = my own constructor
	public Person()
	{
		System.out.println("Person class instantiated");
	}
	
	public Person(String n, int a, String add, String p)
	{
		name=n;
		if(a<=0)
		{
			System.out.println("Age cannot be 0 or below (unless you are Benjamin Button");
		}
		else
		{
			age=a;
		}
		address=add;
		phone=p;
	}

	public Person(String n,int a)
	{
		name=n;
		if(a<=0)
		{
			System.out.println("Age cannot be les than 0");
		}
		else
		{
			age=a;
		}
	}





}
