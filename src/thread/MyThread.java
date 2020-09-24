package thread;

public class MyThread extends Thread{
	private String message;
	public MyThread(String message) {
		this.message = message;
	}
	public void run() {
		for(int i = 0;i < 10;i++) {
			try {
				this.join(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(message);
		}
	}
}
