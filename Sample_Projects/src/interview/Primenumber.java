package interview;

public class Primenumber {
	public static  boolean isprime(int n){
		int count=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				count++;
			}
			
		}
		if(count>2){
			return false;
		}else{
			return true;	
		}
		
	}
	public static void main(String[] args) {
		for(int i=1;i<14;i++){
			if(isprime(i)){
				System.out.println(i);
			}
		}
	}

}
