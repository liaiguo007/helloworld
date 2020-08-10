package SingleTon;

public class LazySingleTon {
	private LazySingleTon() {}
	
	private static LazySingleTon instatnce = null;
	
	public static LazySingleTon getInstance() {
		if(instatnce == null) {
			synchronized(LazySingleTon.class) {
				if(instatnce == null) {
					instatnce = new LazySingleTon();
			    }			
			}
		}
		return instatnce;
	}
}
