package Temp;
import java.time.LocalDate;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		LocalDate currentdate = LocalDate.now();
		int currentYear = currentdate.getYear();
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter your first name ");
		String name1=scn.next();
		System.out.println("Please enter your second name ");
		String name2=scn.next();
		System.out.println("Please enter the year your were born ");
		int year=scn.nextInt();
		int age=currentYear-year;
		scn.close();
		System.out.println("Hello "+name1+ " " +name2+ " welcome to the world of Java! You are roughly "+age+ " years old");
	}

}