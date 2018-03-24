package com.constructor;

public class CountRepating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,1,1,5,7,4,4,8,8};
		int length=a.length;
		int count=0;
		for(int i=0;i<length;i++){
		for(int j=0;j<length;j++){
			if(a[i]== a[j]){
				count++;
			}
		}
		for(int k=i+1;k<length;k++){
			if(a[i] == a[k]){
				a[k]=a[length-1];
				length--;
			}
		}
		System.out.println(a[i]+" "+count);
		
			count=0;
		}
		

	}

}
