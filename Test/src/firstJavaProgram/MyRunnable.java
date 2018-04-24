package firstJavaProgram;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyRunnable implements Runnable {
	private volatile boolean active;
	public void run(){
		active = true;
		while (active) {
			
		}
	}
	public int stop(){
			active = false;
			return 0;
	}


}
