package read.write.lock.lgx;

import java.util.Random;

public class WriterThread extends Thread{
	
	private static final Random random = new Random();
	private final Data data;
	private final String filler;
	private int index = 0;
	public WriterThread(Data data, String filler) {
		this.data = data;
		this.filler = filler;
	}
	
	public void run() {
		try {
			while(index<4) {
				char c = nextchar();
				data.write(c);
				Thread.sleep(random.nextInt(300));			
			}

		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public char nextchar() {
		char c = filler.charAt(index);
		index++;
		if(index > filler.length()) {
			return 0;
		}
		return c;
	}
}
