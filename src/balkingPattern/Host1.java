package balkingPattern;

import java.util.concurrent.TimeoutException;

public class Host1 {
	private long timeout = 0;
	private boolean ready = false;
	public Host1(long timeout) {
		this.timeout = timeout;
	}
	
	public void execute() throws TimeoutException, InterruptedException {
			long start = System.currentTimeMillis();
			while(!ready) {
				long now = System.currentTimeMillis();
				long rest = timeout -(now -start);
				if(rest < 0) {
					 throw new TimeoutException("now - start= "+(now-start)+", timeout = "+timeout);
				}
				//wait(rest);
			}
			doExecute();
	}
	
	 private void doExecute(){
	        System.out.println(Thread.currentThread().getName()+" calls doExecute");
	    }

}
