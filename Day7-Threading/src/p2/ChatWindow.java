package p2;

public class ChatWindow {

	public void displayMsg(String msg,String username)
	{ // 1000 line to render msg to user
	
		System.out.println("A");
		
		synchronized (this) {
			System.out.println("[");
			
			 
			System.out.println(username);
			
			  
			System.out.println(msg);
			System.out.println("]");
			
		}
		
		System.out.println("B");
	}
}
