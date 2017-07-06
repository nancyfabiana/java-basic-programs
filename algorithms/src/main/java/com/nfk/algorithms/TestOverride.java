package com.nfk.algorithms;

public class TestOverride {
	
public static void main(String[] args)
{
	TestOverrideB b = new TestOverrideB();
	
	TestOverrideB c = (TestOverrideB)b.getParentClass();
	
}

}