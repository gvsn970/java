package com.sample;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ssury";
			char ch[]=str.toCharArray();
		int len=str.length();
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(ch[i]==ch[j]){
					ch[j]=ch[len-1];
					len--;
					j--;
				}
				
			}
			
			
		}
		for(int k=0;k<len;k++){
			System.out.println(ch[k]);
		}

	}

}
