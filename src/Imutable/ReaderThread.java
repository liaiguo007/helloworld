package Imutable;

import java.util.List;

public class ReaderThread extends Thread{
	
	private final List<Integer> list;
	public ReaderThread(List<Integer> list) {
		super("readerThread");
		this.list = list;
	}
	
	public void run() {
		while(true) {
		  synchronized(list) {
			for(int n:list) {
				System.out.println(n);			
			}
			System.out.println("--------------------");
		}
	}
	}
}
