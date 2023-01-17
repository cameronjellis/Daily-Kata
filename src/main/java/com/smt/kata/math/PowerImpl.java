package com.smt.kata.math;

/**
 * The purpose of this Kata is to implement the Math.pow(num, pow) functionality yourself.
 *
 * The function should take in a double value and proper raise it by the given power.
 *
 * You cannot use any Math based libraries to perform the operations.
 *
 * See the test class for examples.
 *
 * @author raptor
 * @version 3.0
 * @since June 9, 2022
 *
 */
public class PowerImpl {

	public double calcPower(double num, int pow) {
		double powered = 1;

		if (pow > 0) {
			for (int i = 1; i < pow + 1; i++) {
				powered = powered * num;
			}
		} else {
			for (int i = -1; i > pow - 1; i--) {
				powered = powered / num;
			}
		}

		return powered;
	}
}
