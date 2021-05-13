package com.amey.doubleLinkedList;

public class DLLSort {
	Node head,tail;

	public void traverseFromHead() {
		if(head== null) {
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.println(" "+temp.key);
			temp = temp.next;
		}
	}
	
	public void sortDLL() {
		Node temp = head;
		Node ptr1;
		Node lptr = null;
		int swapped=0;
		if(temp == null) {
			return;
		}
		do {
			swapped = 0;
			ptr1 = temp;
			while(ptr1.next != lptr) {
				if(ptr1.key > ptr1.next.key) {
					int t = ptr1.key;
					ptr1.key = ptr1.next.key;
					ptr1.next.key = t;
					swapped =1;
				}
				ptr1 = ptr1.next;
			}
			lptr = ptr1;
		}while(swapped != 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLLSort list1 = new DLLSort(); 
		list1.head = new Node(100);
		list1.head.next = new Node(27);
		list1.head.prev = null;
		list1.head.next.next = new Node(367);
		list1.head.next.prev = list1.head;
		list1.head.next.next.next = new Node(4);
		list1.head.next.next.prev = list1.head.next;
		list1.head.next.next.next.prev = list1.head.next.next;
		list1.tail = list1.head.next.next.next;
		list1.sortDLL();
		list1.traverseFromHead();
		

	}

}
