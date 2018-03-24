package com.sample;

import java.util.Scanner;

public class RevOfNumber {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=scanner.nextInt();
		int temp=num;
		int rev=0;
		while(num!=0){
			int digit=num%10;
			System.out.println(digit);
			rev=rev*10+digit;
			num=num/10;
			
			System.out.println(num);
		}
		System.out.println(rev);
		if(temp==rev)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
