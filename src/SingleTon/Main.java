package SingleTon;

public class Main {
	public static void main(String []args) {
	Tool spoon = new Tool("spoon");
	Tool fork = new Tool("fork");
	new EnterThread("Alice",spoon,fork).start();
	new EnterThread("Brown",fork,spoon).start();
	}
}
