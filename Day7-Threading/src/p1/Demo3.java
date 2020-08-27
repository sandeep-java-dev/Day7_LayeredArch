package p1;




public class Demo3 {
	public static void main(String[] args) {
		MyThread runnableObj = new MyThread("task 1");
		Thread t1 = new Thread(runnableObj); 
		
		t1.start();
	
	}

}
