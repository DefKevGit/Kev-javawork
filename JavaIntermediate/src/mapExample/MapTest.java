package mapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import collection.Product;

public class MapTest 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> myMap=new HashMap<Integer, String>();
		myMap.put(101, "London");
		myMap.put(102, "New York");
		myMap.put(103, "shanghai");
		myMap.put(104, "Sidney");
		myMap.put(105, "Istanbul");
		myMap.put(106, "Istanbul");
		
		for(Map.Entry m:myMap.entrySet())
		{
			System.out.println(m.getKey()+"----"+m.getValue());
			
		}
		
		Map<Integer, Product> myMap1=new HashMap<Integer, Product>();
		Product prod1=new Product("bluetooth",50,10,"Boat");
		
		Product prod2=new Product("TV",1000,5,"Apple");
		
		Product prod3=new Product("Camera",500,8,"Sony");
	
		Product prod4=new Product("Tripod",70,15,"Digitech");
		
		myMap1.put(1,prod1);
		myMap1.put(2,prod2);
		myMap1.put(3,prod3);
		myMap1.put(4,prod4);
		
		for(Map.Entry m:myMap1.entrySet())
		{
			System.out.println(m.getKey()+"----"+m.getValue());
		}	
		
		
		
	}
}
