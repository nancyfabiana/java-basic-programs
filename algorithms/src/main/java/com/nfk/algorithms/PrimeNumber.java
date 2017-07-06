package com.nfk.algorithms;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num)
	{
		boolean isPrime = true;
		
		int n = num/2;
		
		for (int i=2;i<=n;i++)
		{
			if (num%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[]arr)
	{
		int number=61;
		boolean isPrime = isPrimeNumber(number);
		System.out.println(isPrime);
	}
}
