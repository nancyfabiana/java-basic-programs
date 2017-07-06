package com.nfk.algorithms;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class StringToHashMap {
	Map<String,Integer> magazineMap;
	Map<String,Integer> noteMap;
	public StringToHashMap(String magazine,String note)
	{
		magazineMap = new HashMap<String , Integer>();
		noteMap = new HashMap<String , Integer>();
		for(String word: magazine.split(" ") )
		{
			Integer i = magazineMap.get(word);
			if (i == null)
			{
				magazineMap.put(word, 1);
			}
			else
			{
				magazineMap.put(word,i+1);
			}
		}
		
		for(String word: note.split(" "))
		{
			Integer i = noteMap.get(word);
			if (i==null )
				noteMap.put(word, 1);
			else
				noteMap.put(word,i+1);;
		}
		
	}
	
	public boolean solve()
	{
		boolean isValid = true;
		for (Map.Entry<String, Integer> entry: noteMap.entrySet())
		{
			Integer i = (magazineMap.get(entry.getKey()));
			
			if ((i == null) || (entry.getValue()>i))
				isValid = false;
				
		}
		
		return isValid;
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int totalMagWords = in.nextInt();
		int totalNoteWords = in.nextInt();
		in.nextLine();
		String magazine = in.nextLine();
		String note = in.nextLine();
		
		StringToHashMap stoM = new StringToHashMap(magazine,note);
		boolean isSolved = stoM.solve();
		
		System.out.println(isSolved);
		
	}
}
