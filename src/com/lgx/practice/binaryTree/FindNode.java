package com.lgx.practice.binaryTree;
/*
 * https://www.cnblogs.com/ysocean/p/8032642.html
 * */
public class FindNode {
	/*
	 * 查找某个节点，我们必须从根节点开始遍历。

　　      * ①、查找值比当前节点值大，则搜索右子树；

　　      * ②、查找值等于当前节点值，停止搜索（终止条件）；

　　      * ③、查找值小于当前节点值，则搜索左子树；
	 *  
	 * **/
	
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
	
	public boolean insert(Node newNode,Node root) {
		Node currentNode = root;
		Node parentNode = null;
		if(root == null) {
			root = newNode;
			return true;
		}
		while(currentNode != null) {
			parentNode = currentNode;
			if(currentNode.data > newNode.data) {
				currentNode = currentNode.leftNode;
				if(currentNode == null) {
					parentNode = newNode;
					return true;
				}				
			}else {
				currentNode = currentNode.rightNode;
				if(currentNode == null) {
					parentNode = newNode;
					return true;
				}				
			}						
		}
		return false;
	}
	
	//preOrder Traversal
	public void preNode(Node root) {
		if(root!=null) {
			System.out.println(root.data);
			preNode(root.leftNode);
			preNode(root.rightNode);
		}
	}
	//inOrder Traversal
	public void inoderTraversal(Node root) {
		if(root != null) {
			inoderTraversal(root.leftNode);
			System.out.println(root.data);
			inoderTraversal(root.rightNode);
		}
	}
	
	public void postOrderTraversal(Node root) {
		if(root != null) {
			postOrderTraversal(root.leftNode);
			postOrderTraversal(root.rightNode);
			System.out.println(root.data);
		}
	}
	
	public Node findMax(Node root) {
		Node curNode = root;
		Node maxNode =curNode;
		while(curNode != null) {
			maxNode = curNode;
			curNode = curNode.rightNode;
		}
		return maxNode;
	}
	
	public Node findMin(Node root) {
		Node curNode = root;
		Node minNode = curNode;
		while(curNode != null){
			minNode = curNode;
			curNode = curNode.leftNode;
		}
		return minNode;
	}	
	public boolean deleteNode(int num,Node root) {
		Node preNode = root;
		Node curNode = preNode.next;
		int index = 1;
		if(num == 1) {
			root = root.next;
			return true;
		}
		while(curNode != null) {
			if(index == num) {
				preNode.next = curNode.next;
				return true;
			}else {
				preNode = preNode.next;
				curNode = curNode.next;
				index++;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
