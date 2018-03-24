package com.constructor;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]={1,1,1,2,2,3,4,4,5,5,5};
		int[]a = {1,2,3,4};
		 int[]b = {5,6,7};
		 int[]c = new int[a.length+b.length];
		 int count=0;

		  for(int i=0; i<a.length; i++)
		    {
		       c[i]=a[i];
		       count++;
		    }
System.out.println(count);
		 for(int j=0;j<b.length;j++)
		    {
		       c[count++]=b[j];
		    }

		        for(int i=0;i<c.length;i++)
		        System.out.print(c[i]+" ");

	}
}
