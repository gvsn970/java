package com.sample;

public class PattrenString {

	public static void main(String[] args) {
		String str="abc";
		String rev="";
		int length=str.length();
		for(int i=0;i<=length-1;i++){
			rev=rev+str.charAt(i);
			System.out.println(rev);
		}

	}

}
