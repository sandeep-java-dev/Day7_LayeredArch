package p2;

public class User implements Runnable 
{

	String name;
	String msg;
	ChatWindow chatWindow;
	
	Thread t;
	
	public User(String name,String msg,ChatWindow chatWindow) {
		
		this.name = name;
		this.msg = msg;
		this.chatWindow = chatWindow;
		
		t = new Thread(this);
		t.start();
	}


	@Override
	public void run() {
		chatWindow.displayMsg(msg,name);
	}
	
}
