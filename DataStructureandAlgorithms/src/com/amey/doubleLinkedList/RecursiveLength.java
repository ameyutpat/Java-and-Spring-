package com.amey.doubleLinkedList;

public class RecursiveLength {
	static Node head;
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
	
	public int recursiveLength(Node node) {
		if(node == null) {
			return 0;
		}else {
			return 1+ recursiveLength(node.next);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveLength list1 = new RecursiveLength();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.prev = null;
		list1.head.next.next = new Node(3);
		list1.head.next.prev = list1.head;
		list1.head.next.next.next = new Node(4);
		list1.head.next.next.prev = list1.head.next;
		list1.head.next.next.next.prev = list1.head.next.next;
		int count = list1.recursiveLength(head);
		System.out.println("Count of Node : "+count);
		
	}

}
