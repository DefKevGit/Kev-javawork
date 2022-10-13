package conditions;

import java.util.Scanner;

public class Conditions2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter your name. ");
		String name=scn.next();
		System.out.println("Please enter your city of residents. ");
		String city=scn.next();
		if(city.equals("London")) {
			System.out.println("Hello "+name+" you are Londoner");
		}else if(city.equals("NewYork")) {
			System.out.println("Hello "+name+" You are a New Yorker");
		}else {
			System.out.println("Hello "+name+ " I do not know where you are from!");
		}
		scn.close();
	}

}