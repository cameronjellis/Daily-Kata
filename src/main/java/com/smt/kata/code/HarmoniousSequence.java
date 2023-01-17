package com.smt.kata.code;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: HarmoniousSequence.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Longest Harmonious Sequence Kata
 * 
 * We define a harmonious array as an array where the difference between its 
 * maximum value and its minimum value is exactly 1.
 * 
 * Given an integer array nums, return the length of its longest harmonious 
 * subsequence among all its possible subsequences.
 * 
 * A subsequence of array is a sequence that can be derived from the array by 
 * deleting some or no elements without changing the order of the remaining elements.
 * 
 * Example 1:
 * Input: nums = [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * 
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: 2
 * 
 * Example 3:
 * Input: nums = [1,1,1,1]
 * Output: 0
 * 
 * Constraints:
 * 1 <= nums.length <= 2 * 104
 * -109 <= nums[i] <= 109
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Sep 16, 2021
 * @updates:
 ****************************************************************************/
public class HarmoniousSequence {

	/**
	 * Calculates the Longest Harmonious Sequence
	 * @param sequence Numbers to use to calculate
	 * @return total items in the harmonious sequence
	 */
	public int getLongest(int[] sequence) {
		
		if (sequence == null || sequence.length < 2) return 0;
		int longest = 0;		
		
		for (int i = 0; i < sequence.length-1; i ++) {			
			List <Integer> list = new ArrayList<>();
			list.add(sequence[i]);
			
			for (int j = i+1; j < sequence.length; j++) {				
				if (Math.abs(sequence[j]-sequence[i]) == 1) {
					list.add(sequence[j]);
				}
			}
			
			if (list.size() > longest) {
				longest = list.size();
			}
		}
		
		if (longest < 2) return 0;
		
		return longest;
	}
}
