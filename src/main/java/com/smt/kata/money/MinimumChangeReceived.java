package com.smt.kata.money;

/****************************************************************************
 * <b>Title</b>: MinimumChangeReceived.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Minimum Coins Received
 * 
 * Find the minimum number of coins required to make n cents.
 * 
 * You can use standard American denominations, that is, 1¢, 5¢, 10¢, and 25¢.
 * 
 * For example, given n = 16, return 3 since we can make it with a 10¢, a 5¢, and a 1¢.
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 3, 2022
 * @updates:
 ****************************************************************************/
public class MinimumChangeReceived {

	/**
	 * Calculates the smallest number of coins in the change
	 * @param dAmt
	 * @return
	 */
	public int calculate(double dAmt) {
		int count = 0;
		
		int amt = (int)(dAmt * 100);
		
		if (amt < 1) return 0;
		
		int[] coins = {25, 10, 05, 01};
			
		for (int coin : coins) {
			count += amt/coin;
			amt = amt%coin;
		}
		return count;
	}

}
