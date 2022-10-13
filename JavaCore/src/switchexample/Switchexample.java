package switchexample;

public class Switchexample {
	public static void main(String[] args) 
	{
		String card="Diamond";
		switch(card) 
		{
			case "Club":
				System.out.println("You have a club.");
				break;	
			case "Diamond":
				System.out.println("You have a Diamond");
				break;
			case "Heart":
				System.out.println("You have a Heart");
				break;
			case "Spade":
				System.out.println("You have a Spade");
				break;
			default:
				System.out.println("Not a valid card");
		}
	    
	
	
	}
	
}
