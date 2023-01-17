package com.smt.kata.distance;

import java.util.Arrays;

/****************************************************************************
 * <b>Title</b>: PixelSwap.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Pixel Swap Kata
 * 
 * Given a 2-D matrix representing an image, a location of a pixel in the screen 
 * and a color C, replace the color of the given pixel and all adjacent same 
 * colored pixels with C.
 * 
 * For example, given the following matrix, and location pixel of (2, 2), and 'G' for green:
 * 
 * B B W
 * W W W
 * W W W
 * B B B
 * 
 * Becomes
 * 
 * B B G
 * G G G
 * G G G 
 * B B B
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jun 28, 2021
 * @updates:
 ****************************************************************************/
public class PixelSwap {
	public char[][] globalPix;
	/**
	 * Swaps the pixels at the given coords and contiguous coords with the same original color
	 * @param pixels Matrix of pixels
	 * @param coords Starting coords
	 * @param color New color in those 0ixels
	 * @return Updated pixel map
	 */
	public char[][] swap(char[][] pixels, int[] coords, char color) {
		if (pixels == null || coords == null || coords[0] >= pixels[0].length) return new char[0][0];
		globalPix = new char[pixels.length][pixels[0].length];
		
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[i].length; j++) {
				globalPix[i][j] = pixels[i][j];
			}
		}
		
		recurse(globalPix, coords[1], coords[0], color, globalPix[coords[1]][coords[0]]);
		
		return globalPix;
	}
	
	public void recurse(char[][] pixels, int x, int y, char toColor, char fromColor) {

		globalPix[y][x] = toColor;
		
		if (x < pixels[y].length - 1 && pixels[y][x + 1] == fromColor) {
			recurse(globalPix, x + 1, y, toColor, fromColor);
		}
		if (x > 0 && pixels[y][x - 1] == fromColor) {
			recurse(globalPix, x - 1, y, toColor, fromColor);
		}
		if (y < pixels.length - 1 && pixels[y + 1][x] == fromColor) {
			recurse(globalPix, x, y + 1, toColor, fromColor);
		}
		if (y > 0 && pixels[y - 1][x] == fromColor) {
			recurse(globalPix, x, y - 1, toColor, fromColor);
		}		
	}	
}
