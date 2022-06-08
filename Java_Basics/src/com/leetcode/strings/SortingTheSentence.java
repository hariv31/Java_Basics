package com.leetcode.strings;

public class SortingTheSentence {

	public static void main(String args[]) {
		String s = "Myself2 Me1 I4 and3";
		String result = sortSentence(s);
		System.out.println(result);
	}

    public static String sortSentence(String s) {
    	String[] sArr = s.split(" ");
        String[] arr = new String[sArr.length];
        String result="";
        for(String temp: sArr){
            pushWordToIndex(temp, arr);
        }
        for(String resWord: arr){
            result+=" "+resWord;
        }
        return result.trim();
    }
    
    public static void pushWordToIndex(String temp, String[] arr){
    	
    	
        int len = temp.length();
        int i = temp.charAt(len-1) - '0';
        
        System.out.println("Length :"+len+" i Value "+i+" Word");
        
        arr[i-1] = temp.substring(0, len-1);
    }

}
