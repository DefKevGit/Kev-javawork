package inheritance;

public class Test 
{    
	String dept;
	public static void main(String[] args) 
	{
		//Person p=new Person();
		
		//Employee e=new Employee()
		
		Person p1=new Employee();
		Person p2=new Student();
		Person p3=new Manager();
		
		Manager m=new Manager("Kev",41,20,"training");
		
		System.out.println(m.name);	
		System.out.println(m.age);	
		System.out.println(m.empID);	
		System.out.println(m.dept);	
		m.doSomething();
		p3.talk();
		p1.talk();
		p2.talk();
	
	}
	
}
