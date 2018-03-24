package com.sample;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a  Number:");
		int num=s.nextInt();
		int temp=num;
		int amstr=0;
		while(num!=0){
			int digit=num%10;
			amstr=amstr+digit*digit*digit;
			num=num/10;
		}
		if(temp==amstr){
			System.out.println("Amstrong number");
		}else{
			System.out.println("Not Amstrong Number");
		}
	}

}
