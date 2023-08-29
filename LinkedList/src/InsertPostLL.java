
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static Node insert(Node head, int n, int pos, int val) {
        // new node created  
		Node new_node = new Node(val);
		if(pos == 0){
			new_node.next = head;
			head = new_node;

			return head;
		}

		// store the head in temp node 
		Node temp = head;
		int p = 0;    // starting p with 0
		while(p != pos - 1){
			temp = temp.next;
			p++;
		}

		new_node.next = temp.next;
		temp.next = new_node;

		return head;
    }
}

public class InsertPostLL {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();
        System.out.println("Enter the value int List :");
        LinkedList list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Enter the value of val :");
        int val = sc.nextInt();
        System.out.println("Enter the value of pos :");
        int pos = sc.nextInt();
        Node head = Solution.insert(list.head, n, pos, val);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}