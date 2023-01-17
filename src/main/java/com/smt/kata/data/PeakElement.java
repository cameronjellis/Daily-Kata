package com.smt.kata.data;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: PeakElement.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Peak Element Kata
 * 
 * A peak element is an element that is strictly greater than its neighbors.
 * 
 * Given an integer array nums, find a peak element, and return its index. If the 
 * array contains multiple peaks, return the index to all of the peaks.
 * 
 * You may imagine that nums[-1] = nums[n] = -∞.
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * 
 * Example 2:
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1, 5
 * Explanation: Your function can return either index number 1 where the peak 
 * element is 2, or index number 5 where the peak element is 6.

 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Aug 18, 2021
 * @updates:
 ****************************************************************************/
public class PeakElement {

	/**
	 * Finds all of the peak elements inside the provided array
	 * @param elements Array of elements to search for peaks
	 * @return Array of all peak element s (thier array index value)
	 */
	public Integer[] find(int[] elements) {
		if (elements == null) return new Integer[0];
		
		List<Integer> list = new ArrayList<>();		
		
		for (int i = 1; i < elements.length - 1; i ++) {
			
			int m = elements[i -1];
			int n = elements[i];
			int o = elements[i + 1];
			
			if (n > m && n > o) 
				list.add(i);
		}
		
		System.out.println(list);
		return  list.toArray(new Integer[list.size()]);
	}

}
