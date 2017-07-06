package com.nfk.algorithms;
import java.util.Scanner;

public class StringConcatenate {

	
	public static void main(String args[])
	{
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Strings separated by space : ");
		String s1 = in.next();
		String s2 = in.next();
		System.out.println("String 1 " + s1);
		System.out.println("String 2 " + s2);
		int s1Length = s1.length();
		int s2Length = s2.length();
		StringBuffer s3=new StringBuffer("");
		int length = (s1Length < s2Length) ? s1Length : s2Length;
		for (int i=0; i<length; i++)
		{
			s3.append(s1.charAt(i));
			s3.append(s2.charAt(i));
		}
		if (s1Length > s2Length)
			s3.append(s1.substring(length));
		else
			s3.append(s2.substring(length));
		System.out.println(s3.toString());
		
	}
}
