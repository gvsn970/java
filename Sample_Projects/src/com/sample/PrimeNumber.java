package com.sample;

public class PrimeNumber {
	boolean  isPrime(int num){
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count>2){
			return false;
		}
		else{
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber p=new PrimeNumber();
		for(int i=1;i<=12;i++){
			if(p.isPrime(i))
			{
				System.out.println(i);
			}
		}
	}

}
