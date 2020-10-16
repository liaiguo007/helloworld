/****
 * 
 * 
 * 
 * */
public class Fibnacci {
	int a = 1;
	int b = 1;
	int c = 0;
	public int fib(int n) {
		if(n <=2)
			return 1;
		else
			return fib(n-2) + fib(n-1);
	}
	public static void main(String []args) {
		Fibnacci f = new Fibnacci();
		System.out.println(f.fib(4));
	}
}
