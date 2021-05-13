package com.amey.tree;

class LeafNodes {
	 Node root;
	void showLeafNodes(Node node) {
		if(node == null) {
			return;
		}
		if(node.left == null && node.right == null) {
			System.out.println(""+node.data);
		}
		showLeafNodes(node.left);
		showLeafNodes(node.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeafNodes tree = new LeafNodes();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		//tree.showLeafNodes(root);
	}

}
