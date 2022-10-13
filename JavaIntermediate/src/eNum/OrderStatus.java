package eNum;

public enum OrderStatus 
{
	PENDING("Order is pending"),
	COMPLETED("Order completed"),
	REJECTED("Order rejected"),
	DELIVERED("Order delivered"),
	FEEDBACKCOLLECTED("Feedback recieved");
	String status;
	
	private OrderStatus(String m) 
	{
		status = m;
	}
	public String getMsg()
	{
		return status;
	}
}
