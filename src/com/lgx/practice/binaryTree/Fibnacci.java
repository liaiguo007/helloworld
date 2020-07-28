package com.lgx.practice.binaryTree;

public class Fibnacci {
	
	public static int fib(int n) {
		
		if(n == 1 || n == 2)
			return 1;
		else
			return fib(n-2) + fib(n-1);
	}
	public static int  fib2(int index){
		 
		   int f1 =  1;
	       int f2 =  1;
	       int  f = 0;
	 
	       for(int i=1; i<index; i++){
	              f = f1 + f2;
	              f1 = f2;
	              f2 = f;
	       }
	       return f;
	   }

	public static int fib3(int n) {
		if(n == 1)
			return 1;
		else
			return n*fib3(n-1);
	}
	public static void main(String []args) {
		int result = fib3(5);
		System.out.print(result);
	}
	
	
}
