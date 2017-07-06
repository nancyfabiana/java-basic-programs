package com.nfk.algorithms;
import java.util.*;

class TrailingZeroes {
	public static void main (String[] args) {
		//code
		System.out.println("Enter :");
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		int result = 0;
		for (int j=0;j<t;j++)
		{
		    int n = in.nextInt();
		    
		    for(int i=5;n/5>=1;i*=5)
		    {
		        result += n/i;
		    }
		    System.out.println(result);
		}
	}
}