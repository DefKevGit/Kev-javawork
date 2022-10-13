package eNum;

public enum MsgStatus 
{
	SENT("Single tick"),
	DELIVERED("Double tick"),
	READ("Double blue tick"),
	DELETED("This message is deleted");
	String des;
	
	private MsgStatus(String m) 
	{
		des=m;
	}
	public String getMsg()
	{
		return des;
	}
	
}
