package interview;

interface it1{
	 void m1();
	 abstract void m2();
	
}
interface it2 extends it1{
	void m1();
	abstract void m2();
	
}
interface it3 extends it1,it2{
	void m1();
	abstract void m2();
	
}
public class DemoInterface implements it1,it2,it3 {
	
	@Override
	public  void m1(){
		System.out.println("method1");
	}
	 public void m2(){
		System.out.println("method2");
	}
public static void main(String[] args) {

	DemoInterface dit=new DemoInterface();
	dit.m1();dit.m2();
	
	it1 t=new DemoInterface();
	t.m1();t.m2();
}



}
