package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<3;i++) {
			
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	
}

public class ExecutorServiceDemo {

	public static void main(String []args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());		
	}
	
}
