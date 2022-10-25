package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.MainService;

@RestController //responsible for routing user request to expose data
public class MainController //simple java class
{
	@Autowired
	MainService service;
	//List<String> list=new ArrayList();

	/*public MainController() 
	{
		list.add("Shanghai");
		list.add("NewYork");
		list.add("London");
		list.add("Beijing");
		list.add("LA");
	}*/
	@GetMapping("/list") //request fetch
	public List<String> showList()
	{
		return this.service.show();
	}
	
	@PostMapping("/add") //add to list
	public List<String> addToList()
	{
		return this.service.create();
	}
	
	@PutMapping("/update/{id}") //update existing
	public void updateTheList(@PathVariable int id)
	{
		this.service.show();
	}
	
	@DeleteMapping("/delete/{id}") //update existing
	public void deleteFromTheList(@PathVariable int id)
	{
		this.service.delete(id);
	}
	
	
}
