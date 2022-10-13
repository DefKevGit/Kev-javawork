package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample 
{
	public static void main(String[] args) 
	{
		try
		{
			Writer w=new FileWriter("D:\\qafiles\\Kev.txt");
			String content="Welcome to the world of Java, this is a strange world too";
			w.write(content);
			w.close();
			System.out.println("File written successfully");
		
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
