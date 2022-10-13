package unit;

public class Calculator 
{
	

	public static int findBig(int x,int y)
	{
		if(x>y)
			return x;
		else
			return y;
		
	}
	
	
	public static int findSmall(int x,int y)
	{
		if(x>y)
			return y;
		else
			return x;
	}
	
	public static int findBigOf3(int x,int y,int z)
	{
		if(x>y & x>z)
		{
			return x;
		}
		if(y>x & y>z)
		{
			return y;
		}
		else
			return z;
	}
	//array {45,45,68,687,456,123,4567}
	public static int findBigInArray(int[] valueArray)  
	{
		int biggest=0;
		for(int i=0;i<valueArray.length;i++)
		{
			if(biggest<valueArray[i])
				
				biggest=valueArray[i];
		}
		return biggest;	
		
	}
	public static boolean findAvgPassMark(int x,int y,int z)
	{
		if (((x+y+z)/3)> 70)
			return true;
		else
			return false;
	}
}
