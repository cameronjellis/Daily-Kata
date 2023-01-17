package com.smt.kata.sequence;

import java.util.ArrayList;

import java.util.List;


/****************************************************************************
 * <b>Title</b>: LongestSubarray.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Longest SubArray Kata
 * 
 * Given an array of elements, return the length of the longest subarray where 
 * all its elements are distinct.
 * 
 * For example, given the array [5, 1, 3, 5, 2, 3, 4, 1], return 5 as the 
 * longest subarray of distinct elements is [5, 2, 3, 4, 1]

 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 18, 2022
 * @updates:
 ****************************************************************************/
public class LongestSubarray {

	/**
	 * Finds the longest subsequence of distinct elements in the array
	 * 
	 * @param sequence Array of values to process
	 * @return Length of the longest distinct sub-array
	 */
	public int find(int[] sequence) {

		int length = 0;

		if (sequence == null || sequence.length < 1)
			return 0;

		for (int i = 0; i < sequence.length; i++) {
			List<Integer> sub = new ArrayList<>();
			sub.add(sequence[i]);

			for (int j = i + 1; j < sequence.length; j++) {

				if (sub.contains(sequence[j])) break;
				
				sub.add(sequence[j]);	
			}
			
			if (sub.size() > length) {
				length = sub.size();
			}

		}

		return length;
	}
}
