package com.amey.linkedlist;

import com.amey.linkedlist.SinglyLinkedList.Node;

public class RemovingDuplicates {
	
		Node head;
		class Node{
			int data;
			Node next;
			
			Node(int d){
				data = d;
				next=null;
			}
		}
		public   RemovingDuplicates insert(RemovingDuplicates list, int data) {
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
		 public static void printList(RemovingDuplicates list)
		    {
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
	
	public void findDuplicateNodes(RemovingDuplicates list) {
		RemovingDuplicates tempList = new RemovingDuplicates();
		RemovingDuplicates duplicateList = new RemovingDuplicates();
		Node temp1 = list.head;
		while(temp1 != null) {
			int data = temp1.data; 
			/*
			 * if(duplicateList == ) {
			 * 
			 * }
			 */
		}
	}
	
	public static void main(String[] args) {
		
		RemovingDuplicates list = new RemovingDuplicates();
		list.insert(list,1);
		list.insert(list,3);
		list.insert(list,1);
		list.insert(list,4);
		list.insert(list,1);
		list.insert(list,3);
		list.insert(list,7);
		list.insert(list,9);
		list.insert(list,9);
		list.insert(list,10);
		printList(list);
	}

}
