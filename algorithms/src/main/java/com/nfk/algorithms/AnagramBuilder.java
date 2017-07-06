package com.nfk.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class AnagramBuilder {



    public static int numberNeeded(String first, String second) {
        int matchCount=0;
        StringBuilder secondStr =new StringBuilder(second);
        int totalCount = first.length()+ secondStr.length();
      //gekshtlmn , forzgecks
        for (int i=0; i<first.length();i++)
            {
            for (int j=0; j<secondStr.length(); j++)
                {
                if((first.charAt(i) == secondStr.charAt(j)))
                    {
                		
                        matchCount++; 
                        //anagram.append(secondStr.charAt(j));
                        secondStr.deleteCharAt(j);
                        break;
                }
                }
            }
        //System.out.println("Anagram is :" + anagram.toString());
        return totalCount - matchCount*2;
        //}
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // String a = in.next();
        //String b = in.next();
        String a = "gehtlmknse";
        String b = "forzgeckse";
        System.out.println(numberNeeded(a, b));
    }
}
