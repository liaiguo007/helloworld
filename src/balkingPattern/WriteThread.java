package balkingPattern;

import java.util.Random;

public class WriteThread extends Thread{

	private Data data ;
	private Random random = new Random();
	
	public WriteThread(String name,Data data) {
		super(name);
		this.data = data;
	}
	
	public void run() {
		
		for(int i =0;true;i++) {
			data.change("No + " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			data.save();
		}

	}
}
