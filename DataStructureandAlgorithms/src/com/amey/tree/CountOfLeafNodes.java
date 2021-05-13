package com.amey.tree;

public class CountOfLeafNodes {

	static Node root;
	static int count =0;
	void findCountOfLeafNodes(Node node){
		if(node == null) {
			return;
		}
		if(node.left == null && node.right == null) {
			count++;
		}
		findCountOfLeafNodes(node.left);
		findCountOfLeafNodes(node.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfLeafNodes tree = new CountOfLeafNodes();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.findCountOfLeafNodes(root);
		System.out.println("Count of Leaf Nodes: "+count);
	}

}
