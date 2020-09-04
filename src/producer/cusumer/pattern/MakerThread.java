package producer.cusumer.pattern;

import java.util.Random;

public class MakerThread extends Thread{
	private Random rnd = null;
	private Table table = null;
	private static int id = 0;//the flow number of cake
	public MakerThread(String name, Table table, long seed) {
		super(name);
		rnd = new Random(seed);
		this.table = table;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(rnd.nextInt(1000));
				table.put("cake No." + nextId() + getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static synchronized int nextId() {
		return id++;
	}
}
