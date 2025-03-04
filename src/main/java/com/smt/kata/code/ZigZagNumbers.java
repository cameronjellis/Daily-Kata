package com.smt.kata.code;

/****************************************************************************
 * <b>Title</b>: ZigZagNumbers.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Zigzag Numbers
 * 
 * For a given permutation of the numbers 1 to n, write code to determine if the 
 * numbers alternate up and down.
 * 
 * In {3,4,2,6,1,5}, the values go ↑↓↑↓↑, so this is an alternating permutation. 
 * In {7,4,6,2,1,5,3}, the values go ↓↑↓↓↑↓, so this not an alternating permutation.
 * 
 * Write a function AlternatingPermutationQ that takes a permutation of numbers 
 * from 1 to n and returns either True or False, according to whether the permutation 
 * is alternating or not.
 * 
 * AlternatingPermutationQ[{3, 4, 2, 6, 1, 5}]
 * True
 * 
 * AlternatingPermutationQ[{7, 4, 6, 2, 1, 5, 3}]
 * False
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 17, 2021
 * @updates:
 ****************************************************************************/
public class ZigZagNumbers {

	/**
	 * Determines if the numbers in the source provided ho up and down (zig and zag)
	 * 
	 * @param source Array of numbers to evaluate
	 * @return True if a zig zgag array. False otherwise
	 */
	public boolean isZigZag(int[] source) {
		
		if (source == null || source.length < 2) {
			return false;
		}
		// if [i] > i+1
		// else if i < i+1
		boolean greater = (source[0] > source[1]);
		for (int i = 0; i < source.length - 1; i++) {
			if (source[i] < source[i + 1]) {
				if (greater) {
					return false;
				} else {
					greater = true;
				}
			}
			else if (source[i] > source[i + 1]) {
				if (!greater) {
					return false;
				} else {
					greater = false;
				}

			} else return false;

		}

		return true;
	}
}
