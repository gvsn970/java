package com.constructor;

public class CharDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str="hi hyderabad hello";
	int count=0;
	char ch[]=str.toCharArray();
	int length=ch.length;
	for(int i=0;i<length;i++){
		for(int j=0;j<length;j++){
			if(ch[i] == ch[j]){
			count++;
			}
		}
		for(int k=i+1;k<length;k++){
			if(ch[i] == ch[k]){
				ch[k]=ch[length-1];
				length--;
			}
		}
		System.out.println(ch[i]+" "+count);
		count=0;
	}
	}

}
