package com.leetcode.strings;

public class ShuffleString {

	public static void main(String args[]) {
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String result = restoreString(s, indices);
		System.out.println(result);
	}

	public static String restoreString(String s, int[] indices) {

		// Core idea is to iterate over indices
		// get charAt(i) from input string and add char into a string
		int iLength = indices.length;
		char[] resultArr = new char[iLength];
		for (int i = 0; i < iLength; i++) {
			System.out.print(" I :" + i + " Char at :" + s.charAt(i) + " ---Indices  " + indices[i] + "--");
			resultArr[indices[i]] = s.charAt(i);
			System.out.println(String.valueOf(resultArr));
		}
		return new String(resultArr);

	}
	
    public String restoreString21(String s, int[] indices) {
        // String res = "";
        // for (int i = 0; i < indices.length; i++) {
        //     res += String.valueOf(s.charAt(indices[i]));
        // }
        // return res;
        char[] c = new char[indices.length];
        for(int i = 0; i < indices.length; i++)
            c[indices[i]] = s.charAt(i);
        return new String(c);
    
    }
}
