package two.phase.pattern;

public class Main {
	public static void main(String []args) {
		System.out.println("main : begin");
		CountupThread t = new CountupThread();
		try {
			Thread.sleep(1000);
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
