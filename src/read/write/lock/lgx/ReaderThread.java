package read.write.lock.lgx;

public class ReaderThread extends Thread{
	private final Data data;
	private int index = 0;
	public ReaderThread(Data data) {
		this.data = data;
	}

	public void run() {
		try {
			while(index<5) {
				char[] readbuf = data.read();
				index++;
				System.out.println(Thread.currentThread().getName() + "reads " + String.copyValueOf(readbuf));
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
