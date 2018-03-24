package com.interview;

public class GcDemo {
	
	static GcDemo s;
	public static void main(String[] args) throws InterruptedException {
		
		GcDemo f=new GcDemo();
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(s.hashCode());
		f=null;
		System.gc();
		Thread.sleep(10000);
		System.out.println("End Of Main");
		
	}
	public void finalize(){
		System.out.println("Finalize Method called");
		//s=this;
	}

}
