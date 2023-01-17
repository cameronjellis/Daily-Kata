package com.smt.kata.data;

/****************************************************************************
 * <b>Title:</b> StringSequence.java <b>Project:</b> SMT-Kata
 * <b>Description:</b> StringSequence
 * 
 * Given two strings A and B, return whether or not A can be shifted some number
 * of times to get B.
 * 
 * For example:
 * 
 * if A is 123 and B is ab123cd return true as 123 is in b if A is abcde and B
 * is cdeab, return true. If A is abc and B is acb, return false.
 * 
 * <b>Copyright:</b> Copyright (c) 2021 <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 26, 2021 <b>updates:</b>
 * 
 ****************************************************************************/
public class StringSequence {

	/**
	 * Determines if the source string is in the destination. You must account for
	 * overflow from the end to the beginning
	 * 
	 * @param source Source string to use as the baseliene to be found
	 * @param dest   The string to test for the source string
	 * @return True if the source string is in the destination. False otherwise
	 */
	public boolean hasSequence(String source, String dest) {
		if (source == null || dest == null || source.length() == 0 || dest.length() == 0
				|| dest.indexOf(source.charAt(0)) == -1 || source.length() > dest.length())
			return false;

		source = source.toLowerCase();
		dest = dest.toLowerCase();

//		StringBuilder sb = new StringBuilder();

//		for (int i = dest.indexOf(source.charAt(0)); i < dest.length(); i++) {
//
//			sb.append(dest.charAt(i));
//
//			if (source.indexOf(sb.toString()) == -1) {
//				break;
//			}
//
//			if (source.equals(sb.toString())) {
//				return true;
//			}
//
//			if (i == dest.length() - 1) {
//				i = -1;
//			}
//		}

		String s = new String(dest + dest);

		return (s.indexOf(source) != -1);
	}

}
