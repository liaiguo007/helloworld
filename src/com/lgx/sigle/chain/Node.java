package com.lgx.sigle.chain;

public class Node {
	
	public int data;
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	public Node next;
	
	public Node(int data) {
		this.data = data;
	} int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	

	
}
