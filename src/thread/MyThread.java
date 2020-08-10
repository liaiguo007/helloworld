package thread;

public class MyThread extends Thread{
	private String message;
	public MyThread(String message) {
		this.message = message;
	}
	public void run() {
		for(int i = 0;i < 1000;i++) {
			System.out.println(message);
		}
	}
}
