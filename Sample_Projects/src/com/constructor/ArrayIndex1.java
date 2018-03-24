package com.constructor;

import java.util.Scanner;

public class ArrayIndex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,1};
		int b[]=new int[a.length+1];
		System.out.println(b.length);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Postion Where u want Insert Element:");
		int pos=s.nextInt();
		System.out.println("Enter Element:");
		int x=s.nextInt();
		for(int i=b.length-1;i>=pos-1;i--){
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.print("After inserting:");
        for(int i = 0; i < b.length; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[a.length]);
	
	}

}
