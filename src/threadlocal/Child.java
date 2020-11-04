package threadlocal;

public class Child extends Father{
	private String name = "child";
	static int i = 12;
	public static void main(String []args) {
		Child child = new Child();
		System.out.println(i+=i-=i*=i);
	}
}
