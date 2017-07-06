package com.nfk.algorithms;


public class TestOverrideA {

	public TestOverrideA getParentClass()
	{
		System.out.println("Parent class");
		return new TestOverrideA();
	}

}	