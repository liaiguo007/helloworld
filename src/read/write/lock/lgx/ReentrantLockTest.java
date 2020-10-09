package read.write.lock.lgx;

public class ReentrantLockTest extends RetrantClass{
	
	public static void main(String []args) {
		ReentrantLockTest rlt = new ReentrantLockTest();
		rlt.doSometing();
	}
	
	public synchronized void doAnotherSometing() {
		super.doSometing();
		System.out.println("do Another someting method : " + Thread.currentThread().getName());
	}
	
	public synchronized void doSometing() {
		doAnotherSometing();
		System.out.println("Child Class : " + Thread.currentThread().getName());
	}	
}
