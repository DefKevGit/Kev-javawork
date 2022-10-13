package listOfObjects;

import java.util.ArrayList;

public class Test 
{
	public static void main(String[] args) 
	{
		Product prod1=new Product("bluetooth",50,10,"Boat");
		prod1.toString();
		Product prod2=new Product("TV",1000,5,"Apple");
		prod2.toString();
		Product prod3=new Product("Camera",500,8,"Sony");
		prod3.toString();
		Product prod4=new Product("Tripod",70,15,"Digitech");
		prod4.toString();
				
		ArrayList<Product> list=new ArrayList<Product>();
		list.add(prod1);
		list.add(prod2);
		list.add(prod3);
		list.add(prod4);
		list.add(new Product("Lipstick",20,100,"Mac"));
		//System.out.println(list);
		
		Person p1=new Person("Kev",41,0,"Teignmouth");
		p1.toString();
		Person p2=new Person("Mike",50,3,"Liverpool");
		p2.toString();
		Person p3=new Person("Rob",26,1,"Leicester");
		p3.toString();
		Person p4=new Person("Jamie",11,0,"London");
		p4.toString();
		
		ArrayList<Person> plist=new ArrayList<Person>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(new Person ("Grimy Jim",77,7,"Dawlish"));
		//System.out.println(plist);
		//System.out.println(plist);
		
		for(int i=0;i<list.size();i++)
		{
			//Line below gets one item at a time
			//System.out.println(list.get(i));
			if(list.get(i).getPrice()>100 & list.get(i).getQuantity()>5)
			System.out.println(list.get(i));
		}
		for(int i=0;i<plist.size();i++)
		{
			if(plist.get(i).getAge()>30 & plist.get(i).getChildren()>0)
			{
				System.out.println(plist.get(i));
			}
		}
		
		Product p5=new Product();
		p5.getProduct(list);
		Person p6=new Person();
		p6.getProduct(plist);
			
		
		
	}
}
