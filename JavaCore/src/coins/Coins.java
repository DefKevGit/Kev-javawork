package coins;

import java.util.Scanner;

public class Coins 
{
	public static void main(String[] args) 
	{
		float change;
		float remainder;
		int £20note = 0;
		int £10note = 0;
		int £5note = 0;
		int £2coin = 0;
		int £1coin = 0;
		int pence50 = 0;
		int pence20 = 0;
		int pence10 = 0;
		int pence5 = 0;
		int pence2 = 0;
		int pence1 = 0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the cost of the item in pounds:\n (EXAMPLE:  type £25.76 as 25.76");
		float cost=scan.nextFloat();
		System.out.println("Please enter the amount used to pay in punds:\n (EXAMPLE:  £25.76 as 25.76 ");
		float amount=scan.nextFloat();
		change=amount-cost;
		System.out.println("You change is: £"+change);
		while (change>=20)
		{
			remainder=change%20;
			£20note =£20note+1;
			change=change-20;
		}
		while (change>=10)
		{
			remainder=change%10;
			£10note =£10note+1;
			change=change-10;
		}
		while (change>=5)
		{
			remainder=change%5;
			£5note =£5note+1;
			change=change-5;
		}
		while (change>=2)
		{
			remainder=change%2;
			£2coin =£2coin+1;
			change=change-2;
		}
		while (change>=1)
		{
			remainder=change%1;
			£1coin =£1coin+1;
			change=change-1;
		}
		while (change>=0.50f)
		{
			remainder=(change%(0.50f));
			pence50 = pence50+1;
			change=(change-0.5f);
		}
		while (change>=0.2f)
		{
			remainder=change%0.2f;
			pence20 = pence20+1;
			change=change-0.2f;
		}
		while (change>=0.1f)
		{
			remainder=change%0.1f;
			pence10 = pence10+1;
			change=change-0.1f;
		}
		while (change>=0.05f)
		{
			remainder=change%5;
			pence5 = pence5+1;
			change=change-0.05f;
		}
		while (change>=0.02f)
		{
			remainder=change%0.02f;
			pence2 = pence2+1;
			change=change-0.02f;
		}
		while (change>=0.01f)
		{
			remainder=change%0.01f;
			pence1 = pence1+1;
			change=change-0.01f;
		}
		
		if(£20note==1)
			System.out.println(£20note+" £20 note");
		else if(£20note>1)
			System.out.println(£20note+" £20 notes");
		else{}
		
		if(£10note==1)
			System.out.println(£10note+" £10 note");
		else if(£10note>1)
		System.out.println(£10note+" £10 notes");
		else{}
		
		if(£5note==1)
			System.out.println(£5note+" £5 note");
		else if(£5note>1)
			System.out.println(£5note+" £5 notes");
		else{}
		
		if(£2coin==1)
			System.out.println(£2coin+" £2 coin");
		else if(£2coin>1)
			System.out.println(£2coin+" £2 coins");
		else{}
		
		if(£1coin==1)
			System.out.println(£1coin+" £1 coin");
		else if(£1coin>1)
			System.out.println(£1coin+" £1 coins");
		else{}
		
		if(pence50==1)
			System.out.println(pence50+" 50p coin");
		else if(pence50>1)
			System.out.println(pence50+" 50p coins");
		else{}
		
		if(pence20==1)
			System.out.println(pence20+" 20p coin");
		else if(pence20>1)
			System.out.println(pence20+" 20p coins");
		else{}
		
		if(pence10==1)
			System.out.println(pence10+" 10p coin");
		else if(pence10>1)
			System.out.println(£10note+" 10p coins");
		else{}
		
		if(pence5==1)
			System.out.println(pence5+" 5p coin");
		else if(pence5>1)
			System.out.println(pence5+" 5p coins");
		else{}
		
		if(pence2==1)
			System.out.println(pence2+" 2p coin");
		else if(pence2>1)
			System.out.println(pence2+" 2p coins");
		else{}
		
		if(pence1==1)
			System.out.println(pence1+" 1p coin");
		else if(pence1>1)
			System.out.println(pence1+" 1p coins");
		else{}
		
		
		
		
		
		
		
		
		
				
				
	}
}
