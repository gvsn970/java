package com.pattren;

import java.util.Scanner;

public class Flodtriangle {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int count=1;
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(count+++" ");
				count++;
			}
			System.out.println();
		}
		
	}

}
