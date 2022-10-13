package unit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecApp 
{
	public static void main(String[] args) 
	{
		System.out.println("Do something in the application");
		Result result=JUnitCore.runClasses(com.TestSuite.class);
		//result will collect all the results and put them into an array
		for(Failure fail:result.getFailures())
		{
			System.out.println(fail.toString());
		}
			System.out.println(result.wasSuccessful());
			
		System.out.println("Do something in the application");
	}
}
