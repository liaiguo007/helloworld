package future.patter;

import javax.xml.crypto.Data;

public class FutureData implements Data{
	private RealData realData = null;
	private boolean ready = false;
	public synchronized void setRealData(RealData realData) {
		while(ready) {
			return;//balking pattern
		}		
		this.realData = realData;
		ready = true;
		notifyAll();
	}
	
	public synchronized String getContent() {
		while(!ready) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return realData.getContent();
	}
}
