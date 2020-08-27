package balkingPattern;

import java.util.concurrent.TimeoutException;

public class Main {
	
	public static void main(String []args) {
		Data data = new Data("C:\\Users\\C5252444\\Desktop\\data.txt","helloworld!");
		new WriteThread("change Thrread",data).start();
		new ServerThread("server Thread",data).start();
	}
	
//	  public static void main(String[] args) throws InterruptedException {
//	        Host1 host = new Host1(10000);
//	        try {
//	            System.out.println("execute Begin");
//	            host.execute();
//	        }catch (TimeoutException e){
//	            e.printStackTrace();
//	        }
//	    }	
}
