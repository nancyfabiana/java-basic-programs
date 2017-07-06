package com.nfk.algorithms;


import static org.junit.Assert.*;

import org.junit.Test;

import com.nfk.algorithms.AnagramBuilder;

public class AnagramBuilderTest {

	@Test
	public void testNumberNeeded() {
		//fail("Not yet implemented");
		AnagramBuilder tester = new AnagramBuilder();
		assertEquals("Number: ",1, tester.numberNeeded("abcd", "abd"));
		assertEquals("Number: ",3, tester.numberNeeded("geeks", "forgeeks"));
		assertEquals("Number: ",6, tester.numberNeeded("abc", "cccdbbc"));
		assertEquals("Number: ",1, tester.numberNeeded("abcd", "abc"));
		assertEquals("Number: ",0, tester.numberNeeded("abcd", "dcba"));
		assertEquals("Number: ",10, tester.numberNeeded("gehtlmknse", "forzgeckse"));
		assertEquals("Number: ",7, tester.numberNeeded("gehtlmforknse", "forzgeckse"));
		
			
	}

}
