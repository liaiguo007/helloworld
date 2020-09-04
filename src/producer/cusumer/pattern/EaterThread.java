package producer.cusumer.pattern;

import java.util.Random;

public class EaterThread extends Thread {
	
	private Table table ;
	private Random rnd;
	public EaterThread(String name,Table table,long seed) {
		super(name);
		rnd = new Random(seed);
		this.table = table;
	}
	
	public void run() {
		while(true) {
			try {
				  String cake = table.take();
	              Thread.sleep(rnd.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
