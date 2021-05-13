package com.amey.linkedlist;

import com.amey.linkedlist.SinglyLinkedList.Node;

public class SwapNodes {
	Node head;

	public static void printList(SwapNodes list) {
		Node currNode = list.head;

		System.out.print("\nLinkedList: ");

		// Traverse through the LinkedList
		while (currNode != null) {
			// Print the data at current node
			System.out.print(currNode.data + " ");

			// Go to next node
			currNode = currNode.next;
		}
		System.out.println("\n");
	}

	public static SwapNodes insert(SwapNodes list, int data) {
		Node new_node = new Node(data);

		if (list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}

			last.next = new_node;
		}

		return list;
	}
	
	public void swapPairNodes() {
		if(head == null) {
			return;
		}
		if(head.next == null) {
			System.out.println("Only one node in Linked list");
			return;
		}
		Node temp1 = head;
		while(temp1 != null && temp1.next != null) {
			// Actual swapping
			int swap = temp1.data;
			temp1.data = temp1.next.data;
			temp1.next.data = swap;
			// ReInitailization to next to next node
			temp1 = temp1.next.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNodes list = new SwapNodes();
		list = insert(list, 1);
		list = insert(list, 2);
		//list = insert(list, 3);
		list = insert(list, 4);
		list = insert(list, 5);
		list = insert(list, 6);
		list = insert(list, 7);
		list = insert(list, 8);
		list.swapPairNodes();
		printList(list);
	}

}
