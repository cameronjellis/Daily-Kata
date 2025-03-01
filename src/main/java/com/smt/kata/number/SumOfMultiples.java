package com.smt.kata.number;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title:</b> SumOfMultiples.java <b>Project:</b> SMT-Kata
 * <b>Description:</b> Sum of Multiples Given a number, find the sum of all the
 * unique multiples of particular numbers up to but not including that number.
 * 
 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
 * get 3, 5, 6, 9, 10, 12, 15, and 18.
 * 
 * The sum of these multiples is 78.
 * 
 * <b>Copyright:</b> Copyright (c) 2021 <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Mar 31, 2021 <b>updates:</b>
 * 
 ****************************************************************************/
public class SumOfMultiples {
	/**
	 * Default Constructor
	 */
	public SumOfMultiples() {
		super();
	}

	/**
	 * Calculates the sum of the multiples of the given max value. The factors are 1
	 * to n values
	 * 
	 * @param maxValue Maximum value to calculate the multiples. Multiples must be
	 *                 LESS than the max Value
	 * @param factors  Factors used to calculate the multiples
	 * @return Sum of the multiples
	 */
	public int calculate(int maxValue, Integer... factors) {

		List<Integer> list = new ArrayList<>();
		int sum = 0;

		for (int i = 1; i < maxValue; i++) {
			for (int j = 0; j < factors.length; j++) {
				if (i % factors[j] == 0 && !list.contains(i)) {
					list.add(i);
				}
			}
		}

		for (int num : list) {
			sum = sum + num;
		}

		return sum;
	}
}
