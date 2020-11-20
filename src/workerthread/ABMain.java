package workerthread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ABMain {
	public static void main(String []args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\fileTest\\testout.txt"));
		AB ab = new AB(1,"SS");
		oos.writeObject(ab);
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\fileTest\\testout.txt"));
		Object o = ois.readObject();
		AB a = (AB)o;
		System.out.println(a.getId() + "*******" + a.getName());
	}
}
