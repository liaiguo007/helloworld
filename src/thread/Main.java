package thread;

public class Main {
	public static void main(String []args) {		
//		new MyThread("good!").start();
//		new MyThread("nice!").start();
		new Thread(new Printer("good!")).start();
		new Thread(new Printer("Nice!")).start();
	}
}

