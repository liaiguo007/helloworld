package guard.suspension.pattern;

import java.util.LinkedList;
import java.util.Queue;

public class RequestQueue {
	Queue<Request> requestQueue = new LinkedList<Request>();
	
	public synchronized void putRequest(Request request) {
		requestQueue.offer(request);
		notifyAll();
	}
	
	public synchronized Request getRequest() {
		while(requestQueue.peek()==null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return requestQueue.remove();
	}
}
