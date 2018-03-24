package com.constructor;

public class sorting {
	
public static void main(String[] args) {
	int a[]={2,2,4,4,4,4,5,6,7,8,9,9};
	int length=a.length;
	int count=0;
	for(int i=0;i<length;i++){
		for(int l=i+1;l<length;l++){
			if(a[i]>a[l]){
				int temp=a[i];
				a[i]=a[l];
				a[l]=temp;
			}
		}
		for(int j=0;j<length;j++){
			if(a[i]==a[j]){
				count++;
			}
		}
		for(int k=i+1;k<length;k++){
			if(a[i]==a[k]){
				a[k]=a[length-1];
				length--;
			}
		}
		
		System.out.println(a[i]+" "+count);
		count=0;
	}
}

}
