package Imutable;

public class SyncronizedTest {
	public static void trial(String str,long count,Object obj) {
		long start = System.currentTimeMillis();
		for(long i = 0; i<count;i++) {
			obj.toString();
		}
		long end = System.currentTimeMillis();
		System.out.println(str + " = " + (end - start));
	}
	
	public class Nosycc{
		private static final String name = "Not Synchronzed";
		public String toString() {
			return name;
		}
	}
	
	public class Syc{
		private static final String name = "Not Synchronzed";
		public synchronized String toString() {
			return name;
		}
	}
	public static void main(String []args) {
		 final long count2 = 10010000011L;
		 SyncronizedTest syncronizedTest = new SyncronizedTest();
		 SyncronizedTest.Nosycc nosyn = syncronizedTest.new Nosycc();
		 SyncronizedTest.Syc syn = syncronizedTest.new Syc();
		 trial("No synchronized method",count2,nosyn);
		 trial("synchronized method",count2,syn);
		 
	}
	
}
