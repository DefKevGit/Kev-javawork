package com.example;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.myBeans.Book;
import com.example.myBeans.Person;


@SpringBootApplication
public class MyFirstSpringApplication 
{

	public static void main(String[] args) 
	{
		//SpringApplication.run(MyFirstSpringApplication.class, args);
		ApplicationContext context = SpringApplication.run(MyFirstSpringApplication.class, args);

	    String byBoth = context.getBean("greeting", String.class);
        System.out.print("\n"+byBoth);
	    
        LocalTime byBoth2 = context.getBean("timenow", LocalTime.class);
	    System.out.print(" The time is "+byBoth2);

	    
        Person byBoth1 = context.getBean("showPerson", Person.class);
	    System.out.print(" and you are a "+byBoth1+".");
	    
	    Book byAll = context.getBean("showBook", Book.class);
	    System.out.print("\n"+byAll);
    }
}
