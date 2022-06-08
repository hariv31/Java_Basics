package com.leetcode.strings;

public class CountNumberOfConsistent {

	public static void main(String args[]) {
		String[] s = new String[]{"ad","bd","aaab","baa","badab"};
		String allowed  = "ab";
		int result = countConsistentStrings(allowed, s);
		System.out.println(result);
	}


    public static int countConsistentStrings(String allowed, String[] words) {
        char[] cArr;
        char[] allChar = allowed.toCharArray();
        int result=0;
        boolean isInconsistent = false;
        for(String word: words){
            isInconsistent = false;
            System.out.println(word);
            cArr = word.toCharArray();
            for(char c: cArr){
                if(!isAllowed(allChar,c)){
                    isInconsistent = true;
                    break;
                }    
            }           
            if(!isInconsistent){
             result++;   
            }
        }
        return result;
    }
    
    public static boolean isAllowed(char[] allowed, char c){
        boolean result = false;
        for(char c1: allowed){
        	//System.out.println("c1 :"+c1+" c: "+c);
            if(c1==c){
            	System.out.println("Fails for c1 :"+c1+" c: "+c);
                result = true;
            }    
        }              
        return result;
    }
}
