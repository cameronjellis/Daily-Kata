package com.smt.kata.word;

/****************************************************************************
 * <b>Title</b>: SmallestStringGivenNumeric.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Smallest String With A Given Numeric Value Kata
 * 
 * The numeric value of a lowercase character is defined as its position (1-indexed) 
 * in the alphabet, so the numeric value of a is 1, the numeric value of b is 2, 
 * the numeric value of c is 3, and so on.
 * 
 * The numeric value of a string consisting of lowercase characters is defined as 
 * the sum of its characters' numeric values. For example, the numeric value of 
 * the string "abe" is equal to 1 + 2 + 5 = 8.
 * 
 * You are given two integers n and k. Return the lexicographically smallest string 
 * with length equal to n and numeric value equal to k.
 * 
 * Note that a string x is lexicographically smaller than string y if x comes 
 * before y in dictionary order, that is, either x is a prefix of y, or if i is 
 * the first position such that x[i] != y[i], then x[i] comes before y[i] in alphabetic order.
 * 
 * Example 1:
 * Input: n = 3, k = 27
 * Output: "aay"
 * Explanation: The numeric value of the string is 1 + 1 + 25 = 27, and it is the 
 * smallest string with such a value and length equal to 3.
 * 
 * Example 2:
 * Input: n = 5, k = 73
 * Output: "aaszz"
 * 
 * Constraints:
 * 1 <= n <= 105
 * n <= k <= 26 * n
 * 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 29, 2022
 * @updates:
 ****************************************************************************/
public class SmallestStringGivenNumeric {

	/**
	 * Finds the smallest matching string of n length and k value
	 * @param n Length of the response string
	 * @param k Value of the individual chars
	 * @return Smallest String.  "" if invalid data
	 */
	 
	
    public String getSmallestString(int n, int k) {
        // validate input
        if (n == 0 || n < 1 || n > 105 || k == 0 || k < n || k > 26*n) return "";
        
        // create result string of a's
        String result = "a".repeat(n);
        
        // starting at end of string, replace each a with "largest" possible char while sum < k
        for (int i = n-1; i >= 0; i--) {
            int diff = (k - sumString(result));
            if (diff == 0) break;
            
            char replaceVal = (diff >= 26) ? 'z' : (char) (diff + 97);
            result = replaceCharInString(result, i, replaceVal);
        }
        return result;
    }
    
    
    
    // gets sum of string according to rules specified
    public int sumString(String string) {
        int i = 0;
        for (char c: string.toCharArray()) {
            i += (int) (c - 96);
        }
        return i;
    }
    
    // replaces char at index in string with value
    public String replaceCharInString(String s, int index, char value) {
        return (s.substring(0, index) + value + s.substring(index + 1));
    }
}
