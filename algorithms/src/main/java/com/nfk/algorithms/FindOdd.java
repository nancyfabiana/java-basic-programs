package com.nfk.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOdd {
	
	public static int[]  findOddNum(int l,int r) {
		int count,arrlength;
		count = r-l+1;
		if (count%2 ==0)
			arrlength = count/2;
		else
			arrlength = count/2 + 1;
				
		int[] numArray = new int[arrlength];
		int number=l;
		int index=0;
		for (int i=0;i<count;i++)
		{
			//number = l;
			if (number%2 != 0)
			{
				numArray[index]=number;
				index++;
			}
			number++;
			
		}
		return numArray;
}
	
	public static Integer[]  findOddNumUsingList(int l,int r) {
		int count,arrlength;
		count = r-l;
		ArrayList numArrayList = new ArrayList();
		int number=l;
		int index=0;
		for (int i=0;i<=count;i++)
		{
			//number = l;
			if (number%2 != 0)
			{
				numArrayList.add(number);
				index++;
			}
			number++;
			
		}
		Integer[] numArray = new Integer[numArrayList.size()];
		return (Integer[]) numArrayList.toArray(numArray);
}
	public static void main(String[] args)
	{
		
		Integer[] arr = findOddNumUsingList(3,4);
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		System.out.print(Arrays.toString(arr));
	}
}
