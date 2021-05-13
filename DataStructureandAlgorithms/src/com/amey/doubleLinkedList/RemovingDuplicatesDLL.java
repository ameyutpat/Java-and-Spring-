package com.amey.doubleLinkedList;

public class RemovingDuplicatesDLL {
	Node head;
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
	
	public void removingDuplicateNodes() {
		if(head == null) {
			return;
		}
		Node temp1,temp2;
		temp1 = head;
		while(temp1 != null) {
			int tempData = temp1.key;
			temp2 = temp1.next;
			while(temp2 != null) {
				if(temp2.key == tempData) {
					temp2.prev.next = temp2.next; 
					if(temp2.next != null) {
						temp2.next.prev = temp2.prev;
					}
				}
				temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovingDuplicatesDLL list1 = new RemovingDuplicatesDLL();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.prev = null;
		list1.head.next.next = new Node(1);
		list1.head.next.prev = list1.head;
		list1.head.next.next.next = new Node(1);
		list1.head.next.next.prev = list1.head.next;
		list1.head.next.next.next.prev = list1.head.next.next;
		list1.removingDuplicateNodes();
		list1.traverseFromHead();
	}

}
