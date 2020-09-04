package producer.cusumer.pattern;

public class Table {
	private int count = 0;
	private int tail = 0;//the position of putting cakes
	private int head = 0;//the position of getting cakes
	private String[] buffer ;
	public Table(int count) {
		buffer = new String[count];
		this.count = 0;
		this.tail = 0;
		this.head = 0;
	}
	
	public synchronized void put(String cake) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" put "+cake);
		while(count > buffer.length) {
			System.out.println(Thread.currentThread().getName()+" put wait "+"start");
			wait();
			System.out.println(Thread.currentThread().getName()+" put wait "+"end");
		}
		buffer[tail] = cake;
		tail = (tail + 1)%buffer.length;
		count++;
		notifyAll();
	}
	
	public synchronized String take() throws InterruptedException {
		while(count <= 0) {
			System.out.println(Thread.currentThread().getName()+" take wait "+"start");
			wait();
			System.out.println(Thread.currentThread().getName()+" take wait "+"end");
		}
		String cake = buffer[head];
		head = (head+1)%buffer.length;
		count--;
        System.out.println(Thread.currentThread().getName()+" get "+cake);
		notifyAll();
		return cake;
	}
	
}
