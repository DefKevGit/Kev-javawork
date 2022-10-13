package unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class TestAnnotation 
{
	int maths;
	int english;
	int chemistry;
	@BeforeClass 
	public static void m1()
	{
		System.out.println("@BeforeClass we are getting the report card");
	}
	@Before
	public void m2()
	{
		System.out.println("Initialise the marks");
		this.chemistry=41;
		this.maths=71;;
		this.english=99;
	}
	@After
	public void m3()
	{
		this.chemistry=0;
		this.maths=0;
		this.english=0;
		System.out.println("Result calculation completed");
	}
	@AfterClass
	public void m4()
	{
		System.out.println("@AfterClass report generarted");
	}
	@Ignore
	public void m5()
	{
		System.out.println("We are ignoring other subject marks");
	}
	
	
	
}
