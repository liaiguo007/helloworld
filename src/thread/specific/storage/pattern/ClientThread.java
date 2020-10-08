package thread.specific.storage.pattern;

public class ClientThread extends Thread{
	
	public ClientThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println( getName() + "BEGIN");
		for(int i =0;i<10;i++) {
			Log.println("i = " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Log.close();
	}
}
