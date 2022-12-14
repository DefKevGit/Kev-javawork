package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test 
{
	public static void main(String[] args) 
	{
		Product prod=new Product(1001, "TV", 1000,"Apple");
		
		try
		{
			
			//Write
			FileOutputStream fileOut=new FileOutputStream("object.txt");
			ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
			oOut.writeObject(prod);
			
			//Read
			FileInputStream fileIn=new FileInputStream("object.txt");
			ObjectInputStream oIn=new ObjectInputStream(fileIn);
			
			Product prodCopy= (Product)oIn.readObject();
			System.out.println(prodCopy.prodId);
			System.out.println(prodCopy.name);
			System.out.println(prodCopy.price);
			System.out.println(prodCopy.brand);
			
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
