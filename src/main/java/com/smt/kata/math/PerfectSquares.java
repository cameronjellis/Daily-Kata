package com.smt.kata.math;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: PerfectSquares.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Write a program that determines the smallest number of 
 * perfect squares that sum up to N.
 * 
 * Here are a few examples:
 * 
 * Given N = 4, return 1 (4)
 * Given N = 17, return 2 (16 + 1)
 * Given N = 18, return 2 (9 + 9)
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 15, 2022
 * @updates:
 ****************************************************************************/
public class PerfectSquares {

	/**
	 * Finds the smallest number of squares that add to the total "n"
	 * 
	 * @param n Number to match the squares
	 * @return Number of squares to solve the matches
	 */
	public int findSmallestNumber(int n) {

		if (isSquare(n))
			return 1;
		List<Integer> list = getSquares(n);

		int returnCount = 4;
		int currentCount = 0;
		

		for (int i : list) {
			for (int j : list) {
				for (int k : list) {
					if ((i + j) == n) {
						currentCount = 2;
						if (currentCount < returnCount) {
							returnCount = currentCount;
						}
					} else if ((i + j + k) == n) {
						currentCount = 3;
						if (currentCount < returnCount) {
							returnCount = currentCount;
						}
					}
				}
			}
		}

		System.out.println("RC- " + returnCount);
		return returnCount;
	}

	public boolean isSquare(int n) {
		double sq = Math.sqrt(n);

		return (sq - Math.floor(sq) == 0);
	}

	public List<Integer> getSquares(int n) {
		List<Integer> sqList = new ArrayList();
		int nsq = (int) Math.sqrt(n);

		for (int i = 1; i < (nsq + 1); i++) {
			sqList.add(i * i);
		}
		return sqList;
	}

	public int findSmallest(int n) {

		// create an auxiliary array sqrs[], where sqrs[i] stores the minimum number
		// of squares that sum to `i`
		int[] sqrs = new int[n + 1];

		// fill the auxiliary array sqrs[] in a bottom-up manner
		for (int i = 0; i <= n; i++) {
			// initialize sqrs[i] with the maximum number of squares possible
			sqrs[i] = i;

			// loop through all positive integers less than or equal to the
			// square root of `i`
			for (int j = 1; j * j <= i; j++) {
				// calculate the value of sqrs[i] using the result of a smaller
				// subproblem sqrs[i-j×j]
				sqrs[i] = Integer.min(sqrs[i], 1 + sqrs[i - j * j]);
			}
		}

		return sqrs[n];
	}
}





