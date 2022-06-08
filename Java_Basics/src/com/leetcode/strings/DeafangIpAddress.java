package com.leetcode.strings;

public class DeafangIpAddress {

	public static void main(String args[]) {
		String address="255.234.336.25";
		String result = defangIpAddress(address);
		System.out.println(result);
	}
	
	public static String defangIpAddress(String address) {
		  	char[] cArr=address.toCharArray();
	        StringBuilder result= new StringBuilder();
	        for(char c: cArr){
	            if(!(c=='.')){
	                result.append(c);     
	            }else{
	                result.append("[.]");     
	            }            
	        }
	        return result.toString();
	}
}
