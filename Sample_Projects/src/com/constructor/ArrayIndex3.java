package com.constructor;

import java.util.Scanner;

public class ArrayIndex3 {
	
	public static void main(String[] args) {
		/*int a[]={3,5,6,7,3};
		int b[]={8,3,36,27,13};
		int count=0;
		int c[]=new int [a.length+b.length];
		for(int i=0;i<a.length;i++){
			c[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++){
			c[count++]=b[j];
		}
		for(int k=0;k<c.length;k++){
			System.out.println(c[k]);
		}*/
		
		System.out.println("Enter an array size");
		Scanner s=new Scanner(System.in);
		int size =s.nextInt();
		int pos,x;
		int[] a=new int[size+1];
		for(int i=0;i<size;i++){
			a[i]=s.nextInt();
			
		}
		System.out.println("Enter Posstion u want");
		 pos=s.nextInt();
		 System.out.println("Enter Element:");
		 x=s.nextInt();
		 for(int i=(size-1);i>=(pos-1);i--){
			 a[i+1]=a[i];
		 }
		 a[pos-1]=x;
		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		}
		  System.out.print(a[size]);
	}

}
