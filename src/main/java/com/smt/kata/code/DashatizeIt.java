package com.smt.kata.code;

/****************************************************************************
 * <b>Title</b>: DashatizeIt.java 
 * <b>Project</b>: SMT-Kata 
 * <b>Description: </b> Dashatize It
 * 
 * Given a variable n,
 * 
 * If n is an integer, Return a string with dash'-'marks before and after each
 * odd integer, but do not begin or end the string with a dash mark. If n is
 * negative, then the negative sign should be removed.
 * 
 * If n is not an integer, return an empty value.
 * 
 * Ex:
 * dashatize(274) -> '2-7-4' 
 * dashatize(6815) -> '68-1-5'
 * 
 * <b>Copyright:</b> Copyright (c) 2021 
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since May 30, 2021
 * @updates:
 ****************************************************************************/
public class DashatizeIt {

	/**
	 * Formats the string of numbers into a Dashatize format
	 * @param input String to be processed.  All non numeric characters are omitted
	 * @return Formatted string.  Empty string if input is empty or null
	 */
    public String process(String input) {
    	StringBuilder s = new StringBuilder();
    	StringBuilder n = new StringBuilder();
    	
    	if (input == null || input.length() < 1) return s.toString();
    	
    	System.out.println(s + input + " <->1");
    	
    	for (int i = 0; i < input.length(); i++) {
    		char j = input.charAt(i);
    		if (Character.isDigit(j)) {
    			s.append(j);
    		} 
    	}	
    	
    	System.out.println(s + " <->2");
    	
    	for (int i = 0; i < s.length(); i++) {
    		int num = Integer.parseInt(String.valueOf(s.charAt(i)));
    		if ((num%2) == 0) {
    			n.append(s.charAt(i));
    		}
    		if ((num%2) != 0) {
    			if (i == 0) {
    				n.append(s.charAt(i) + "-");
    			} else if ((i == (s.length()-1))){
    				n.append(s.charAt(i) + "-");
    			} else {
    				n.append("-" + s.charAt(i) + "-");
    			}
    		}
    	}	
    	
    	System.out.println(n + " <->3");
    	return n.toString();
    }
}
