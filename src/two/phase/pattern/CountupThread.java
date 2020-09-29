package two.phase.pattern;

public class CountupThread extends Thread{
		private long counter = 0;
		private volatile boolean  shutdownRequested = false;
		public void shutdownRequest() {
			shutdownRequested = true;
			interrupt();
		}
		
		public boolean isShutdownRequested() {
			return shutdownRequested;
		}
		
		public final void run() {
			while(!isShutdownRequested()) {
				try {
					doWork();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					doShutDown();
				}
			}
		}
		
		private void doWork() throws InterruptedException{
			counter++;
			System.out.println("do work counter = " + counter);
			Thread.sleep(500);
			
		}
		
		private void doShutDown() {
			System.out.println("shutdown counter = " + counter);

		}
}
