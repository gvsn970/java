package com.pattren;

import java.util.Scanner;

public class pattren2 {

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=num;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
