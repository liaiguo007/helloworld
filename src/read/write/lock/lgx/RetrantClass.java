package read.write.lock.lgx;

public class RetrantClass {
	public synchronized void doSometing() {
		System.out.println( "father class " + Thread.currentThread().getName() );
	}
}
