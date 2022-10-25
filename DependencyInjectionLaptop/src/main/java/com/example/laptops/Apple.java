package com.example.laptops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import storage.PC;
import storage.Storage;



@Component("Apple")
public class Apple implements PC
{
	@Autowired
	@Qualifier("512MB")
	Storage store;
	
	public String storageSpec()
	{
		System.out.println("This Apple PC has "+store.storageSpec()+" storage space.");
		return store.storageSpec();
	}
}

