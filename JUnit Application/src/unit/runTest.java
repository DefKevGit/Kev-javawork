package unit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class runTest 
{
	@Test
	public void runfindBig()
	{
		assertEquals(200,Calculator.findBig(100,200));
		assertEquals(200,Calculator.findBig(200,100));
	}
	
	@Test
	public void runfindSmall()
	{
		assertEquals(10,Calculator.findSmall(10, 20));
		assertEquals(10,Calculator.findSmall(20, 10));
		
	}
	@Test
	public void findBigOf3()
	{
		assertEquals(99,Calculator.findBigOf3(35, 66, 99));
		assertEquals(99,Calculator.findBigOf3(35, 99, 66));
		assertEquals(99,Calculator.findBigOf3(99, 66, 35));
	}
	@Test
	//array {45,45,68,687,456,123,4567}
	public void findBigInArray()
	{
		int [] valueArray= {12,32,123,255,38,99};
		assertEquals(255,Calculator.findBigInArray(valueArray));
	}
	@Test
	public void findAvgMarks()
	{
		assertEquals(true,Calculator.findAvgPassMark(71, 88,90));
	}
}
