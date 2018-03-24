package interview;

class DemoCustom extends RuntimeException{
	DemoCustom(String s){
		super(s);
	}
}

public class CustomException {
	public static void main(String[] args) {
		int a=100;
		if(a>60){
			throw new DemoCustom("CustomExpton");
		}
	}
}
