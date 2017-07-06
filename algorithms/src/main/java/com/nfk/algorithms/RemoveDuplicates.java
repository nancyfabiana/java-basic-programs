package com.nfk.algorithms;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.HashSet;

class RemoveDuplicates {
	static void removeDuplicates(int[] inputArray) {
		Set<Integer> s = new LinkedHashSet<Integer>();
		for (int i=0; i<inputArray.length; i++) {
			s.add(inputArray[i]);
			
		}
		Object[] outputArray = s.toArray();
		
		System.out.println("Array without duplicates: ");
		
		for (int j=0; j<outputArray.length;j++)
		{
		System.out.println(outputArray[j] + "\t");
		}
	}
	
	static void removeDuplicatesWithoutCollection(int[] inputArray) {
		
		int numberOfElements = inputArray.length;
		
		for (int i=0; i<numberOfElements; i++) {
			for (int j=i+1;j<numberOfElements;j++) {
				if (inputArray[i] == inputArray[j]) {
					inputArray[j] = inputArray[numberOfElements-1];
					numberOfElements--;
					j--;
				}
			}
			
		}
		int[] outputArray = Arrays.copyOf(inputArray, numberOfElements);
		System.out.println("Array without duplicates: ");
		
		for (int j=0; j<outputArray.length;j++)
		{
		System.out.println(outputArray[j] + "\t");
		}
	}
	
	public static void main(String args[] ) {
		
		removeDuplicatesWithoutCollection(new int[] {1,24,35,35,1,47});
		removeDuplicates(new int[] {1,24,24,35,1,47});
		
	}
}
