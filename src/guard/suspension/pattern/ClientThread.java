package guard.suspension.pattern;

import java.util.Random;

public class ClientThread extends Thread{
	
	private RequestQueue requestQueue ;
	private String name;
	private Random random ;
	public ClientThread(RequestQueue requestQueue,String name,long seed) {
		super(name);
		this.requestQueue = requestQueue;
		this.random = new Random(seed);
	}
	
	public void run() {
		
		for(int i =0;i<10000;i++) {
			Request request = new Request("No." + i);
			System.out.println(Thread.currentThread().getName() + "request : " + request);
			requestQueue.putRequest(request);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
