package com.smt.kata.game;

import java.util.ArrayList;
// JDK 11.x
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/****************************************************************************
 * <b>Title</b>: LazyBartender.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Lazy Bartender Kata
 * 
 * At a popular bar, each customer has a set of favorite drinks, and will happily 
 * accept any drink among this set. For example, in the following situation, customer 
 * 0 will be satisfied with drinks 0, 1, 3, or 6.
 * 
 * preferences = {
 *     0: [0, 1, 3, 6],
 *     1: [1, 4, 7],
 *     2: [2, 4, 7, 5],
 *     3: [3, 2, 5],
 *     4: [5, 8]
 * }
 * 
 * A lazy bartender working at this bar is trying to reduce his effort by limiting 
 * the drink recipes he must memorize. Given a dictionary input such as the one 
 * above, return the fewest number of drinks he must learn in order to satisfy 
 * all customers.
 * 
 * For the input above, the answer would be 2, as drinks 1 and 5 will satisfy everyone.
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Nov 1, 2021
 * @updates:
 ****************************************************************************/
public class LazyBartender {
	
	List<List<Integer>> combos;

	/**
	 * Finds the minimum number of drinks the bartender has to memorize to satisfy all customers
	 * @param custDrinks Map of customers and their drink preferences
	 * @return Minimum number of drinks to memorize.
	 */
    public int minimumTypes(Map<Integer, List<Integer>> custDrinks) {
    	
        if (custDrinks == null) return 0;
        
        combos = new ArrayList<>();
        
        List<List<Integer>> drinks = new ArrayList<>();
        
        for (List<Integer> list : custDrinks.values()) {
            drinks.add(list);
        }
        
        getCombos(drinks, 0, new ArrayList<>());
        
        int min = Integer.MAX_VALUE;
        
        for (List<Integer> result : combos) {
            if (result.size() < min) {
                min = result.size();
            }
        }
        return min;
    }
    
    public void getCombos(List<List<Integer>> drinks, int curIndex, List<Integer> curList) {
        
    	if(curIndex == drinks.size()) {
            combos.add(curList);
            return;
        }
    	
        for (int num : drinks.get(curIndex)) {
        	
            List<Integer> newList = new ArrayList<>(curList);
            
            if (!curList.contains(num)) {
                newList.add(num);
            }
            
            getCombos(drinks, curIndex + 1, newList);
        }
        
    }
    
}




























