package future.patter;

import javax.xml.crypto.Data;

public class RealData implements Data{
	private final String content;
	public RealData(int count,char c) {
		
		System.out.println("start making Real Data + ***********************");
		char []buffer = new char[count];
		for(int i=0;i<count;i++) {
			buffer[i] = c;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.content = new String(buffer);
		System.out.println("end making Real Data + ***********************");
	}

	public String getContent() {
		return content;
	}
}
