package producer.cusumer.pattern;

import java.util.Random;

public class EaterThread2 extends Thread{
	
	private Table2 table;
	private Random random;
	public EaterThread2(String name,Table2 table,Long seed) {
		super(name);
		this.table = table;
		random = new Random(seed);
	}
	
	public void run() {
		while(true) {
			String cake = table.take();
			try {
				Thread.sleep(random.nextInt());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
