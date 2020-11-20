package workerthread;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BAMain {
	public static void main(String[] args) throws IOException,ClassNotFoundException{  
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\fileTest\\testout.txt"));
		BA ab = new BA(1,"SS");
		oos.writeObject(ab);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\fileTest\\testout.txt"));
		Object o = ois.readObject();
		BA a = (BA)o;
		System.out.println(a.getId() + "*******" + a.getName());
    }  
}
