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
	
	
	public  void save() {
		if(!flag) {
			System.out.println(Thread.currentThread().getName() + "balking content" + content);
			return;
			}
		doSave();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flag = false;
	}
	
	public synchronized void doSave() {
		try {
			FileWriter fw = new FileWriter(fileName);
			System.out.println(Thread.currentThread().getName() + "saving content" + content);
			fw.append(content);
			fw.close();
		} catch (IOException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
