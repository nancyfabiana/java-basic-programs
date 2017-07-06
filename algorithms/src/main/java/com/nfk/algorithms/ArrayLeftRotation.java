package com.nfk.algorithms;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLeftRotation {
//7 4
	// [5,4,3,6,7,8,9]
	//O/P -> [7,8,9,5,4,3,6]
	public static int[] arrayLeftRotation(int[] a, int n, int k) {
	      //ArrayList inputList = new ArrayList(n);
	      //inputList.addAll(c)
		int count=0;
		int[] outputArray = new int[n];
		for (int j=k; j<n;j++)
		{
			outputArray[count] = a[j];
			count++;
		}
		for (int i=0;i<k;i++)
		{
			outputArray[count]=a[i];
			count++;
		}
	      return outputArray;
    }
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int numberOfElements = in.nextInt();
		int numberOfLeftRotations = in.nextInt();
		int[] inputArray = new int[numberOfElements];
		for(int i=0; i<numberOfElements; i++)
		{
			inputArray[i] = in.nextInt();
		}
		
		int[] outputArray = new int[numberOfElements];
		outputArray = arrayLeftRotation(inputArray,numberOfElements,numberOfLeftRotations);
		
		for (int i=0; i<numberOfElements;i++)
		{
			System.out.print(outputArray[i] + " ");
		}
		
	}
}
