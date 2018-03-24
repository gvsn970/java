package com.constructor;

import java.util.Scanner;

public class ArrayIndex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Array Size:");
		int n=s.nextInt();
		int pos,x;
		int a[]=new int [n+1];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			//System.out.println(a[i]);
		}
		System.out.println("Enter Position where u want insert Element:");
		pos=s.nextInt();
		System.out.println("Enter Element:");
		x=s.nextInt();
		for(int i=(n-1);i>=(pos-1);i--){
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("After INserting :");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}

}
