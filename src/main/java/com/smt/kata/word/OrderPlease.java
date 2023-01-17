package com.smt.kata.word;

import java.util.Arrays;
import java.util.Comparator;

/****************************************************************************
 * <b>Title</b>: OrderPlease.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Order Please Kata
 * 
 * Our task is to sort a given string. Each word in the string will contain a 
 * single number. This number is the position the word should have in the result.
 * 
 * Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
 * 
 * If the input string is empty, return an empty string. The words in the input
 * String will only contain valid consecutive numbers.
 * If a word does not have a number, default it to 0
 * 
 * For Example:
 * Input: "is2 Thi1s T4est 3a"
 * Output: "Thi1s is2 3a T4est"
 * 
 * Input: "We1 1the p1eople i1n o1rder t1o 1form 1a 1more 1perfect 1union"
 * Output: "We1 1the p1eople i1n o1rder t1o 1form 1a 1more 1perfect 1union"
 * 
 * Input: "4of Fo1r pe6ople g3ood th5e the2"
 * Output: "Fo1r the2 g3ood 4of th5e pe6ople"
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 30, 2021
 * @updates:
 ****************************************************************************/
public class OrderPlease {

	
	public String reorder(String phrase) {
		if (phrase == null || phrase.length() == 0) {
			return "";
		}
		
		StringBuilder returnPhrase = new StringBuilder();
		
		String[] strArr = phrase.split(" ");
		int[] stringVals = new int[strArr.length];
		
		for (int i = 0; i < strArr.length; i++) {
			stringVals[i] = getVal(strArr[i]);
		}
		
		Arrays.sort(strArr, Comparator.naturalOrder());
		
		for (String s: strArr) {
			
			
			if (getVal(s) == 0) {
				returnPhrase.append(s);
			}
		}
		
		return returnPhrase.toString();
    }
	
	public int getVal(String string) {
		for (String s: string.split("")) {
			if (s.matches("[0-9]")) {
				return Integer.parseInt(s);
			}
		}		
		return 0;
		
	}
}




//String[] strArr = phrase.replaceAll("[a-zA-z]", "").split(" ");
//if (strArr.length == 0) {
//	return phrase;
//}
//
//
//String[] stringArray = phrase.split(" ");
//
//
//System.out.println(Arrays.asList(strArr));
//for (String s: strArr) {
//	
//	
//}
//
//return returnPhrase.toString();
