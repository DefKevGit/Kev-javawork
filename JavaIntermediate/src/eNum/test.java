package eNum;

public class test 
{
	public static void main(String[] args) 
	{
		Colours myColour=Colours.RED;
		System.out.println(myColour);
		MsgStatus mObj=MsgStatus.READ;
		System.out.println(mObj.getMsg());
		OrderStatus osObj=OrderStatus.FEEDBACKCOLLECTED;
		System.out.println(osObj.getMsg());
	
	
	
	}
}
 