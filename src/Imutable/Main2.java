package Imutable;

public class Main2 {
	
	public static void main(String []args) {
		UserInfo userInfo = new UserInfo("Alice","Alaska");
		System.out.println(userInfo);
		StringBuffer info = userInfo.getInfo();
		System.out.println(info.toString());
		info.replace(12, 14, "Bobby");
		System.out.println(info.toString());
		System.out.println(userInfo);

	}
}
