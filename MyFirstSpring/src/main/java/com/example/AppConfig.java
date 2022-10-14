package com.example;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.myBeans.Book;
import com.example.myBeans.Person;

@Configuration
public class AppConfig 
{

    @Bean
    @Scope("prototype")
    public String greeting()
    {
        return "Hello my friend.";
    }
    
    @Bean
    @Scope("prototype")
    public LocalTime timenow()
    {
        return LocalTime.now();
    }
    
    @Bean
    @Scope("prototype")
    public Person showPerson()
	{
		return new Person("Kev",41);
		
	}
    
    @Bean
    @Scope("prototype")
    public Book showBook()
    {
    	return new Book(101,"title",121,"Author",56);
    }
    
    
}