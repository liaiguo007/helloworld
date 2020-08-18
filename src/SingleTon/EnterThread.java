package SingleTon;

public class EnterThread extends Thread{
	private String name;
	private final Tool leftHand;
	private final Tool rightHand;
	public EnterThread(String name,Tool leftHand,Tool rightHand) {
		this.name = name;
		this.leftHand = leftHand;
		this.rightHand = rightHand;
	}
	public void run() {
		while(true) {
		synchronized(leftHand) {
			System.out.println(name + "takes up" + leftHand+"(left)");
			synchronized(rightHand) {
				System.out.println(name + "takes up" + rightHand+"(right)");

			}
			System.out.println(name + "puts down" + leftHand+"(left)");

		}
	}
  }
}
