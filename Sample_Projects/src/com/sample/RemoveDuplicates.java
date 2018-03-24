package com.sample;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[]={5,9,9,2,3,4,5,3,4,7,6,7,3,3};
		int len=a.length;
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(a[i]==a[j]){
					a[j]=a[len-1];
					len--;
					j--;
				}
				
			}
			System.out.println(a[i]);
		}
	}

}
