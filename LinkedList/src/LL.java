 class Node1 { 
	int num;
	Node1 next; 
	
	Node1(int data)
	{ 
		this.num = data;
		this.next = null;
	}
	
}

public class LL{
	public static void main(String[] args) {
		
		Node1 head = null;
		
		head  = new Node1(1);
		
		Node1 n = new Node1(2);
		
		head.next = n;
		
		Node1 tail = n;
		
		n = new Node1(3);
		
		tail.next = n;
		tail = n;
		
		Node1 temp = head;
		
		while(temp != null) {
			System.out.println(temp.num);
			temp = temp.next;
			}
	}
}
	




