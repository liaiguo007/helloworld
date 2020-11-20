package workerthread;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class BA implements Externalizable{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	public BA() {
		System.out.println("default constructor was called");
	}
	public BA(int id ,String name) {
		System.out.println(" constructor was called");
		this.id = id;
		this.name = name;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stu
		out.writeInt(id);
		out.writeObject(name);
		System.out.println(" writeExternal was finished!");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		id = in.readInt();
		name = (String)in.readObject();
	}

}
