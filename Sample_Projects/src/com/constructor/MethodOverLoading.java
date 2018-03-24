package com.constructor;

class P1
{
	 public void properties(int i){
		 System.out.println("INt-arg");
	 }
	 public void marry(String s){
		 System.out.println("Str-arg");
	 }
}
	 class C extends P1{
		 public void marry(String s){
			 System.out.println("Str1-args");
		 }
	 }

public class MethodOverLoading{

	public static void main(String[] argh) {
		// TODO Auto-generated method stub
		//System.out.println( "Hello" + args[0] );
		 int x;
	        x = argh.length;
	        for (int y = 1; y <= x; y++) 
	        {
	            System.out.print(" " + argh[y]);
	        }
	}

}
