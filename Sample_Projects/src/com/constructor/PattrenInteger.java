package com.constructor;

public class PattrenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<=5;i++){
				for(int j=1;j<=i;j++){
					if(j%2!=0)
						System.out.print(j);
				}
				System.out.println();
			}
	}

}
