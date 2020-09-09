package thread.per.message;

public class Helpler {
	
	public void handle(int count,char c) {
		System.out.println("handle("+count+","+c+") begin");
		
		try {
			for(int i =0;i<count;i++) {
				System.out.print("*"+c);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("");
		System.out.println("handle("+count+","+c+") end");
	}

}
