package SingleTon;

public class SingleTonHugury {
	private SingleTonHugury() {}
	private static final SingleTonHugury instance = new SingleTonHugury();
	public static SingleTonHugury getInstance() {
		return instance;
	}
}
