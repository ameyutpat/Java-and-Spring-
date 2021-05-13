package com.amey.doubleLinkedList;

class Node{
	int key;
	Node prev,next;
	
	Node(int data){
		key =data;
		prev=next=null;
	}
}
public class DoublyLinkedList {
	Node head,tail;
	public void traverseFromHead(){
		
		Node temp = head;
		if(temp == null) {
			return;
		}
		while(temp != null) {
			System.out.println(" "+temp.key);
			temp = temp.next;
		}
	}
	
	public void traverseFromTail() {
		Node temp = tail;
		if(temp == null) {
			return;
		}
		while(temp != null) {
			System.out.println(" "+temp.key);
			temp = temp.prev;
		}
	}
	
	public void insertNodeatBegin(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}else {
			Node temp = head;
			node.next = temp;
			temp.prev = node;
			head = node;
		}
	}
	
	public void insertAtEnd(int data) {
		
	    Node new_node = new Node(data);
	    new_node.prev = tail;
	    tail.next = new_node;
	}
	
	public void insertAfter(Node prev_Node, int new_data)
	{
	 
	    if (prev_Node == null) {
	        return;
	    }
	 
	    Node new_node = new Node(new_data);
	 
	    new_node.next = prev_Node.next;
	 
	    prev_Node.next = new_node;
	 
	    new_node.prev = prev_Node;
	   
	    if (new_node.next != null) {
	    	new_node.next.prev = new_node;
	    }
	        
	}
	
	public void sortLinkedList(Node node) {
		Node temp = node;
		if(temp == null) {
			return;
		}
		
		while(temp != null) {
			Node temp2 = temp.next; 
				if(temp.key > temp2.key) {
					int temp_data = temp.key;
					temp.key = temp2.key;
					temp2.key = temp_data;
				}
		}
	}
	public static void main(String[] args) {
		DoublyLinkedList list1 = new DoublyLinkedList();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.prev = null;
		list1.head.next.next = new Node(3);
		list1.head.next.prev = list1.head;
		list1.head.next.next.next = new Node(4);
		list1.head.next.next.prev = list1.head.next;
		list1.head.next.next.next.prev = list1.head.next.next;
		list1.tail = list1.head.next.next.next;
		//list1.traverseFromHead();
		//list1.traverseFromTail();
		//list1.insertNodeatBegin(6);
		//list1.traverseFromHead();
		//list1.insertAfter(list1.head.next, 5);
		list1.insertAtEnd(8);
		list1.traverseFromHead();
	}
}
