package com.amey.doubleLinkedList;

public class RecursiveMid {
	static Node head;
	static int n;
	static Node mid;
	  
	public static void midpoint_util(Node head) {
		 if (head == null) 
		    { 
		        n = (n) / 2; 
		        return; 
		    } 
		  
		    n = n + 1; 
		  
		    midpoint_util(head.next); 
		  
		    // Rolling back, decrement n by one 
		    n = n - 1; 
		    if (n == 0) 
		    { 
		  
		        // Final answer 
		        mid = head; 
		    } 
	}
	
	static Node midpoint(Node head) 
	{ 
	    mid = null; 
	    n = 1; 
	    midpoint_util(head); 
	    return mid; 
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveMid list1 = new RecursiveMid();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.prev = null;
		list1.head.next.next = new Node(3);
		list1.head.next.prev = list1.head;
		list1.head.next.next.next = new Node(4);
		list1.head.next.next.prev = list1.head.next;
		list1.head.next.next.next.prev = list1.head.next.next;
		list1.head.next.next.next.next = new Node(5);
		//list1.head.next.next.next.next.next = new Node(6);
		Node result = midpoint(head);
		System.out.println(result.key);
	}

}
