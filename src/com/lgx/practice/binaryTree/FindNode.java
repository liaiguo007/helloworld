package com.lgx.practice.binaryTree;

public class FindNode {
	
	public Node find(int key ,Node root) {
		Node cur = root;
		while(cur != null) {
			if(cur.data > key) {
				cur = cur.leftNode;
			}else if(cur.data < key) {
				cur = cur.rightNode;
			}else {
				return cur;
			}		
		}
		return null;
	}
}
