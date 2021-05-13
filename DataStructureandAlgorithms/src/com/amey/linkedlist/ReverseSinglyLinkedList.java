package com.amey.linkedlist;


public class ReverseSinglyLinkedList {

	 Node head;
	 class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	 
	 public void  insert(ReverseSinglyLinkedList list , int data){
			Node new_Node = new Node(data);
			if(list.head == null) {
				head = new_Node;
			}else {
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = new_Node;
			}
		}
		
		
		public void printList(ReverseSinglyLinkedList list) {
			
			if(list.head == null) {
				System.out.println("List is empty");
			}else {
				Node temp = head;
				while(temp != null){
					System.out.print(" "+ temp.data);
					temp = temp.next;
				}
			}
		}
		
		public ReverseSinglyLinkedList reverseList(ReverseSinglyLinkedList list) {
			
			Node current = list.head;
			Node prev = null, above = null;
			
			while(current != null) {
				above = current.next;
				current.next = prev;
				prev = current;
				current = above;
			}
			list.head = prev;
			return list;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
		list.insert(list,1);
		list.insert(list,2);
		list.insert(list,3);
		list.insert(list,4);
		list.insert(list,5);
		list.insert(list,6);
		list.printList(list);
		list.reverseList(list);
		list.printList(list);
	}

}
