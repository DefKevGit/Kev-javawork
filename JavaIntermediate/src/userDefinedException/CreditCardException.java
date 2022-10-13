package userDefinedException;

public class CreditCardException extends Exception
{
	public CreditCardException(String msg)
	{
		super(msg);
	}
	public CreditCardException() {}
}

