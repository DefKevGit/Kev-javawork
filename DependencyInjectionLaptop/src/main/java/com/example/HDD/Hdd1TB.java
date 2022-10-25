package com.example.HDD;


import org.springframework.stereotype.Component;
import storage.Storage;

@Component("1TB")
public class Hdd1TB implements Storage 
{
	public String storageSpec()
	{
	return "1TB";
	}
}