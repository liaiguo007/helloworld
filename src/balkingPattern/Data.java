package balkingPattern;

import java.io.FileWriter;
import java.io.IOException;

public class Data {
	
	private String content;
	private boolean flag = true;
	private String fileName ;
	
	public  Data(String fileName,String content) {
		this.fileName = fileName;
		this.content = content;
	}
	public synchronized void change(String content) {
		this.content = content;
		flag = true;
	}
	
	
	public synchronized void save() {
		if(!flag)
			return;
		doSave();
		flag = false;
	}
	
	public synchronized void doSave() {
		System.out.println(Thread.currentThread().getName() + "saving content");
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.write(content);
			fw.close();
		} catch (IOException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
