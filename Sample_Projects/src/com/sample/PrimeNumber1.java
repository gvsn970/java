package com.sample;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=s.nextInt();
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%2==0){
				count++;
			}
		}
		if(count>2){
			System.out.println("Not PrimeNumber");
		}
		else{
			System.out.println("Prime Number");
		}
	}
}
