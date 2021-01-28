package com.lgx.sigle.chain;

public class SingleChain {
	
	public static Node reverse2(Node head) {
		
		Node pre = head;
		Node cur = pre.next;
		Node temp = null;
		while(cur!=null) {
			temp = cur.getNext();
			cur.setNext(pre);;
			pre = cur;
			cur = temp;
		}
		head.next = null;
		return pre;
		
	}
	//
	public static Node reverseList(Node head) {
		if (head == null || head.next == null)
			return head;
		Node next = head.next;
		Node new_head = reverseList(next);
		next.next = head;
		head.next = null;
		return new_head;
	}
	
	public static void main(String []args) {
		
		Node head = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		Node pre = head;
		while(null != pre) {
			System.out.println(pre.getData());
			pre = pre.getNext();
		}
		
		pre =reverseList(head);
		while(null != pre) {
			System.out.println(pre.getData());
			pre = pre.getNext();
		}
	}
}
