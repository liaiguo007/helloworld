package Imutable;

import java.util.List;

public class WriteThread extends Thread{
	private final List<Integer> list;
	public WriteThread(List<Integer> list) {
		super("writeThread");
		this.list = list;
	}
	
	public void run() {
		for(int i = 0;true;i++) {
			list.add(i);
			list.remove(0);
		}
	}
}
