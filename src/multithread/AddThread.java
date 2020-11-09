package multithread;

public class AddThread implements Runnable {

	private AddSubstractTool addSubstarcktTool;
	
	public AddThread(AddSubstractTool addSubstarcktTool ) {
		this.addSubstarcktTool = addSubstarcktTool;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++) {
			addSubstarcktTool.add(i);
		}
	}

}
