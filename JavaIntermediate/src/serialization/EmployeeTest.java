package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest 
{
	public static void main(String[] args) 
	{
		Employee emp=new Employee(1001, "Kev", 20000,"Software Dev","Kev@email.com");
		
		try
		{
			
			//Write
			FileOutputStream fileOut=new FileOutputStream("object1.txt");
			ObjectOutputStream oOut=new ObjectOutputStream(fileOut);
			oOut.writeObject(emp);
			
			//Read
			FileInputStream fileIn=new FileInputStream("object1.txt");
			ObjectInputStream oIn=new ObjectInputStream(fileIn);
			
			Employee empCopy= (Employee)oIn.readObject();
			System.out.println(empCopy.empId);
			System.out.println(empCopy.name);
			System.out.println(empCopy.salary);
			System.out.println(empCopy.designation);
			System.out.println(empCopy.email);
			
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}
