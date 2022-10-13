package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unit.Calculator;

public class TestCustomer 
{
	@Test
	public void findBigOf3()
	{
		assertEquals(99,Calculator.findBigOf3(35, 66, 99));
		assertEquals(99,Calculator.findBigOf3(35, 99, 66));
		assertEquals(99,Calculator.findBigOf3(99, 66, 35));
	}
	@Test
	//array {45,45,68,687,456,123,4567}
	public void findBigInArray()
	{
		int [] valueArray= {12,32,123,255,38,99};
		assertEquals(255,Calculator.findBigInArray(valueArray));
	}
}
