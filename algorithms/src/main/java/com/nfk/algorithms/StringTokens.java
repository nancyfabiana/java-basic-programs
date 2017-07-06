package com.nfk.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		String[] splitStringArr= s.split("\\s|'|, |\\.|:|;|\\?|! ");
		
		System.out.println(splitStringArr.length);
		for (int i=0;i<splitStringArr.length; i++)
		{
			System.out.println(splitStringArr[i]);
		}
		

	}

}
