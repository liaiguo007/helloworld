package thread.per.message;

public class Host {
	final Helpler  help = new Helpler();
	
	public void request(int count,char str) {
		System.out.println("main Thread began to executing");
			new Thread() {
				public void run() {
					help.handle(count,str);
				}
			}.start();

		System.out.println("main Thread end to executing");
	}
}
