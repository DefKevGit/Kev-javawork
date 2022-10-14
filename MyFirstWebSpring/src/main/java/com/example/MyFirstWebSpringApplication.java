package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan -> look for base package
//@EnableAutoConfiguration -> auto configure many tools that are embedded in my SpringBoot app
//@Configure -> all the codes written by the developers are configured internally
public class MyFirstWebSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebSpringApplication.class, args);
	}

}
