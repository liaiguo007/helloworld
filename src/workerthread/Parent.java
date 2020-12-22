package workerthread;

public class Parent {
	public void sayHi() {
		System.out.println("parent sayHi");
	}
	public Parent() {
		System.out.println("parent constructor before sayHi");
		sayHi();
		System.out.println("parent constructor after sayHi");
	}
}
