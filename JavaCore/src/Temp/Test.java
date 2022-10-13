package Temp;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter your name ");
		String name=scn.next();
		System.out.println("Please enter the year of your birth");
		int year=scn.nextInt();
		System.out.println("Hello "+name+" welcome to the world of Java! You were born in the year "+year);
	}

}
