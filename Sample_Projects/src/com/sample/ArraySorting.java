package com.sample;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,56,5,54,32,32,3,5,2,6,56,54,32};
		int length=a.length;
		int count=0;
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				if(a[i]==a[j]){
					a[j]=a[length-1];
					length--;
					j--;
						count++;
				}
			}
			System.out.println(a[i]+"---->"+count);
		}
		

	}

}
