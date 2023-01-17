package com.smt.kata.object;

import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: MatchstickToSquare.java <b>Project</b>: SMT-Kata
 * <b>Description: </b> Match Stick to Square Kata
 * 
 * You are given an integer array matchsticks where matchsticks[i] is the length
 * of the ith matchstick. You want to use all the matchsticks to make one
 * square. You should not break any stick, but you can link them up, and each
 * matchstick must be used exactly one time.
 * 
 * Return true if you can make this square and false otherwise.
 * 
 * Example 1:
 * https://assets.leetcode.com/uploads/2021/04/09/matchsticks1-grid.jpg Input:
 * matchsticks = [1,1,2,2,2] Output: true Explanation: You can form a square
 * with length 2, one side of the square came two sticks with length 1.
 * 
 * Example 2: Input: matchsticks = [3,3,3,3,4] Output: false Explanation: You
 * cannot find a way to form a square with all the matchsticks.
 * 
 * <b>Copyright:</b> Copyright (c) 2021 <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 26, 2021
 * @updates:
 ****************************************************************************/
public class MatchstickToSquare {
//	List<Integer> trueSides = new ArrayList<>();
	/**
	 * Determines if the match sticks can form a square
	 * 
	 * @param matchsticks Match sticks to evaluate
	 * @return True if they form a square, false otherwise
	 */
	public boolean canFormSquare(int[] matchsticks) {
		if (matchsticks == null || matchsticks.length < 4)
			return false;
		int sum = Arrays.stream(matchsticks).sum();
		int sideLength = sum / 4;
		int j = 0;
		int sl = 0;
		boolean bool = false;

		while (j < 5) {
			j++;
			for (int i = 0; i < matchsticks.length; i++) {
				int n = matchsticks[i];
				if (n - sl <= sideLength) {
					sl = sl + n;
					if (sl == sideLength) {
						bool = true;
						sl = 0;
					} else {
						bool = false;
					}
				}
			}
		}
		return bool;
	}
}
