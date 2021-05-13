package com.amey.doubleLinkedList;

/*
 * 		Input : 1->4->8->10->15 

		Output: 1->8->15
 */
/*
 * Swap every two nodes in a linked list?

Input: 1 -> 2 -> 3 -> 4

Output: 2 -> 1 -> 4 -> 3
 */
public class AlteranateDeletionDLL {
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
	public void alternateDeletion() {
		if(head == null) {
			return;
		}
		Node temp1 = head;
		Node temp2 = head.next;
		while(temp1 != null && temp2 != null) {
			temp1.next = temp2.next;
			
			temp2 = null;
			
			temp1= temp1.next;
			if(temp1 != null) {
				temp2 = temp1.next;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlteranateDeletionDLL list1 = new AlteranateDeletionDLL();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.prev = null;
		list1.head.next.next = new Node(3);
		list1.head.next.prev = list1.head;
		list1.head.next.next.next = new Node(4);
		list1.head.next.next.prev = list1.head.next;
		list1.head.next.next.next.prev = list1.head.next.next;
		list1.tail = list1.head.next.next.next;
		list1.alternateDeletion();
		list1.traverseFromHead();
	}
}
