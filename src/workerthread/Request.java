package workerthread;


public class Request {
	private final String name;
	private final int number;
	public Request(String name,int number) {
		this.name = name;
		this.number = number;
	}
	public void execute() {
		System.out.println(Thread.currentThread().getName() + "execute" + this);
       
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
