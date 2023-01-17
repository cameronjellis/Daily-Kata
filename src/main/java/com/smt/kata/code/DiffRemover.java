package com.smt.kata.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a master int array and removes diff array.  Remove all instances of
 * elements in remove from master.
 * 
 * Example
 * 
 * master: {1,2,3,3,4,5,6}, remove: {1,3,5} => {2,4,6}
 * master: {1,2,3,3,4,5,6}, remove: {} => {1,2,3,3,4,5,6}
 * master: {1,2,3,3,4,5,6}, remove: {1,2,3,3,4,5,6} => {}
 * master: {}, remove: {1,3,5} => {}
 * 
 * Notes:
 * 
 * Order is not guaranteed on incoming lists but return should be ordered low->high
 * Method always returns an array, even if it is empty or inputs are null.
 * 
 * @author raptor
 *
 */
public class DiffRemover {

	public int[] deDiff(int[] master, int[] remove) {
		
		if (master == null || master.length == 0) return new int[0];
		if (remove == null || remove.length == 0) return master;
		
		
		List<Integer> list = new ArrayList<>();
		List<Integer> remList = Arrays.stream(remove).boxed().collect(Collectors.toList());
		
		for (Integer i : master) {
			if (!remList.contains(i)) {
				list.add(i);
			}
		}
		
		list.sort(null);
		System.out.println(list);
		
		int[] resultList = list.stream().mapToInt(i -> i).toArray();
				
		return resultList;
	}
}
