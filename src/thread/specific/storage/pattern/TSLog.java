package thread.specific.storage.pattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TSLog {
private  PrintWriter printWriter = null;
	
	 public TSLog(String fileName){
		try {
			printWriter = new PrintWriter(new FileWriter(fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	public  void println(String s) {
		printWriter.println(s);
	}
	
	public  void close() {
		System.out.println("the end of the log");
		printWriter.close();
	}	
}
