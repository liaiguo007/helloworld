package thread.specific.storage.pattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Log {
	private static final ThreadLocal<TSLog> tsLogCollection = new ThreadLocal<TSLog>();
//	private static PrintWriter printWriter = null;
//	
//	static {
//		try {
//			printWriter = new PrintWriter(new FileWriter("C:\\Users\\C5252444\\Desktop\\log.txt"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}	
	public static void println(String s) {
		getTSLog().println(s);
	}
	
	public static void close() {
		System.out.println("the end of the log");
		getTSLog().close();
	}	
	
	private static TSLog getTSLog() {
		TSLog tsLog = tsLogCollection.get();
		if(tsLog == null) {
			tsLog = new TSLog(Thread.currentThread().getName() + "-log.txt");
			tsLogCollection.set(tsLog);
		}
		return tsLog;
		
	}
}
