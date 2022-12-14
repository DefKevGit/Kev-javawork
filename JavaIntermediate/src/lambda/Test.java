package lambda;

public class Test 
{
	public static void main(String[] args) 
	{
		//Person p=new Person();
		//p.greet();
	
		Greeting gr=new Greeting()
		{
			public void greet()
			{
				System.out.println("Hello World.");
			}
			//public void welcome()
			//{
			//	System.out.println("Welcome");
			//}
		};
		gr.greet();
		//gr.welcome();
		//lambda expression
		//left --> right
		//args -> body
		//() -> {print/ calc}
		
		//no args or return
		Greeting gr1=()->{System.out.println("Hello World 2");};
		gr1.greet();
		
		//Lambda with args and no return type
		GreetingName grn=(x)->{System.out.println("Hello "+x);};
		grn.greet("Kev");
		
		//Lambda with args and return
		GreetingReturn grReturn=(x)->{return "Hello "+x;};
		System.out.println(grReturn.greet("Hasan"));
		
		
	}
	
}
