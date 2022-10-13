package functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample 
{
	public static void main(String[] args) 
	{
		BiPredicate<String, Integer> filter = (x, y) -> 
		{
            return x.length() == y;
        };

        boolean result = filter.test("Kevin", 5);
        System.out.println(result);  // true

        boolean result2 = filter.test("Kevin", 10);
        System.out.println(result2); // false
	}
}
