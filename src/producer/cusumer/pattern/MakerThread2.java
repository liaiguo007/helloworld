package producer.cusumer.pattern;

import java.util.Random;

public class MakerThread2 extends Thread{
	private Random random ;
	private Table2 table;
	private static int id = 0;
	public MakerThread2(String name,Table2 table,long seed) {
		super(name);
		this.table = table;
		this.random = new Random(seed);
	}	
	public void run() {
	 while(true) {
		try {
			Thread.sleep(random.nextInt(1000));
			table.put("cake No." + nextId() + getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 }
	}	
	public static synchronized int  nextId() {
		id++;
		return id;
	}
}
