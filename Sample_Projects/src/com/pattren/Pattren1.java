package com.pattren;

import java.util.Scanner;

public class Pattren1 {
	 int x=10;
	public static void main(String[] args) {
	/*	System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}*/
		String s1=new String("john");
		String s2=new String("smith");
		String s3=new String("john");
		String s4=s1;
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s2));
		}
}
