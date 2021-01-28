package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "  start ********************");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "complete ********************");

		
	}

	public static void main(String []args) {
		Thread t1 = new Thread(new SingleTask());
		Thread t2 = new Thread(new SingleTask());
		Thread t3= new Thread(new SingleTask());
		Thread t4 = new Thread(new SingleTask());
		ExecutorService pool = Executors.newSingleThreadExecutor();
		pool.execute(t1);
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		
	}
}
