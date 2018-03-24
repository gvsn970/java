package com.constructor;

public class PattrenDemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=1;
		for(int size=5;size>=1;size--){
			for(int i=1;i<=size;i++){
				System.out.print("*");
			}
			for(int j=s;j>1;j--){
				System.out.print("  ");
			}
			for(int i=size;i>=1;i--){
				System.out.print("*");
			}
			System.out.println();
			s++;
		}
		

	}

}
