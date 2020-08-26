package balkingPattern;

public class Main {
	
	public static void main(String []args) {
		Data data = new Data("C:\\Users\\C5252444\\Desktop\\data.txt","helloworld!");
		new WriteThread("change Thrread",data).start();
		new ServerThread("server Thread",data).start();
	}
	
}
