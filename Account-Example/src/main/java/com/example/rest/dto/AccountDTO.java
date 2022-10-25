package com.example.rest.dto;

public class AccountDTO
{
	private long id;
	//private String accNum; DO NOT DISPLAY ACCOUNT NUMBER!!!!
	private String name;
	
	public AccountDTO()
	{
		super();
	}
	
	public AccountDTO(long id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	public Long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
