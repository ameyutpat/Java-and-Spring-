package com.amey.doubleLinkedList;
// This is sorted list and we have to insert at appropriate position
public class InsertingInSortedDLL {

	Node head,tail;
	void insertInSortedList(int key){
		Node newNode = new Node(key);
		if(head== null) {
			head = newNode;
		}
		else if(newNode.key <= head.key) {
			newNode.next = head.next;
			newNode.next.prev = newNode;
			head = newNode;
		}else {
			Node current = head;
			while(current.next != null && 
					current.next.key < newNode.key) {
				current = current.next;
			}
			newNode.next = current.next;
			if(current.next != null) {
				newNode.next.prev = newNode;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertingInSortedDLL list1 = new InsertingInSortedDLL();
		list1.head = new Node(10);
		list1.head.next = new Node(20);
		list1.head.prev = null;
		list1.head.next.next = new Node(30);
		list1.head.next.prev = list1.head;
		list1.head.next.next.next = new Node(40);
		list1.head.next.next.prev = list1.head.next;
		list1.head.next.next.next.prev = list1.head.next.next;
		list1.tail = list1.head.next.next.next;
		list1.insertInSortedList(25);
		list1.traverseFromHead();
	}

}
