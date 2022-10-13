package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import unit.Calculator;

public class TestProduct 
{
	@Test
	public void findAvgMarks()
	{
		assertEquals(true,Calculator.findAvgPassMark(71, 88,90));
	}
	@Test
	public void runfindBig()
	{
		assertEquals(200,Calculator.findBig(100,200));
		assertEquals(200,Calculator.findBig(200,100));
	}
}
