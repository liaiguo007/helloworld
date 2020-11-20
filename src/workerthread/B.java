package workerthread;

public class B extends A{
	public void method() {
		System.out.println("method of B calling from " + this.getClass().getName());

	}
}
