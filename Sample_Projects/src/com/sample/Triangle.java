package com.sample;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0;i<5;i++){
			for(int j=4;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<4;i++){
			for(int k=4;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

			int z=0;
			z+=2;
			
			System.out.println(z);
	}

}
