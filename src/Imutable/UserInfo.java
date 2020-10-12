package Imutable;

public class UserInfo {
	private final StringBuffer info;
	public UserInfo(String name,String address) {
		this.info = new StringBuffer("info name = " + name + " address : " + address);
	}
	public StringBuffer getInfo() {
		return new StringBuffer("info name = " + info.substring(12, 17) + "  address : " + info.substring(19, 25));
	}
	
	public String toString() {
		return ""+info;
	}
}
