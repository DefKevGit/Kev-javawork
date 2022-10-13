package functionalInterface;

import java.util.function.Function;

public class FunctionTest 
{
	private static int x=0;
	
	public static void main(String[] args) 
	{
		for(int z=0;z<4;z++)
		{	
			System.out.println("\n"+x);
			Function<Integer,Integer> fun=(x)->(x+100);//takes X and adds 100
			System.out.println(fun.apply(x));
			x=(fun.apply(x));
		}
	}
}
