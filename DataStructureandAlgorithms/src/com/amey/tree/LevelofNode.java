package com.amey.tree;

public class LevelofNode {
	static Node root;
	
	int showLevelOfNode(Node node, int key, int level) {
		if (node == null) {
			return 0;
		}
		if (key == node.data) {
			return level;
		}
		int leftLevel = showLevelOfNode(node.left, key, level + 1);
		if (leftLevel != 0) {
			return leftLevel;
		}
		 leftLevel = showLevelOfNode(node.right, key, level + 1);
		;
		/*
		 * if (rightLevel != 0) { return rightLevel; }
		 */
		return leftLevel;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LevelofNode tree = new LevelofNode();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		int level = tree.showLevelOfNode(root, 5, 1);
		//System.out.println("Level of Node: "+level);
	}

}
