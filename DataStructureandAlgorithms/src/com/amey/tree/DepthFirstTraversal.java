package com.amey.tree;

public class DepthFirstTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree1 tree = new BinaryTree1();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		 System.out.println(
		            "Preorder traversal of binary tree is ");
		 tree.printPreorderUtil();
			
			  System.out.println("\nInorder traversal of binary tree is ");
			  tree.printInorderUtil();
			  System.out.println("\nPostorder traversal of binary tree is ");
			  tree.printPostorderUtil();
			 
		
	}

}
class BinaryTree1{
	Node1 root;
	BinaryTree1(){
		root = null;
	}
	
	void printPostorderUtil() {
		printPostorder(root);
	}

	void printInorderUtil() {
		printInorder(root);
	}

	void printPreorderUtil() {
		printPreorder(root);
	}
	void printPreorder(Node1 node) {
		if(node == null) {
			return;
		}
		System.out.println(" "+node.data);
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	void printInorder(Node1 node) {
		if(node == null) {
			return;
		}
		printInorder(node.left);
		System.out.println(" "+node.data);
		printInorder(node.right);
	}
	
	void printPostorder(Node1 node) {
		if(node == null) {
			return;
		}
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.println(" "+node.data);
	}
}
class Node1{
	int data;
	Node1 left,right;
	
	public Node1(int d){
		data = d;
		left=right=null;
	}
}
