package Queue;


public class LLQueue {
	
	public static class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
		}
	}
	
	public static class QueueLL{
		Node head = null;
		Node tail = null;
		int size = 0;
		
		public void add(int val) {
			Node temp = new Node(val);
			
			if(size == 0) 
			{
				head = tail = temp;
			}
			else {
				tail.next = temp;
				tail = temp;
			}
			size++;
		}
		
		public int peek() {
			if(size == 0) {
				System.out.println("Queue id Empty !");
				return -1;
			}
			return head.val;
		}
		
		public int remove() {
			if(size == 0) {
				System.out.println("Queue id Empty !");
				return -1;
			}
			else {
				int x = head.val;
				head = head.next;
				size--;
				return x;
			}
		}
		
		public void display() {
			if(size == 0) {
				System.out.println("Queue id Empty !");
				return;
			}
			else {
				Node temp = head;
				
				while(temp!=null) {
					System.out.print(temp.val+" ");
					temp = temp.next;
				}
				System.out.println();
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		QueueLL q1 = new QueueLL();
		q1.display();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.display();
		System.err.println(q1.peek());
		q1.remove();
		q1.display();
	}

}
