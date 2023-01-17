package com.smt.kata.distance;

import java.util.ArrayList;
// JDK 11.x
import java.util.List;

/****************************************************************************
 * <b>Title</b>: IntersectingRectangles.java
 * <b>Project</b>: SMT-Kata
 * <b>Description: </b> Intersecting Rectangles Kata
 * 
 * Given two rectangles on a 2D graph, return the list of of their intersecting 
 * coordinates. If the rectangles don't intersect, return empty List.
 * 
 * For example, given the following rectangles:
 * 
 * {
 * 		"top_left": (1, 4),
 * 		"dimensions": (3, 3) # width, height
 * }
 * 
 * and
 * 
 * {
 * 		"top_left": (0, 5),
 * 		"dimensions": (4, 3) # width, height
 * }
 * 
 * return List with 6 coordinates 
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Jul 19, 2021
 * @updates:
 ****************************************************************************/
public class IntersectingRectangles {
	
	/**
	 * Finds the overlap between 2 rectangles
	 * @param one Starting coordinate of the first rectangle
	 * @param width1 width of the first rectangle
	 * @param height1 height of the first rectangle
	 * @param two Starting coordinate of the first rectangle
	 * @param width2 width of the first rectangle
	 * @param height2 height of the first rectangle
	 * @return List of overlapping coordinates
	 */
	public List<Coord> getOverlap(Coord one, int width1,  int height1, Coord two, int width2, int height2) {
		List<Coord> coords1 = new ArrayList<>();
		List<Coord> coords2 = new ArrayList<>();
		List<Coord> coordsCross = new ArrayList<>();
		
		if (one == null || two == null || width1<1 || height1<1 || width2<1 || height2<1) return coordsCross;
		
		for (int i = two.top; i < two.top + height2; i++) {
			for (int j = two.left; j < two.left + width2; j++) {
				Coord coord2 = new Coord(i, j);
				coords2.add(coord2);
			}
		}
				
		for (int i = one.top; i < one.top + height1; i++) {
			for (int j = one.left; j < one.left + width1; j++) {
				Coord coord1 = new Coord(i, j);
				coords1.add(coord1);
			}
		}

		for (int i = 0; i < coords1.size(); i++) {
			for (int j = 0; j < coords2.size(); j++) {
				if (coords1.get(i).top == coords2.get(j).top && coords1.get(i).left == coords2.get(j).left) {
					coordsCross.add(coords1.get(i));
				}
			}
		}
		
		return coordsCross;
	}
}

/**
 * Helper class to group the coordinates on the grid
 */
class Coord {
	int top = 0;
	int left = 0;
	
	/**
	 * Default constructor
	 */
	public Coord() {
		super();
	}
	
	/**
	 * Helper constructor
	 * @param top Top coordinate
	 * @param left Left coordinate
	 */
	public Coord(int top, int left) {
		this();
		this.top = top;
		this.left = left;
	}
	
//	@Override
//	public int hashCode() {
//		return 1; 
//	}
//	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Coord))
			return false;
		Coord c2 = (Coord) o;
		return (c2.left == this.left && c2.top == this.top);

	}
	
}

