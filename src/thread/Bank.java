package thread;

public class Bank {
	private String name ;
	private int money;
	public Bank(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public synchronized void deposit(int m) {
		money = money + m;
	}
	public synchronized boolean withdraw(int m) {
		if(money >= m) {
			money = money - m;
			return true;
		}else {
			System.out.println("lack of balance!");
			return false;
		}
	}
}
