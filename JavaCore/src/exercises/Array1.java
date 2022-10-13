package exercises;

public class Array1 
{
	public static void main(String[] args) 
	{
		int[] values=new int[10];
		values[0]=21;
		values[1]=22234;
		values[2]=21234;
		values[3]=2164;
		values[4]=215;
		values[5]=214;
		values[6]=2167;
		values[7]=21778;
		values[8]=218765;
		values[9]=2176543;
		
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i]);
			
		}
		
		int[] values1=new int[15];
		for(int i=0;i<values1.length;i++)
		{
			values1[i] = i+34;
			System.out.println(values1[i]);
			
		}
		for(int i=0;i<values1.length;i++)
		{
			values1[i] = i*10;
			System.out.println(values1[i]);
		}
				
				
		
		
	}

}
