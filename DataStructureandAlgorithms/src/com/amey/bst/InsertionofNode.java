package com.amey.bst;
// It is insertion for Binary Search Tree
class Node{
	int key;
	Node left,right;
	Node(int data){
		key = data;
	}
}
public class InsertionofNode {

	static Node root;
	
	void insertionMethod(Node node , int key) {
		if(node == null) {
			 node = new Node(key);
		}
		if(key < node.key) {
			insertionMethod(node.left, key);
		}else {
			insertionMethod(node.right, key);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
