package p1;

class MyThread implements Runnable
{

	String threadName;
	Thread t;
	public MyThread(String threadName) {
		this.threadName = threadName;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(threadName+" \t : "+i);
		}
	}
	
}
