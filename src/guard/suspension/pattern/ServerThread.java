package guard.suspension.pattern;

import java.util.Random;

public class ServerThread extends Thread{
	
	private RequestQueue requestQueue;
	private Random random;
	public ServerThread(RequestQueue requestQueue,String name,long seed) {
		super(name);
		this.requestQueue = requestQueue;
		random = new Random(seed);
	}
	
	public void run() {
		for(int i =0;i<1000;i++) {
			Request request = requestQueue.getRequest();
			System.out.println(Thread.currentThread().getName() + "handle : " + request);
			
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
