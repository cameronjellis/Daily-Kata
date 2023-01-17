package com.smt.kata.word;

// JDK 11.x
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/****************************************************************************
 * <b>Title</b>: AnagramGroup.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Group Anagrams
 * 
 * Given an array of strings strs, group the anagrams together. You can return 
 * the answer in any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a different 
 * word or phrase, typically using all the original letters exactly once.
 * 
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * 
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 * 
 * Constraints:
 * strs[i] consists of lower-case English letters.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 18, 2021
 * @updates:
 ****************************************************************************/
public class AnagramGroup {

	/**
	 * Group the anagrams together
	 * 
	 * @param words Array of words to group
	 * @return Groups of anagrams
	 */
	public Collection<List<String>> assign(String[] words) {
		if (words == null || words.length < 1) return new ArrayList<>();
		Set<List<String>> returnList = new HashSet<>();

		for (int i = 0; i < words.length; i++) {
			
			List<String> list = new ArrayList<>();
			if (words[i] == null || words[i].isEmpty()) continue;
			
			for (int j = 0; j < words.length; j++) {
				
				if (words[j] == null || words[j].isEmpty()) continue;
				
				char[] s = words[i].toCharArray();
				char[] w = words[j].toCharArray();

				Arrays.sort(s);
				Arrays.sort(w);
				
				if (Arrays.equals(s, w)) {
					list.add(words[j]);
				}
				
			}
			
			returnList.add(list);
		}

		System.out.println(returnList);

		return returnList;
	}

}
