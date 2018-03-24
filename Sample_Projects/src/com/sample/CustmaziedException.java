package com.sample;

import java.util.Scanner;

class TooYoung extends RuntimeException{
	TooYoung(String s){
		super(s);
	}
}
class Tooold extends RuntimeException{
	Tooold(String s){
		super(s);
	}
}
public class CustmaziedException {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
				
		if(i>60){
			throw new TooYoung("Your Age TOO A late");
		}else if(i<18){
			throw new Tooold("your age low");
		}else{
			System.out.println("welcome");
		}
	}

}
