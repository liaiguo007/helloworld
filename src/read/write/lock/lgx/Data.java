package read.write.lock.lgx;

public class Data {
	private final char[] buffer;
	private final ReadWriteLock lock = new ReadWriteLock();
	public Data(int size) {
		this.buffer = new char[size];
		for(int i =0 ;i < buffer.length;i++) {
			buffer[i] = '*';
		}
	}
	
	public char[] read() throws InterruptedException {
		lock.readLock();
		try {
			return doRead();
		}finally {
			lock.readUnlock();
		}			
	}
	
	public void write(char c) throws InterruptedException {
		lock.writeLock();
		try {
			 doWrite(c);
		}finally {
			lock.writeUnlock();
		}			
	}
	
	
	public char[] doRead() {
		char []newbuf = new char[buffer.length];
		for(int i = 0;i < buffer.length;i++) {
			newbuf[i] = buffer[i];
		}
		slowly();
		return newbuf;
	}
	
	private void doWrite(char c) {
		StringBuilder sb = new StringBuilder();
		for(int i =0;i < buffer.length;i++) {
			//buffer[i] = c;
			sb.append(c);
			slowly();
		}
		System.out.println(Thread.currentThread().getName() + "    write " + sb.toString());

	}
	
	public void slowly() {
		try {
			Thread.sleep(50);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
