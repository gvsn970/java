package com.sample;

public class WithOutLoop {
	 static void loop(int n){
		if(n<=10)
		{
			System.out.println(n);
			loop(n+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop(1);
	}
}
