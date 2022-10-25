package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import storage.PC;



@SpringBootApplication
public class DependencyInjectionLaptopApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DependencyInjectionLaptopApplication.class, args);
		ApplicationContext context =SpringApplication.run(DependencyInjectionLaptopApplication.class, args);
		
		PC pc1=context.getBean("DELL",PC.class);
		PC pc2=context.getBean("Apple",PC.class);
		
		pc1.storageSpec();
		pc2.storageSpec();
	
	
	}

}
