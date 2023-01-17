package com.smt.kata.data;

// JDK 11
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: PatternDecoder.java 
 * <b>Project</b>: SMT-Kata 
 * <b>Description:</b> 
 * Given the mapping a = 1, b = 2, ... z = 26, and an encoded message,
 * count the number of ways it can be decoded. For example, the message '111'
 * would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'. You can
 * assume that the messages are decodable. For example, '001' is not allowed.
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class PatternDecoder {
	
	/**
	 * Decodes the given pattern
	 * 
	 * @param pattern Valid pattern to compare
	 * @return Collection of the matching patterns
	 */
//	public List<String> decodePattern(String pattern) {
//		List<String> list = new ArrayList<>();
//		
//		if (pattern == null || !pattern.matches("[0-9]+")) return new ArrayList<>();
//		
//		// create a map of letters and values
//		Map<String, String> map = new HashMap<>();
//		for (int i = 1; i < 27; i++) {
//			map.put(Character.toString(i + 96), Integer.toString(i));			
//		}
//		
//		System.out.println(map);
//		
//		// break the string down into every possible combination < 26
//		
//		// asign each one of those numbers to a letter value 
//		
//		// add to list 
//		
//		return list;
//	}
//}

//  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public List<String> decodePattern(String pattern) {
		if (pattern == null || !pattern.matches("[0-9]+"))
			return new ArrayList<>();
		List<String> words = new ArrayList<>();
		decodeLetter(pattern, "", words);
		return words;
	}

	private void decodeLetter(String pattern, String curWord, List<String> words) {
		if (pattern.length() == 0) {
			words.add(curWord);
			return;
		}

		int oneChar = Integer.parseInt(pattern.substring(0, 1));
		decodeLetter(pattern.substring(1), curWord + ((char) (oneChar + 96)), words);

		if (pattern.length() < 2)
			return;

		int twoChar = Integer.parseInt(pattern.substring(0, 2));
		if (twoChar <= 26)
			decodeLetter(pattern.substring(2), curWord + ((char) (twoChar + 96)), words);
	}
}
