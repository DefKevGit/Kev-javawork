package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unit.Calculator;

public class TestPayment 
{
	@Test
	public void runfindBig()
	{
		assertEquals(200,Calculator.findBig(100,200));
		assertEquals(200,Calculator.findBig(200,100));
	}
	
	@Test
	public void runfindSmall()
	{
		assertEquals(10,Calculator.findSmall(10, 20));
		assertEquals(10,Calculator.findSmall(20, 10));
		
	}
}
