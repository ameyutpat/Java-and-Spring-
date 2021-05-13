package com.amey.linkedlist;


public class NodeFromLast {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public void insert(NodeFromLast list, int data) {
		Node new_Node = new Node(data);
		if (list.head == null) {
			head = new_Node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new_Node;
		}
	}

	public int count(NodeFromLast list) {

		if (list.head == null) {
			System.out.println("List is empty.");
			return 0;
		}

		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public void findNode(NodeFromLast list, int n) {
		
		Node temp = list.head;
		int nodeCount = count(list);
		int differnece = nodeCount - n;
		int counter = 0;
		while(temp != null && counter != differnece) {
			counter++;
			temp = temp.next;
		}
		System.out.println("Data at Nth node: "+temp.data);
	}

	public void printList(NodeFromLast list) { 

		if (list.head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(" " + temp.data);
				temp = temp.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeFromLast list = new NodeFromLast();
		list.insert(list,1);
		list.insert(list,2);
		list.insert(list,3);
		list.insert(list,4);
		list.insert(list,5);
		list.insert(list,6);
		list.insert(list,7);
		list.insert(list,8);
		list.insert(list,9);
		list.insert(list,10);
		list.printList(list);
		list.findNode(list, 2); 
	}

}
