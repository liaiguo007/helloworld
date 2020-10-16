package threadlocal;

public class SingleLinked {
	
	private Node head;
	
	public SingleLinked() {
		this.head = null;
	}
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}
		Node preNode = head;
		while(preNode.next !=null) {
			preNode = preNode.next;
		}
		preNode.next = newNode;
	}
	
	public boolean deleteNode(int index) {		
		if(index == 1) {
			head = head.next;
			return true;
		}		
		int i =1;
		Node preNode = head;
		Node curNode = preNode.next;
		while(curNode !=null) {
			if(i == index) {
				preNode.next = curNode.next;
				return true;
			}
			i++;
			preNode = preNode.next;
			curNode = curNode.next;
		}		
		return false;
	}
	
	public void reverseNode() {
		Node curNode = head;
		Node preNode = null;
		
		while(curNode !=null) {
			curNode.next = preNode;
			preNode = curNode;
			curNode = curNode.next;
			
		}
		head= preNode;
		
	}
	
}
