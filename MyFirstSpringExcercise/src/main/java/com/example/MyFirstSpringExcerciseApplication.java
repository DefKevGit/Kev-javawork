package com.example;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyFirstSpringExcerciseApplication 
{

	public static void main(String[] args) 
	{
		//SpringApplication.run(MyFirstSpringApplication.class, args);
		ApplicationContext context = SpringApplication.run(MyFirstSpringExcerciseApplication.class, args);

	    
		Object byName = context.getBean("time");
	    LocalTime byType = context.getBean(LocalTime.class);
	    LocalTime byBoth = context.getBean("time", LocalTime.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);
	}
	
	@Bean
    public LocalTime time() 
	{
        return LocalTime.now();
    }
}
