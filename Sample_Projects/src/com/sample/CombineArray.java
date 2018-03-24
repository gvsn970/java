package com.sample;

public class CombineArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,5,6,7,3};
		int b[]={8,3,36,27,13};
		int c[]=new int[a.length+b.length];
		//System.out.println(c.length);
		int count=0;
		int length=c.length;
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
			count++;
		}for(int j=0;j<b.length;j++){
			c[count++]=b[j];
		}
		for(int i=0;i<c.length;i++){
			//System.out.println(c[i]);
			for(int j=i+1;j<c.length;j++){
				if(c[i]>c[j]){
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
			for(int j=i+1;j<length;j++){
				if(c[i]==c[j]){
					c[j]=c[length-1];
					length--;
				}
			}
			System.out.println(c[i]);
		}
	}

}
