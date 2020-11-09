package multithread;

public class AddSubstractTool {
	private int sum = 0;
	
	
	public int add(int i) {
		synchronized(this) {
			sum += i;
			notify();
		}	
		return sum;
	}
	
	public int substract(int j) {
		synchronized(this) {
			sum -=j;
		}	
		notify();
		return sum;
	}
}
