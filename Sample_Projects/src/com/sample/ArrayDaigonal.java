package com.sample;

public class ArrayDaigonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int array[][]={{1,2,3,5,3},{1,5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				
				System.out.print(array[i][j]+" ");
				
				if(i+j==3){
					//System.out.println(array[i][j]);
					sum=array[i][j]+sum;
				}
				}
			System.out.println();
				
			}
		System.out.print(sum);
		}
		
	}


