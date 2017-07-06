package com.nfk.algorithms;

import com.nfk.algorithms.TestOverrideA;

public class TestOverrideB extends TestOverrideA {
	
	@Override
	public TestOverrideA getParentClass()
	{
		System.out.println("Overriden class");
		return new TestOverrideB();
	}

}
