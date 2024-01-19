package BinarySeachTree;

public class BST {
	
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public static Node insert(Node root , int val) {
		if(root == null) {
			root = new Node(val);
			return root;
		}
		else if(val > root.data) {
			root .right =  insert(root.right , val);
		}else if(val <root.data) {
			root.left =  insert(root.left ,val);
		}
		return root;
	}
	
	public static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data +" ");
		inOrder(root.right);
	}
	
	public static boolean searchTree(Node root , int key) {
		if(root == null) return false;
		if(root.data == key) return true;
		if(key > root.data) {
			return searchTree(root.right ,key);
		}
		if(key < root.data) {
			return searchTree(root.left, key);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int val [] = {5,1,3,4,2,7};
		Node root = null;
		
		for(int i = 0 ;i <val.length;i++) {
			root = insert(root , val[i]);
		}
		
		inOrder(root);
		System.out.println(searchTree(root, 1));
		
	}

}
