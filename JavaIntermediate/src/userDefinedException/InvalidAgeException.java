package userDefinedException;

public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
	public InvalidAgeException() {}
}
