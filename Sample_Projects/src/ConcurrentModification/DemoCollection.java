package ConcurrentModification;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoCollection  extends Thread{
	
	static ArrayList al=new ArrayList<>();
	
	public void run(){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Child Updateing List");
		al.add("D");
	}
	public static void main(String[] args) throws InterruptedException {

		al.add("A");
		al.add("B");
		al.add("C");
		DemoCollection dc=new DemoCollection();
		dc.start();
		Iterator it=al.iterator();
		while(it.hasNext()){
			String s1=(String)it.next();
			System.out.println("main thred itrartingLIst and Current Object is:"+s1);
			
			Thread.sleep(3000);
		}
		System.out.println(al);
	}

}
