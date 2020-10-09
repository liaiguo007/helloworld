package producer.cusumer.pattern;

public class Table2 {
	private int count ;
	private int head;
	private int tail;
	private final String buffer[];
	public Table2(int count) {
		this.buffer = new String[count];
		this.head = 0;
		this.tail = 0;
		this.count = 0;
	}
	
	public synchronized void  put(String cake) {
		System.out.println(Thread.currentThread().getName() + " ***************");
		while(tail >=count) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		buffer[tail] = cake;
		tail = (tail + 1)%buffer.length;
		count++;
		notifyAll();
	}
	
	public synchronized String take() {
		while(count < 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String cake = buffer[head];
		head = (head + 1)%buffer.length;
		count--;
		notifyAll();
		return cake;
	}
	
	
	
}
