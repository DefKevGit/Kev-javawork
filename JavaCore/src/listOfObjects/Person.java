package listOfObjects;

import java.util.ArrayList;
import java.util.Scanner;

public class Person 
{
	private String name;
	private int age;
	private int children;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void getProduct(ArrayList<Person> list)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a name");
		String findName=scan.nextLine();
		for (int i=0;i<list.size();i++)
		{
			if(list.get(i).name.equals(findName))
			{
				System.out.println(list.get(i));
			}
		}
		
	}
	public Person() {}
	public Person(String name, int age,int children,String location)
	{
		super();
		this.name= name;
		this.age= age;;
		this.children= children;
		this.location= location;
		
	}
	@Override
	public String toString() {
		return "Person \n name=" + name + "\n age=" + age + "\n children=" + children + "\n location=" + location+"\n\n";
	}
	
}
