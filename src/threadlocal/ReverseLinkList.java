package threadlocal;

public class ReverseLinkList {
	
	private Node head;
	
	public ReverseLinkList(Node head) {
		this.head = head;
	}
	
	public Node reverseNode(Node head) {
		if(head == null || head.next ==null)
			return head;
		
		Node pre = head;
		Node cur = pre.next;
		Node temp = null;
		while(cur!=null) {			
			temp = cur.next;
			cur.next = head;
			head = cur;
			cur = temp;
		}
		return pre;
	}
	
	public Node reverseNode2(Node head) {
		if(head == null || head.next ==null)
			return head;
		Node reverse = reverseNode2(head.next);
		head.next.next = head;
		head.next = null;
		return reverse;
	}
	
	public Node findNode(int index) {
		Node temp = head;
		if(index < 1 || index > length()) 
			return null;
		for(int i =0;i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public boolean deleteNode(int index) {
		if(index < 1 || index > length()) 
			return false;
		if(index == 1)
			head = head.next;
		int i = 1;
		Node pre = head;
		Node cur = pre.next;
		while(cur != null) {
			if(i == index) {
				pre.next = cur.next;
				return true;
			}
			
			pre = pre.next;
			cur = cur.next;
			return true;
		}
		return false;
	}
	
	public int length() {
		Node temp = head;
		int i = 0;
		while(temp!= null) {
			i++;
			temp = temp.next;
		}
		return i;
	}
}
