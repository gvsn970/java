package com.constructor;

public class MMMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={23,29,20,32,23,21,33,25};
		double sum=0,mean=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			
			mean=sum/a.length;
		}
		System.out.println("The Mean Is:"+mean);
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}

}
