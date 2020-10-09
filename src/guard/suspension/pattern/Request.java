package guard.suspension.pattern;

public class Request {
	
	private String name;
	
	public String toString() {
		return "Request [name=" + name + "]";
	}

	public Request(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
