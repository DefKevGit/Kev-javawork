package arrays;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		int[] x=new int[5];
		ArrayList list=new ArrayList<>();
		list.add("Upasana");
		list.add(12.55);
		list.add(1234);
		list.add(true);
		list.add('Y');
		System.out.println(list);
		
		
		ArrayList<String> names= new ArrayList<String>(3);
		
		names.add("Upasana");
		names.add("Hilda");
		names.add("Arifi");
		names.add("Kev");
		names.add("Emma");
		names.set(2,"AddedAtTwo");
		names.remove(1);
		System.out.println(names);
		
		System.out.println(names.size());
		System.out.println(names.get(2));
		System.out.println("\n");
		//***NOTICE ARRAY IS ALLOCATED 3 BLOCKS BUT I HAVE ADDED 5. ARRAY LISTS CAN GROW WHERE AS
		//AN ARRAY CANNOT***
		for(int i=0;i<names.size();i++)
		{
			System.out.println(names.get(i));
		}
		
		ArrayList<Integer> nums=new ArrayList<Integer>();
		
		
		
				
		
	}
}
