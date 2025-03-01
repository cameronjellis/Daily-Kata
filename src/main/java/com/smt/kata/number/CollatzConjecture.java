package com.smt.kata.number;

/****************************************************************************
 * <b>Title:</b> CollatzConjecture.java <b>Project:</b> SMT-Kata
 * <b>Description:</b> Collatz Conjecture
 * 
 * The Collatz Conjecture or 3x+1 problem can be summarized as follows:
 * 
 * Take any positive integer n. If n is even, divide n by 2 to get n / 2. If n
 * is odd, multiply n by 3 and add 1 to get 3n + 1. Repeat the process
 * indefinitely. The conjecture states that no matter which number you start
 * with, you will always reach 1 eventually.
 * 
 * Given a number n, return the number of steps required to reach 1.
 * 
 * Examples Starting with n = 12, the steps would be as follows:
 * 
 * 12 6 3 10 5 16 8 4 2 1
 * 
 * Resulting in 9 steps. So for input n = 12, the return value would be 9.
 * 
 * <b>Copyright:</b> Copyright (c) 2021 <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 31, 2021 <b>updates:</b>
 * 
 ****************************************************************************/
public class CollatzConjecture {

	/**
	 * Default constructor
	 */
	public CollatzConjecture() {
		super();
	}

	/**
	 * Calculates the collatz number
	 * 
	 * @param n
	 * @return
	 */
	public int calculate(int n) {
		if (n == 0)
			return 0;
		n = Math.abs(n);
		int steps = 0;

		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			steps++;
		}

		return steps;
	}
}
