package guard.suspension.pattern;

public class Main {
	
	public static void main(String []args) {
		RequestQueue  requestQueue = new RequestQueue();
		new ClientThread(requestQueue,"alice",1234L).start();
		new ServerThread(requestQueue,"alice",4234L).start();
	}
}
