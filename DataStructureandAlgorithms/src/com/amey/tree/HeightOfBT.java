package com.amey.tree;

public class HeightOfBT {

	static Node root;
	
	 int heightOfBinaryTree(Node node) {
		if(node == null) {
			return 0;
		}
		int leftHeight = heightOfBinaryTree(node.left);
		int rightHeight = heightOfBinaryTree(node.right);
		return Math.max(leftHeight, rightHeight)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightOfBT  tree = new HeightOfBT();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		int height = tree.heightOfBinaryTree(root);
		System.out.println("Height of binary tree: "+height);
	}

}
