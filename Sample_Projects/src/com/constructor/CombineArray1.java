package com.constructor;

public class CombineArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,5,6,7,3};
		int b[]={8,3,36,27,13};
		int count=0;
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
			count++;
			//System.out.println(c[i]);
		}for(int j=0;j<b.length;j++){
			c[count++]=b[j];
			//System.out.println(c[j]);
		}
		for(int i=0;i<c.length;i++){
		System.out.println(c[i]);
		}

	}

}
