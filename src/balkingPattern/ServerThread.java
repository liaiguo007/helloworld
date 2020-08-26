package balkingPattern;

public class ServerThread extends Thread{
	private Data data;
	public ServerThread(String name,Data data) {
		super(name);
		this.data = data;
	}
	
	public void run() {
		
		while(true) {
			data.save();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
