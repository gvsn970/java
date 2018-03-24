package com.constructor;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, pos, x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Array Size:");
		n=s.nextInt();
		int a[]=new int [n+1];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++){
			 a[i]=s.nextInt();
		}
		System.out.println("Enter Position where u want insert Element:");
		pos=s.nextInt();
		System.out.println("Enter Element:");
		x=s.nextInt();
		for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
             
           // System.out.println(a.length);
            
        }
		a[pos-1] = x;
	
		 System.out.print("After inserting:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(a[i]+",");
	        }
	       System.out.print(a[n]);
	}

}
