package com.nfk.algorithms;


import java.util.Scanner;


class ArmstrongNumber {
	public static void main(String args[]) {
		
		int numberToCheck,temp, digit;
		int sum = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to check for ArmstrongNumber: ");
		numberToCheck = in.nextInt();
		temp = numberToCheck;
		
		while (numberToCheck > 0) {
			digit = numberToCheck % 10;
			numberToCheck = numberToCheck / 10;
			
			sum = sum + (digit * digit * digit);
		}
		
		if (temp == sum) {
			System.out.println("Number is Armstrong Number");
		}
		else
			System.out.println("Number is not Armstrong Number");
	}
}