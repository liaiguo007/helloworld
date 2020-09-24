package thread;

public class IntterruptTest {
	
	public static void main(String []args) {
		Thread t1 = new MyThread("thread-1");
		t1.start();
		new Thread() {
			public void run() {
				t1.interrupt();
			}
		}.start();
		Thread t2 = new MyThread("thread-1");
		t2.start();
	}

}
