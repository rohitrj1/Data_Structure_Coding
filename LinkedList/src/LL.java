 class Node { 
	int num;
	Node next; 
	
	Node(int data)
	{ 
		this.num = data;
		this.next = null;
	}
	
}

public class LL{
	public static void main(String[] args) {
		
		Node head = null;
		
		head  = new Node(1);
		
		Node n = new Node(2);
		
		head.next = n;
		
		Node tail = n;
		
		n = new Node(3);
		
		tail.next = n;
		tail = n;
		
		Node temp = head;
		
		while(temp != null) {
			System.out.println(temp.num);
			temp = temp.next;
			}
	}
}
	




