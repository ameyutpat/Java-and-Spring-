package com.amey.circularLinkedList;

import com.amey.linkedlist.SinglyLinkedList;

public class CircularLL {
	static Node head;
	static Node tail;
	public static void insertBegain(int key) {
		
		Node newNode = new Node(key);
		if(head == null  ) {
			head = newNode;
		}else {
			newNode.next = head;
			tail.next = newNode;
		}
		
		
	}
	 public static void printList(Node head)
	    {
	        Node currNode = head;
	 
	        System.out.print("\nLinkedList: ");
	 
	        // Traverse through the LinkedList
	        while (currNode != null) {
	            // Print the data at current node
	            System.out.print(currNode.key + " ");
	 
	            // Go to next node
	            currNode = currNode.next;
	        }
	        System.out.println("\n");
	    }
	public static void main(String[] args) {
		 head = new Node(2); head.next = new
		 Node(3); head.next.next = new Node(4); tail = head.next.next; tail.next =
		 head;
		 
		insertBegain(1);
		
		printList(head);
	}

}
