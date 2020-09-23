package workerthread;

public class Channel {
	private static final int MAX_REQUEST = 100;
	private final Request[] requestQueue;
	private int tail;//put的位置
	private int head;//get的位置
	private int count;//request 的数量
	private final WorkerThread[] threadPool;
	public Channel(int threads) {
		this.threadPool = new WorkerThread[threads];
		this.requestQueue = new Request[MAX_REQUEST];
		for(int i =0;i < threadPool.length;i++) {
			threadPool[i] = new WorkerThread("worker-" + i,this);
		}
	}
	
	public void startaWorkers() {
		for(int i =0;i<threadPool.length;i++) {
			threadPool[i].start();
		}
	}
	
    public synchronized void putRequest(Request request) {
		while(count>requestQueue.length ) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			requestQueue[tail] = request;
			tail = (tail+1)/requestQueue.length;
			count++;
			notifyAll();			
		}
	}
    
    public synchronized Request takeRequest() {
    	while(count<0) {
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	Request request = requestQueue[head];
    	head = (head+1)% requestQueue.length;
    	count--;
    	notifyAll();    	
    	return request;
    }
}
