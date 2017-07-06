package com.nfk.algorithms;

import java.util.Scanner;

public class DisplayEndingWithS {
	
	public static void main(String[] arr)
	{
		Scanner in = new Scanner(System.in);
		
		String[] inputArray = {"Samvritha", "Jayas","ShreyaS"};
		for (int i=0; i<inputArray.length; i++)
		{
			int lengthOfString = inputArray[i].length();
			if (inputArray[i].charAt(lengthOfString-1) == 'S' || inputArray[i].charAt(lengthOfString-1) =='s')
			{
				System.out.println(inputArray[i]);
			}
		}
	}

}
