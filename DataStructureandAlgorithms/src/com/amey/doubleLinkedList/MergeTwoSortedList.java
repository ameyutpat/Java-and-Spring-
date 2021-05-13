package com.amey.doubleLinkedList;

public class MergeTwoSortedList {
	public static void traverseFromHead(Node head){
		
		Node temp = head;
		if(temp == null) {
			return;
		}
		while(temp != null) {
			System.out.println(" "+temp.key);
			temp = temp.next;
		}
	}
	
	public static void mergeSortedLists(Node head1, Node head2) {
		if(head1 == null) {
			head1 = head2;
		}
		if(head2 == null) {
			return;
		}
		Node temp2 = head2;
		while(temp2 != null) {
			insertInSortedList(head1, temp2.key);
			temp2 = temp2.next;
		}
	}
	
	public static void insertInSortedList(Node head, int data) {
		Node new_Node = new Node(data);
		if(head == null) {
			head = new_Node;
			return;
		}
		else if(head.key > new_Node.key) {
			new_Node.next = head;
			head = new_Node;
		}else {
			Node current = head;
			while(current.next != null && current.next.key < new_Node.key) {
				current = current.next;
			}
			new_Node.next = current.next;
			current.next = new_Node;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(2);
		head1.next = new Node(5);
		head1.next.next = new Node(7);
		head1.next.next.next = new Node(15);
		
		
		  Node head2 = new Node(3); head2.next = new Node(11);
		  
		  mergeSortedLists(head1, head2);
		 
		//insertInSortedList(head, 13);
		traverseFromHead(head1);
	}

}
