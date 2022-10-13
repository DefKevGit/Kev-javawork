package arrays;

public class ArrayExample 
{
	public static void main(String[] args) 
	{
		//Declare
		//Instantiate
		//Initialise
		
		String[] student;//Declare
		student=new String[5];//Instantiation
		student[0]="Hilda";//Initialisation
		student[1]="Kev";
		student[2]="Hasan";
		student[3]="Arifi";
		student[4]="Edith";
		
		String[] city=new String[5];
		city[0]="London";
		city[1]="NewYork";
		city[2]="Paris";
		city[3]="Houston";		
		city[4]="Prague";
				
		String[] fruits= {"Banana","Apple","Grapes","Guava","pineapple","Avacado"};
		
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i]);
		}
				
		for(int i=0;i<fruits.length;i++)
		{
			System.out.println(fruits[i]);
		}
		
		int[] zipcode= {2345,4567,9874,5612,4654,1654};
		
		for(int i=0;i<zipcode.length;i++)
		{
			System.out.println(zipcode[i]);
		}
		for(int i=0;i<city.length;i++)
		{
			System.out.println(city[i]);
		}
	}
}

