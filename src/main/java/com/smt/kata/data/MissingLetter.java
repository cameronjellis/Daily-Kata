package com.smt.kata.data;

/****************************************************************************
 * <b>Title</b>: MissingLetter.java <b>Project</b>: SMT-Kata <b>Description:
 * </b> Create a method that takes an array of increasing letters and return the
 * missing letter. Tests will always have exactly one letter missing. The length
 * of the test array will always be at least two. Tests will be in one
 * particular case (upper or lower but never both). <b>Copyright:</b> Copyright
 * (c) 2021 <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jan 5, 2021
 * @updates:
 ****************************************************************************/
public class MissingLetter {

	/**
	 * 
	 */
	public MissingLetter() {
		super();
	}

	/**
	 * loops through the String[] and checks the current item to the previous
	 * 
	 * @param chars
	 * @return
	 */
	public char missingLetter(String[] chars) {
		char missed = '*';

		if (chars.length < 2) {
			return missed;
		}

		for (int i = 0; i < chars.length - 1; i++) {

			int ascii = chars[i].charAt(0);
			int next = chars[i + 1].charAt(0);
			if (ascii + 1 != next) {
				missed = (char) (ascii + 1);
			}
		}
		return missed;
	}

}
