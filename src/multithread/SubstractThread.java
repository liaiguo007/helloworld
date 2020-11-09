package multithread;

public class SubstractThread implements Runnable{

	private AddSubstractTool addSubstarcktTool;
	
	public SubstractThread(AddSubstractTool addSubstarcktTool ) {
		this.addSubstarcktTool = addSubstarcktTool;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++) {
			addSubstarcktTool.substract(i);
		}
		
	}

}
