package com.amey.linkedlist;

public class TestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedNode head = new LinkedNode(10);
		LinkedNode temp2 = new LinkedNode(20);
		LinkedNode temp3 = new LinkedNode(30);
		LinkedNode temp4 = new LinkedNode(40);
		head.setNext(temp2);
		temp2.setNext(temp3);
		temp3.setNext(temp4);
		printList(head);
	}

	private static void printList(LinkedNode head) {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println(" SinglyLinked list is empty..");
		}else {
			LinkedNode temp = head;
			while(temp != null){
				System.out.println(" "+temp.getData());
				temp = temp.getNext();
			}
		}
	}

}
