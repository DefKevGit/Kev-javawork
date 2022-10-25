package com.example.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account
{
	private long id;
	private String accNum;
	private String name;
	
	public Account()
	{
		super();
	}

	public Account(long id, String accNum, String name)
	{
		super();
		this.id = id;
		this.accNum = accNum;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() 
	{
		return id;
	}


	public void setId(long id)
	{
		this.id = id;
	}

	@Column(unique = true, nullable = false)
	public String getAccNum()
	{
		return accNum;
	}

	public void setAccNum(String accNum)
	{
		this.accNum = accNum;
	}

	@Column
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
	
	
}
