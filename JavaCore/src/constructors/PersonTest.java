package constructors;

public class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p1=new Person();
		p1.name="Kev";
		p1.age=32;
		p1.address="Somewhere, somewhere";
		p1.phone="07823705688";
		
		Person p2=new Person("Hilda",25,"UK","4567894");
		Person p3=new Person("Arifi",22,"USA","+1 46846");
		Person p4=new Person("Kev",41);
		p4.address="Teignmouth";
		p4.phone="46468461";
		
		
		
		
	}
}
