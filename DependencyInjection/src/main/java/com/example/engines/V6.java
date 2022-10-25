package com.example.engines;

import org.springframework.stereotype.Component;

import com.example.Interfaces.Engine;

@Component("V6")
public class V6 implements Engine
{
	public String spec()
	{
	return "V6";
	}
}