package com.nfk.algorithms;
import java.lang.reflect.Array;
import java.util.Scanner;

public class NumberPalindrome {
	
	public static String[] isPalindrome(int[] numberArray)
	{
		int length = numberArray.length;
		String[] returnArray=new String[length];
		int n,mod;
		for (int i=0; i<length; i++)
		{
			returnArray[i] = "No";
		}
		for (int i=0; i<length; i++)
		{
		
			//n=1221
			int reverse = 0;
			n = numberArray[i];
			while (n!=0)
			{
				mod = n%10;
				reverse = reverse * 10 + mod;
				n = n/10;
			}
			
			if (reverse == numberArray[i])
				returnArray[i] = "Yes";
		}
		
		return returnArray;
	}
	
	
	public static void main(String[] args) 
	{
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of element and the input elements: ");
		int numberOfElements = in.nextInt(); 
		int[] elementsArray = new int[numberOfElements];
		String[] outputArray = new String[numberOfElements];
		
		for (int i=0; i<numberOfElements; i++)
		{
			elementsArray[i] = in.nextInt();
		}
		
		outputArray = isPalindrome(elementsArray);
		for (int i=0; i<numberOfElements; i++)
		System.out.println(outputArray[i]);
	}

}
