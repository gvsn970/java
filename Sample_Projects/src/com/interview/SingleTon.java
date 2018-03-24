package com.interview;

public class SingleTon {
	
	public static void main(String[] args) {
		
		Test r=Test.getTest();
		System.out.println(r+"Single");
	}

}

class Test{
	private static Test t=new Test();
	
	private Test(){
		
	}
	public static Test getTest(){
		System.out.println("SinglTon");
		return t;
	}
	
	
}
