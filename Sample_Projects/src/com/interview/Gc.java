package com.interview;

import java.util.Date;

public class Gc {

	public static void main(String[] args) {
	/*	Runtime r=Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		for(int i=1;i<20000;i++){
			Date d=new Date();
			d=null;
		}
		System.out.println(r.freeMemory());
	//	r.gc();
		System.out.println(" Total Free Memory"+r.freeMemory());*/
		
		//String s=new String("surya");
	/*	Gc s=new Gc();
		s.finalize();
		s.finalize();
		s=null;
		System.gc();
		System.out.println("end of main");
		
	}*/
	/*public void finalize(){
		System.out.println("class fina");
	}*/
		
		String s1=new String("surya");
		String s2=new String("surya");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		
		StringBuffer sb1=new StringBuffer("surya");
		StringBuffer sb2=new StringBuffer("surya");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
}
}
