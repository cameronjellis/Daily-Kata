package com.smt.kata.time;

// JDK 11.x
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/****************************************************************************
 * <b>Title</b>: KeyCardAlert.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Key Card Alert Kata
 * 
 * Alert Using Same Key-Card Three or More Times in a One Hour Period
 * 
 * LeetCode company workers use key-cards to unlock office doors. Each time a worker 
 * uses their key-card, the security system saves the worker's name and the time 
 * when it was used. The system emits an alert if any worker uses the key-card 
 * three or more times in a one-hour period.
 * 
 * You are given a list of strings keyName and keyTime where [keyName[i], 
 * keyTime[i]] corresponds to a person's name and the time when their key-card was 
 * used in a single day.
 * 
 * Access times are given in the 24-hour time format "HH:MM", such as "23:51" and "09:49".
 * 
 * Return a list of unique worker names who received an alert for frequent keycard use. 
 * Sort the names in ascending order alphabetically.
 * 
 * Notice that "10:00" - "11:00" is considered to be within a one-hour period, 
 * while "22:51" - "23:52" is not considered to be within a one-hour period.
 * 
 * Example 1:
 * Input:   keyName = ["daniel","daniel","daniel","luis","luis","luis","luis"], 
 * 		 	keyTime = ["10:00","10:40","11:00","09:00","11:00","13:00","15:00"]
 * Output: ["daniel"]
 * Explanation: "daniel" used the keycard 3 times in a one-hour period ("10:00","10:40", "11:00").
 * 
 * Example 2:
 * Input: 	keyName = ["alice","alice","alice","bob","bob","bob","bob"], 
 * 			keyTime = ["12:01","12:00","18:00","21:00","21:20","21:30","23:00"]
 * Output: ["bob"]
 * Explanation: "bob" used the keycard 3 times in a one-hour period ("21:00","21:20", "21:30").
 * 
 * Constraints:
 * 1 <= keyName.length, keyTime.length <= 105
 * keyName.length == keyTime.length
 * keyTime[i] is in the format "HH:MM".
 * [keyName[i], keyTime[i]] is unique.
 * 1 <= keyName[i].length <= 10
 * keyName[i] contains only lowercase English letters.

 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 29, 2022
 * @updates:
 ****************************************************************************/
public class KeyCardAlert {

	/**
	 * Finds the appropriate users that keyed in 3+ times in an hour
	 * @param keyName Log of names
	 * @param keyTime Log of times
	 * @return List of names that met the criteria from above
	 */
	
	
	
    public static List<String> find(String[] keyName, String[] keyTime) {
    	
    	HashMap<String, String> keyCardMap = new HashMap<String, String>();
    	
    	for (int i = 0; i < keyName.length; i ++) {
    		keyCardMap.put(keyName[i], keyTime[i]);
    	}
    	
    	
    	
    	return new ArrayList<>();
    }

}
