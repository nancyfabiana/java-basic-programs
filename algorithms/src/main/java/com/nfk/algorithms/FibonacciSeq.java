package com.nfk.algorithms;

public class FibonacciSeq {

	public void printFibSeries(int total)
	{
		//0,1,1,2,3,5,8,13
		int n1=0, n2=1, n3;
		System.out.println("Fibonacci Series:");
		System.out.print(n1+" "+n2);
		for (int i=2; i<total; i++)
		{
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
	static int n1=0, n2=1,n3=0;
	public void printFibSeries(int total,boolean isRecursive)
	{
		//int n1=0, n2=1,n3=0;
		System.out.println("Fibonacci Series:");
		System.out.print(n1+" "+n2);
		recFib(total-2);
	}
	
	public void recFib(int count)
	{
		if (count > 0)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			recFib(--count);
		}
	}
	
	
	public static void main(String args[])
	{
		FibonacciSeq fibObj = new FibonacciSeq();
		fibObj.printFibSeries(10,true);
		
	}
	
}
