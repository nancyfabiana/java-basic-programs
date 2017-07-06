package com.nfk.algorithms;

public class PalindromeCheck {

	private String inString = "";
		
	public PalindromeCheck(String inputString) {
			inString = inputString;
	}
	
	public boolean isPalindrome()
	{
		boolean isPalindrome = false;
		String reverseStr = reverse(inString);
		if (inString.equals(reverseStr))
			isPalindrome = true;
		
		return isPalindrome;
	}
		

	public String reverse (String inStr)
	{
	StringBuffer reverseStr = new StringBuffer("");
	
	for (int i=inStr.length()-1; i>=0; i--)
	{
		reverseStr.append(inStr.charAt(i));
		
	}
	
	return reverseStr.toString();
		
	}
	
	
	public static void main(String args[])
	{
		PalindromeCheck checkPal = new PalindromeCheck("abc");
		boolean isPal = checkPal.isPalindrome();
		
		System.out.println(isPal);
		
	}
}
