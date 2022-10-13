package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorExample 
{
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Upasana");
		list.add("12.55");
		list.add("1234");
		list.add("true");
		list.add("Y");
		System.out.println(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		List<Product> list1=new ArrayList<>();
		Product prod1=new Product("bluetooth",50,10,"Boat");
		
		Product prod2=new Product("TV",1000,5,"Apple");
		
		Product prod3=new Product("Camera",500,8,"Sony");
	
		Product prod4=new Product("Tripod",70,15,"Digitech");
		
		list1.add(prod1);
		list1.add(prod2);
		list1.add(prod3);
		list1.add(prod4);
		
		//Iterator<Product> productitr=list1.iterator();
		for(int index=0;index+1<list.size();index++)
		{
		//while (productitr.hasNext())
		//{
			//System.out.println(productitr.next());
			System.out.println(list1.get(index).name+" "+list1.get(index).price+" "+list1.get(index).quantity+" "+list1.get(index).brand);
		//}
		}
	}
}	
		
