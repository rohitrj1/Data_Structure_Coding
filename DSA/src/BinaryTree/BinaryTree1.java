package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree1 {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BT{
		static int idx = -1;
		static Node buildTree(int [] node) {
			idx++;
			if(node[idx] == -1) {
				return null;
			}
			
			Node newNode = new Node(node[idx]);
			
			newNode.left = buildTree(node);
			newNode.right = buildTree(node);
			
			return newNode;
		}
		
	 static void levelOrder(Node root) {
		 if(root == null) {
			 return;
		 }
			Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			queue.add(null);
			
			while(!queue.isEmpty()) {
				Node currntNode = queue.remove();
				if(currntNode == null) {
					System.out.println();
					if(queue.isEmpty()) {
						break;
					}else {
						queue.add(null);
					}
				}else {
				System.out.print(currntNode.data+" ");
				if(currntNode.left!=null) {
					queue.add(currntNode.left);
				}
				if(currntNode.right!=null) {
					queue.add(currntNode.right);
				}
				}
			}
		}
	 
	 static int countNode(Node root) {
		 if(root == null) {
			 return 0;
		 }
		 
		 int leftNode = countNode(root.left);
		 int rightNode = countNode(root.right);
		 
		 return leftNode + rightNode + 1;
	 }
	 
	 static int sumOfNode(Node root) {
		 if(root == null) {
			 return 0;
		 }
		 
		 int leftSum = sumOfNode(root.left);
		 int rightSum = sumOfNode(root.right);
		 
		 return leftSum + rightSum + root.data;
	 }
	}
	
	
	
	public static void main(String[] args) {
		
		int [] node = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BT bt = new BT();
		Node root = bt.buildTree(node);
//		bt.levelOrder(root);
//		System.out.println(bt.countNode(root));
		
		System.out.println(bt.sumOfNode(root));
	}

}
