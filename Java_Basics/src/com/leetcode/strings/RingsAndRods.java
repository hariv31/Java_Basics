package com.leetcode.strings;

/**
 * 
 * @author Hari Velayudam
 * 
 * @Problem There are n rings and each ring is either red, green, or blue. The
 *          rings are distributed across ten rods labeled from 0 to 9.
 * 
 *          You are given a string rings of length 2n that describes the n rings
 *          that are placed onto the rods. Every two characters in rings forms a
 *          color-position pair that is used to describe each ring where:
 * 
 *          The first character of the ith pair denotes the ith ring's color
 *          ('R', 'G', 'B'). The second character of the ith pair denotes the
 *          rod that the ith ring is placed on ('0' to '9'). For example,
 *          "R3G2B1" describes n == 3 rings: a red ring placed onto the rod
 *          labeled 3, a green ring placed onto the rod labeled 2, and a blue
 *          ring placed onto the rod labeled 1.
 * 
 *          Return the number of rods that have all three colors of rings on
 *          them.
 *
 */

public class RingsAndRods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rings="BBBBBBBBBBBBBBBB"; 
		System.out.println("No : "+countPoints(rings));
		
	}
	
	
	//Through the rods -- fill up the rod values and call a contains on the filled ones
	public static int countPoints(String rings) {
		
		String[] rods = new String[10];
		String[] ringsArr = rings.split("");
		
		// There is only 2 rings in total specified
		if(rings.length() <6) {
			return 0;
		}else {
			//populate the rods with the ring value
			int rodIndex = 0;
			int rodsWithAllThree=0;
			 for(int i=0; i < ringsArr.length-1;i+=2) {
				 rodIndex = Integer.parseInt(ringsArr[i+1]);
				 rods[rodIndex] = rods[rodIndex]+ ringsArr[i];
			 }
			 
			 
			 for(String rod: rods) {
				 if(rod !=null && rod !="") {
					 if(checkRGB(rod)) {
						 rodsWithAllThree ++;
					 }
				 }
			 }
			 return rodsWithAllThree;
		}
		
	}
	
	public static boolean checkRGB(String rodStr) {
		if(rodStr.contains("B") && rodStr.contains("G") && rodStr.contains("R")) {
			return true;
		}else {
			return false;
		}
	}

	
	// Through the colors method - look into the array of colors - for every rod in that color put in an entry for that rod
}
