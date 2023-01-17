package com.smt.kata.word;

/****************************************************************************
 * <b>Title</b>: WordRank.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Word Rank
 * Take a phrase and evaluate each word in the phrase.  Add up all of the values for
 * each word.  Return the word in the phrase that has the highest value.  If two words
 * share the same value, use the first value.  The values will be a=1, b=2, ....
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 1, 2021
 * @updates:
 ****************************************************************************/
public class WordRank {

	/**
	 * 
	 */
	public WordRank() {
		super();
	}

	/**
	 * Ranks the words and returns the proper entry
	 * 
	 * @param phrase
	 * @return
	 */
	public String calculate(String phrase) {

		if (phrase == null) return "";
		
		String[] words = phrase.split(" ");
		System.out.println(words + "--words");
		String result = "";

		int currentVal = 0;

		for (String s : words) {
			int val = 0;
			char[] chars = s.toLowerCase().toCharArray();
			System.out.println(chars + "--chars");
			for (char c : chars) {
				val += c;
			}
			if (val > currentVal) {
				currentVal = val;
				System.out.println(currentVal + "--currentVal");
				result = s;
			
			}

		}
		return result;
	}
}
