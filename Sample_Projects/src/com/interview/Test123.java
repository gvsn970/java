package com.interview;

public class Test123 {
	
	int a=10;
	int b=20;
	static int c=30;
	static int d=40;
	void m1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
 static void m2(){

		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Test123 t=new Test123();
		t.m1();
		t.m2();
	}

}
