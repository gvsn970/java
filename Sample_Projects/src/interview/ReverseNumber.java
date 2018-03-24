package interview;

import java.io.InputStream;
import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	
	System.out.println("Enter a number:");
	Scanner s=new Scanner(System.in);
	int rev=0;
	int num=s.nextInt();
	int temp=num;
	while(num !=0){
		int digit=num%10;
		//rev=rev*10+digit;
		rev=rev+digit*digit*digit;
		num=num/10;
	}
	if(temp==rev){
		System.out.println("Amstrong number");
	}else{
		System.out.println("not amstrong number");
	}
	/*int sm=0;
	for(int i=0;i<num;i++){
		if(i%2==0){
			sm=sm+i;
		}
		
	}
	if(temp==sm){
		System.out.println("Perfect number");
	}else{
		*/System.out.println("not perfect number");
	}
}

