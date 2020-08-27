package p1;

class MyTaskThread extends Thread
{

	String threadName;
	
	public MyTaskThread(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName+" \t : "+i);
		}
	}
	
	
}//end of thread

public class Demo2 {

	public static void main(String[] args) {
		
		
		MyTaskThread t1 = new MyTaskThread("task 1");
		t1.start();
	
		MyTaskThread t2 = new MyTaskThread("task 2");
		t2.start();
	
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String threadName = Thread.currentThread().getName();
			
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName+" \t : "+i);
		}
	}
}




