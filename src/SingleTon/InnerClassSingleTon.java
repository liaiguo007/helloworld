package SingleTon;

public class InnerClassSingleTon {
	
	private InnerClassSingleTon() {};
	
	private static class SingleTonInstance{
		private final static InnerClassSingleTon instance = new InnerClassSingleTon();
	}
	
	public static InnerClassSingleTon getInstance() {
		return SingleTonInstance.instance;
	}
}
