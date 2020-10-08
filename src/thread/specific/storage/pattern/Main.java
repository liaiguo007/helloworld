package thread.specific.storage.pattern;

public class Main {
	public static void main(String []args) {
//		for(int i =0;i<10;i++) {
//			Log.println("main: i = " + i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		Log.close();
//		System.out.println("END");
		new ClientThread("AAAAA").start();
		new ClientThread("BBBBB").start();
		new ClientThread("CCCCC").start();
	}
}
