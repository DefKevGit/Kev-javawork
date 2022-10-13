package inheritance;

public class Employee extends Person
{
	int empID;
	public Employee() {}
	public Employee(String name,int age,int empID)
	{
		super(name,age);
		this.empID=empID;
		
		System.out.println("Employee Constructor");
		
	}
	public void doSomething()
	{
		System.out.println("Employess work to earn salary");
		
	}
}

