package com.smt.kata.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/****************************************************************************
 * <b>Title:</b> CountingParens.java <b>Project:</b> SMT-Kata
 * <b>Description:</b> Counting Parenthesis
 * 
 * Given a string of parentheses, write a function to compute the minimum number
 * of parentheses to be removed to make the string valid (i.e. each open
 * parenthesis is eventually closed).
 * 
 * For example, given the string "()())()", you should return 1. Given the
 * string ")(", you should return 2, since we must remove all of them.
 * 
 * Any non-alphanumeric characters (other than parenthesis) should be removed
 * from the source string
 * 
 * <b>Copyright:</b> Copyright (c) 2021 <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 2, 2021 <b>updates:</b>
 * 
 ****************************************************************************/
public class CountingParens {

	/**
	 * 
	 * @param parens
	 * @return
	 */

//	public int calculate(String parens) {
//		if (parens == null || parens.length() < 1)
//			return 0;
//		int openCount = 0;
//		int closedCount = 0;
//		int dif = 0;
//		for (char c : parens.toCharArray()) {
//			if (c == '(') {
//				++openCount;
//			}
//			if (c == ')') {
//				if (openCount == 0) {
//					++dif;
//				} else {
//					--openCount;
//				}
//			}
//		}
//		return Math.abs(openCount - closedCount) + dif;
//	}

	public int calculate(String parens) {
		if (parens == null || parens.length() == 0)
			return 0;

		String[] pArray = parens.split("");
		List<String> pList = new ArrayList<>();
		pList = Arrays.asList(pArray);
		List<String> rList = new ArrayList<>();

		for (int i = 0; i < pList.size(); i++) {
			String ch = pList.get(i);
			if (!ch.equals("(") && !ch.equals(")"))
				continue;
			if ("(".equals(ch)) {
				rList.add(ch);
			} else if (")".equals(ch) && !rList.isEmpty() && rList.get(rList.size() - 1).equals("(")) {
				rList.remove(rList.size() - 1);
			} else {
				rList.add(ch);
			}
		}

		return rList.size();
	}

}
