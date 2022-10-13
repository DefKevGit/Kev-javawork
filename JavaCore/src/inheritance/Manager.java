package inheritance;

	public class Manager extends Employee
	{
		String dept;
		public Manager() {}
		public Manager(String name,int age,int empID,String dept)
		{
			super(name,age,empID);
			this.dept=dept;
			System.out.println("Manager Constructor");
			System.out.println("End of code");
		}
		
		public void doSomething()
		{
			System.out.println("Managers do stuff");
		}
	}

