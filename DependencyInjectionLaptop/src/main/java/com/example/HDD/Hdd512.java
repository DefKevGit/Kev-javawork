package com.example.HDD;

import org.springframework.stereotype.Component;



import storage.Storage;

@Component("512MB")
public class Hdd512 implements Storage 
{
	public String storageSpec()
	{
	return "512MB";
	}
}