package com.example.engines;

import org.springframework.stereotype.Component;

import com.example.Interfaces.Engine;

@Component("V8")
public class V8 implements Engine
{
	public String spec()
	{
	return "V8";
	}
}
