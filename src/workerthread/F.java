package workerthread;

public class F extends E{
	public static void staticMethod() {
		System.out.print("static2 method");
	}
	public void dynamicMethod() {
		System.out.println("dynamic2 method");
	}
	
	public static void main(String []args) {
		E a= new F();
		a.dynamicMethod();
		a.staticMethod();
	}
}
