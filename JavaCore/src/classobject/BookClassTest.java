package classobject;
import java.util.Scanner;

public class BookClassTest 
{
	public static void main(String[] args) 
	{
		BookObject book1=new BookObject();
		book1.title="Tell me your Dreams";
		book1.author="Sidney Sheldon";
		book1.price=15.50f;
		book1.publisher= "XYZ publishing";
		book1.print();
		
		BookObject book2=new BookObject();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter title");
		book2.title=scn.nextLine();
		System.out.println("Enter Author");
		book2.author=scn.nextLine();
		System.out.println("Enter publisher");
		book2.publisher=scn.nextLine();
		System.out.println("Enter price");
		book2.price=scn.nextFloat();
		
		System.out.println(book2.title);
		System.out.println(book2.author);
		System.out.println(book2.price);
		System.out.println(book2.publisher);
		book2.print();
		scn.close();
	}
	
}
