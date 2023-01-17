package com.smt.kata.letters;

import java.util.List;
import java.util.stream.Collectors;

/****************************************************************************
 * <b>Title</b>: RearrangeCharacters.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Rearrange Charcters Kata
 * 
 * Given a string s, rearrange the characters so that any two adjacent characters 
 * are not the same. If this is not possible, return null.
 * 
 * For example, if s = yyz then return yzy. If s = yyy then return ""

 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 27, 2022
 * @updates:
 ****************************************************************************/
public class RearrangeCharacters {

	/**
	 * Rearranges letters in the word such that no two letters of the same are 
	 * adjacent to each other
	 * @param word Word to rearrange the letters
	 * @return Rearranged word
	 */
	public String arrange(String word) {
		
		List<Character> chars = word.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
		
		while(hasDoubles(chars.toString())) {
			for (int i = 1; i < chars.size(); i++) {
				Character j = chars.get(i-1);
				Character k = chars.get(i);
				System.out.println(chars.get(i));
				if (j.equals(k)) {
					chars.remove(k);
					chars.add(i+1, k);		
				}
			}
		}
		
		return chars.toString();
	}
	
	public boolean hasDoubles(String s) {
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) return true;
		}
		
		return false;
	}
}
