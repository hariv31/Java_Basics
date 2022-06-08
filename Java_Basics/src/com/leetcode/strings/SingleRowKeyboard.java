package com.leetcode.strings;

public class SingleRowKeyboard {

	public static void main(String args[]) {
		String keyboard = "abcdefghijklmnopqrstuvwxyz";
		String word = "cba";
		int result = calculateTime(keyboard,word);
		System.out.println(result);
	}

	public static int calculateTime(String keyboard, String word) {
        // Create a char Arry of the keyboard
        // time =0, las_pos=0
        // At every pass find Math.abs(indexOfChar - las_pos) and add to time
        
        int time=0,las_pos=0,current_pos=0;
        char[] wordArr = word.toCharArray();
        
        for(char c: wordArr){
            current_pos=keyboard.indexOf(c);
            time += Math.abs(current_pos-las_pos);
            las_pos=current_pos;
        }
        
        return time;

	}
	

}
