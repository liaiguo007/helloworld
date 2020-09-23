package workerthread;


public class ClientThread extends Thread{
	private final Channel channel;
	public ClientThread(String name,Channel channel) {
		super(name);
		this.channel = channel;
	}
	public void run() {
		try {
			for(int i =0;true;i++) {
				Request request = new Request(getName(),i);
				channel.putRequest(request);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
