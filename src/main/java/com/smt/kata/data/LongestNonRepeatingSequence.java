package com.smt.kata.data;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: LongestNonRepeatingSequence.java <b>Project</b>: SMT-Kata
 * <b>Description: </b> Longest Substring Without Repeating Characters
 * 
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * Example 1: Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc",
 * with the length of 3.
 * 
 * Example 2: Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with
 * the length of 1.
 * 
 * Example 3: Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke",
 * with the length of 3. Notice that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 * 
 * Example 4: Input: s = "" Output: 0
 * 
 * Constraints: 0 <= s.length <= 5 * 104 s consists of English letters, digits,
 * symbols and spaces.
 * 
 * <b>Copyright:</b> Copyright (c) 2021 <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Oct 29, 2021
 * @updates:
 ****************************************************************************/
public class LongestNonRepeatingSequence {

	/**
	 * Locates the size of the longest substring without repeating characters
	 * 
	 * @param phrase Phrase to check
	 * @return size of the longest substring
	 */
	public int find(String phrase) {

		// [a,b,c,d,f,g,g]
		if (phrase == null || phrase.length() < 1)
			return 0;
		int longest = 0;

		String[] arr = phrase.split("");

		for (int i = 0; i < arr.length; i++) {
			List<String> list = new ArrayList<>();
			for (int j = i; j < arr.length; j++) {
				if (list.contains(arr[j].toLowerCase())) {
					break;
				} else {
					list.add(arr[j].toLowerCase());
				}
			}
			if (list.size() > longest) {
				longest = list.size();
			}
			System.out.println(list.size() + "list");
			System.out.println(longest + "long");
		}

		return longest;
	}

}
