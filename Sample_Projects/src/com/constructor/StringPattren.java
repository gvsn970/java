package com.constructor;

import java.util.Scanner;

public class StringPattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Size:");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int z=0;
			for(int i=size;i>=1;i--){
				for(int j=1;j<=i;j++){
					System.out.print((char)(j+64)+" ");
				}
				for(int s=size;s>i;s--){
					System.out.print("    ");
			
				}
				for(int k=i;k>=1;k--){
					System.out.print((char)(k+64)+" ");
				}
				
				System.out.println();
				
			}
			for(int i=2;i<=size;i++){
				
				for(int j=1;j<=i;j++){
					System.out.print((char)(j+64)+" ");
				}
				for(int s=size;s>i;s--){
					System.out.print("    ");
				}
				for(int k=i;k>=1;k--){
					System.out.print((char)(k+64)+" ");
				
				}
				
				System.out.println();
		
				
			}
		
		
	}

}
