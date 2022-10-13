package inheritance;

public abstract class Person 
{
	String name;
	int age;
	public Person() {}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Person Constructor");
	}
	public abstract void doSomething();
	public void talk()
	{
		System.out.println("People talk bro!.. (sssshh)");
	}
}
//default constructor ///public Person()()
