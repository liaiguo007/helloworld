package workerthread;

public class A {
	private void method() {
		System.out.println("method of A calling from " + this.getClass().getName());
	}
	public static void main(String []args) {
		A a = new B();
		a.method();
		B b = new B();
		b.method();
	}
}
