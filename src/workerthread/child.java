package workerthread;

public class child extends Parent{
	private String name = "default";
	public child(String s) {
		this.name = s;
		System.out.println("Child Constructor ,name = " + this.name);
	}
	
	public void sayHi() {
		System.out.println("Child sayHi");
	}
	
	public static void main(String []args) {
		new child("ericssion");
	}

}
