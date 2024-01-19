package Queue;

import java.util.*;

public class QueueImp {
	
	
	public static void main(String[] args) {
	
		
		Queue<Integer> queue = new LinkedList<>();
		System.out.println(queue.isEmpty());
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		System.out.println(queue.isEmpty());
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		queue.remove();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.size());
		
	}

}
