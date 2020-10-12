package Imutable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Alice","beijingtiananmen");
		new PrintPersonThread(person).start();
		new PrintPersonThread(person).start();
		new PrintPersonThread(person).start();
		StringBuffer sb = new StringBuffer("aaaa");
		sb = new StringBuffer(sb.substring(0, sb.length()));
	}

}
