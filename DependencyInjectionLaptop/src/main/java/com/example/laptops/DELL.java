package com.example.laptops;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import storage.PC;
import storage.Storage;




@Component("DELL")
public class DELL implements PC
{
	@Autowired
	@Qualifier("1TB")
	Storage store;
	
	public String storageSpec()
	{
		System.out.println("This DELL PC has "+store.storageSpec()+" storage space.");
		return store.storageSpec();
	}
}

