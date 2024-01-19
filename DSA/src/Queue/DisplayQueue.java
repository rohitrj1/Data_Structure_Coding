package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		
		Queue<Integer> helper = new ArrayDeque<>();
		
		while(queue.size() > 0) {
			System.out.print(queue.peek() +" ");
			helper.add(queue.poll());
		}
		while(helper.size() >0) {
			queue.add(helper.poll());
		}
		
		
	}

}
