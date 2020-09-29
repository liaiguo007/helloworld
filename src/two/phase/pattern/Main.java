package two.phase.pattern;

public class Main {
	public static void main(String []args) {
		Integer start = Integer.MAX_VALUE;

		System.out.println("start ->"+(start+1));
		
		System.out.println("main : begin");
		CountupThread t = new CountupThread();
		try {
			t.start();
			Thread.sleep(10000);
			System.out.println("main : shudownRequest");
			t.shutdownRequest();
			System.out.println("main : join");
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main : end");
	}
}
