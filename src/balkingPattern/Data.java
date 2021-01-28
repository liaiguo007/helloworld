package balkingPattern;

import java.io.FileWriter;
import java.io.IOException;

/**

一,什么是Balking模式

如果现在不合适执行这个操作，或者没必要执行这个操作，就停止处理，直接返回。
在Balking模式中，如果守护条件不成立，就立即中断处理。

二，例子：

定期将当前数据内容写入文件中，比如文本工具的自动保存功能，定期的将数据保存到文件中。
当数据内容被写入时，会完全覆盖上次写入的内容，只有最新的内容才会被保存
当写入的内容和上次的内容完全相同时，再向文件写入就多余了，所以就不再执行写入操作。
所以这个程序就是以 数据内容不同 作为守护条件，如果数据内容相同，就不执行写入操作，直接返回(balk)

代码：

Data类：可以修改并保存的数据的类

ChangerThread类：模仿用户，进行文本的修改并随时保存

SaverThread类：执行自动保存的线程

*/

public class Data {
	
	private String content;
	private boolean flag = true;
	private String fileName ;
	
	public  Data(String fileName,String content) {
		this.fileName = fileName;
		this.content = content;
	}
	//如果没有修改，就不保存了  若数据修改过，则保存到文件中
	public synchronized void change(String content) {
		if(!this.content.equals(content))
			flag = true;
		this.content = content;
	}
	
	
	public  void save() {
		if(!flag) {
			System.out.println(Thread.currentThread().getName() + "**********balking content" + content);
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
