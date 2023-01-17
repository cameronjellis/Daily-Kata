package com.smt.kata.time;

import java.util.ArrayList;
import java.util.List;

/**
 * The Berlin Clock (Mengenlehreclock or Berlin Uhr) is a clock that tells the
 * time using a series of illuminated coloured blocks, as you can see in the
 * picture for this project.
 * 
 * https://agilekatas.co.uk/img/katas/kata_berlinclock.png
 * 
 * The top lamp blinks to show seconds- it is illuminated on even seconds (R)
 * and off on odd seconds (0).
 * 
 * The next two rows represent hours (R). The upper row represents 5 hour blocks
 * and is made up of 4 red lamps, off being (0). The lower row represents 1 hour
 * blocks and is also made up of 4 red lamps (R), off being (0).
 * 
 * The final two rows represent the minutes (Y). The upper row represents 5
 * minute blocks, and is made up of 11 lamps- every third lamp is red (R), the
 * rest are yellow (Y) or off (0). The bottom row represents 1 minute blocks,
 * and is made up of 4 yellow(Y) lamps, off being (0).
 * 
 * Requirements:
 * 
 * Input should be validated that it meets a 24H digital time format between
 * 00:00:00 through 23:59:59
 * 
 * GenerateTime should return a String representing
 * {sec}{5Hours}{1Hours}{5Minutes}{1Minute} Methods should return null if
 * invalid.
 * 
 * Examples:
 * 
 * Time 		Clock 
 * 00:00:00 	YOOOOOOOOOOOOOOOOOOOOOOO
 * 23:59:59		ORRRRRRROYYRYYRYYRYYYYYY
 * 16:50:06		YRRROROOOYYRYYRYYRYOOOOO
 * 11:37:01		ORROOROOOYYRYYRYOOOOYYOO
 * 
 * -01:00:00	null
 * 24:00:00		null
 * 23:59:60		null
 * 23:60:59		null
 * aa:bb:cc		null
 * 
 * @author raptor
 *
 */
public class BerlinClock {

	/**
	 * As a clock user I want to be able to see an entire clock So that I can tell
	 * what time it is at a glance
	 * 
	 * @param time
	 * @return
	 */
	public String generateTime(String time) {
		if (!validateTime(time)) return null;
		StringBuilder timeString = new StringBuilder();
		timeString.append(generateSeconds(time) + generateFiveHoursRow(time) + 
		generateSingleHoursRow(time) + generateFiveMinutesRow(time) + 
		generateSingleMinutesRow(time));
		
		return timeString.toString();
	}

	/**
	 * As a clock user I want to be able to see single minutes So that I can
	 * accurately tell the time down to the minute
	 * 
	 * @param time
	 * @return
	 */
	public String generateSingleMinutesRow(String time) {
		if (!validateTime(time)) return null;
		int minutes = splitTime(time).get(1)%5;
		StringBuilder minuteLights = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			if (i < minutes) {
				minuteLights.append("Y");
			} else {
				minuteLights.append("0");
			}
		
		}
		
		return minuteLights.toString();
	}

	/**
	 * As a clock user I want to be able to see five minutes So that I can tell
	 * higher minute amounts more easily at a glance
	 * 
	 * @param time
	 * @return
	 */
	public String generateFiveMinutesRow(String time) {
		if (!validateTime(time)) return null;
		int minutes = splitTime(time).get(1)/5;
		StringBuilder minuteLights = new StringBuilder();
		for (int i = 1; i < 12; i++) {
			if (i <= minutes) {
				if (i % 3 == 0) {
					minuteLights.append("R");
				} else {
					minuteLights.append("Y");
				}
				
			} else {
				minuteLights.append("0");
			}
		}	
		
		return minuteLights.toString();
	}

	/**
	 * As a clock user I want to be able to see single hours So that I can tell what
	 * hour it is
	 * 
	 * @param time
	 * @return
	 */
	public String generateSingleHoursRow(String time) {
		if (!validateTime(time)) return null;
		int hours = splitTime(time).get(0)%5;
		StringBuilder hourLights = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			if (i < hours) {
				hourLights.append("R");
			} else {
				hourLights.append("0");
			}
		}	
		return hourLights.toString();
	}

	/**
	 * As a clock user I want to be able to see five hours So that I can tell higher
	 * hour amounts more easily at a glance
	 * 
	 * @param time
	 * @return
	 */
	public String generateFiveHoursRow(String time) {
		if (!validateTime(time)) return null;
		int hours = splitTime(time).get(0)/5;
		StringBuilder hourLights = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			if (i < hours) {
				hourLights.append("R");
			} else {
				hourLights.append("0");
			}
		}	
		return hourLights.toString();
	}

	/**
	 * As a clock user I want to be able to see seconds passing So that I can see if
	 * my clock is working at a glance
	 * 
	 * @param time
	 * @return
	 */
	public String generateSeconds(String time) {
		
		if (!validateTime(time)) return null;
		
		int seconds = splitTime(time).get(2)%2;
		
		StringBuilder secondLight = new StringBuilder();
		if (seconds == 0) {
			secondLight.append("Y");
		} else {
			secondLight.append("0");
		}
		return secondLight.toString();
	}
	
	public List<Integer> splitTime(String time) {
		List<Integer> timeList = new ArrayList<>();
		String[] times = time.split(":");
			for (String t : times) {
				timeList.add(Integer.parseInt(t));
			}

		return timeList;
	}
	
	public boolean validateTime(String time) {
		String[] timeArray = time.split(":");
		if (timeArray.length != 3) return false;
		for (String t : timeArray) {
			try {
				Integer.parseInt(t);
			} catch (Exception e) {
				return false;
			}
		}
		
		return true;
	}
}
