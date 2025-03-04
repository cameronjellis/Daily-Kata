package com.smt.kata.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a list and a number, create a new list that contains each number of list
 * at most N times, without reordering.  For example if the input number is 2, 
 * and the input list is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next 
 * [1,2] since this would lead to 1 and 2 being in the result 3 times, and then
 * take 3, which leads to [1,2,3,1,2,3].  With list [20,37,20,21] and number 1, 
 * the result would be [20,37,21].
 * 
 * Results:
 * removeOccurances should always return an array, empty if validation fails.
 * 
 * validation:
 * data should not be null
 * maxOccurances should not be negative.
 * 
 * @author raptor
 *
 */
public class RemoveNOccurances {

	public int [] removeOccurances(int [] data, int maxOccurances) {
		if (data == null) return new int[0];
				
		Map<Integer, Integer> hm = new HashMap();
		List<Integer> result = new ArrayList();
		
		for (int num : data) {		
			hm.putIfAbsent(num, 0);
			hm.put(num, hm.get(num)+1);
			if (hm.get(num) <= maxOccurances) {
				result.add(num);
			}
		}	
		
    return result.stream().mapToInt(i -> i).toArray();
	}
}
