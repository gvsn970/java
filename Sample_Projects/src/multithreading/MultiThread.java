package multithreading;

class MyThread implements Runnable{

	static Thread mt;
	@Override
	
	public void run() {
		try{
			mt.join();
		}catch(InterruptedException e){e.printStackTrace();}
		for(int i=0;i<=5;i++){
			
			System.out.println("Child Thread");
		}
		
	}
	
}
public class MultiThread  {

	public static void main(String[] args) throws InterruptedException {
		Thread mt=Thread.currentThread();
		MyThread t=new MyThread();	
		Thread tr=new Thread(t);
	tr.start();

		for(int i=0;i<=5;i++){
			System.out.println("Main thread");
			Thread.sleep(2000);
		}
	}
}
