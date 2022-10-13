package classobject;


public class BookObject 
{
	String title;
	String author;
	Float price;
	String publisher;
	
	public void print()
	{
		System.out.println("Printing the book "+title+ ", written by "+author+", \npublished by "+publisher+" and has a value of £"+price);
	}
}
