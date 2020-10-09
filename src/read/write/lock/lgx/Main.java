package read.write.lock.lgx;

public class Main {
	
	public static void main(String []args) {
		Data data = new Data(4);
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new ReaderThread(data).start();
		new WriterThread(data,"ABCD").start();
		new WriterThread(data,"DEFG").start();
	}
}
