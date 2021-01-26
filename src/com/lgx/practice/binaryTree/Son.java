package com.lgx.practice.binaryTree;

public class Son extends Father{
	public String name = "this is son";
	public void method(){
		System.out.println(name);
	}
	
	public static void main(String []args) {
		Father f = new Son();
		System.out.println(f.name);
		f.method();
	}

}
