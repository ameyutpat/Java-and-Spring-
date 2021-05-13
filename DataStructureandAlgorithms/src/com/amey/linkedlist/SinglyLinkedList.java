package com.amey.linkedlist;

public class SinglyLinkedList {

	Node head; // head of list
	 
    static class Node {
 
        int data;
        Node next;
 
        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    public static SinglyLinkedList insert(SinglyLinkedList list,
                                    int data)
    {
        Node new_node = new Node(data);
 
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
 
            // Insert the new_node at last node
            last.next = new_node;
        }
 
        return list;
    }
    
    public static SinglyLinkedList insertAtBegain(SinglyLinkedList list,
            int data) {
    	Node new_Node = new Node(data);
    	
    	new_Node.next = list.head;
    	list.head = new_Node;
    	return list;
    } 
    
    public static void insertAfter(Node prev,
            int data) {
    	Node new_Node = new Node(data);
    	new_Node.next = prev.next;
    	prev.next = new_Node;
    }
    public static void printList(SinglyLinkedList list)
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
    
	public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) {
		Node currNode = list.head, prev = null;

		// CASE 1:
		// If head node itself holds the key to be deleted

		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; // Changed head

			System.out.println(key + " found and deleted");

			return list;
		}

		// CASE 2:
		// If the key is somewhere other than at head
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}

		if (currNode != null) {
			prev.next = currNode.next;

			System.out.println(key + " found and deleted");
		}


		// CASE 3: The key is not present
		if (currNode == null) {
			System.out.println(key + " not found");
		}

		return list;
	}
	
	
	 public static void main(String[] args)
	    {
	        /* Start with the empty list. */
		 SinglyLinkedList list = new SinglyLinkedList();
	 
	        //
	        // ******INSERTION******
	        //
	 
	        // Insert the values
	        list = insert(list, 1);
	        list = insert(list, 2);
	        list = insert(list, 3);
	        list = insert(list, 4);
	        list = insert(list, 5);
	        list = insert(list, 6);
	        list = insert(list, 7);
	        list = insert(list, 8);
	        list = insertAtBegain(list,19);
	        
	        insertAfter(list.head.next, 9 );
	 
	        // Print the LinkedList
	        printList(list);
	    }
}
