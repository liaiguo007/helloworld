package future.patter;

import javax.xml.crypto.Data;

public class Main {
	public static void main(String []argss) {
		Host host = new Host();
		FutureData data1 = host.request(10, 'A');
		FutureData data2 = host.request(20, 'B');
		FutureData data3 = host.request(30, 'C');		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		System.out.println(data1.getContent());
		System.out.println(data2.getContent());
		System.out.println(data3.getContent());
	}
}
