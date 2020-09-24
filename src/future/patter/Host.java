package future.patter;

import javax.xml.crypto.Data;

public class Host {
		public FutureData request(final int count,final char c) {
			System.out.println("start request" + c + "###");
			
			final FutureData futerData = new FutureData();
			new Thread() {
				public void run() {
					RealData realData = new RealData(count,c);
					futerData.setRealData(realData);
				}
			}.start();
			System.out.println("end request" + c + "###");
		    return futerData;
		}
}
