package thread.per.message;

public class Main {
	public static void main(String []str) {
		System.out.println("------BEGIN-----");
        Host host = new Host();
        host.request(10,'a');
        host.request(20,'b');
        host.request(30,'c');
        System.out.println("------END-------");
	}
}
