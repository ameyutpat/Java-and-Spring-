package com.amey.linkedlist;

/*Reverse the linkedList
Removing duplicate nodes from linkedList
Sort the linkedList
Merge the two linkedList
Swap  the linkedList
Sum of all nodes in the linkedList
Find nth node from last*/


public class CountOfNode {
	 Node head;
	 class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	 
	 public void  insert(CountOfNode list , int data){
			Node new_Node = new Node(data);
			if(list.head == null) {
				head = new_Node;
			}else {
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = new_Node;
			}
		}
		
		public int count(CountOfNode list) {
			
			if(list.head == null) {
				System.out.println("List is empty.");
				return 0;
			}
			
			Node temp = head;
			int count =0;
			while(temp !=null) {
				count++;
				temp = temp.next;
			}
			return count;
		}
		
		public void printList(CountOfNode list) {
			
			if(list.head == null) {
				System.out.println("List is empty");
			}else {
				Node temp = head;
				while(temp != null){
					System.out.print(" "+ temp.data);
					temp = temp.next;
				}
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfNode list = new CountOfNode();
		list.insert(list,1);
		list.insert(list,2);
		list.insert(list,3);
		list.insert(list,4);
		list.insert(list,5);
		list.printList(list);
		int count = list.count(list);
		System.out.println("Count of Nodes: "+count);
	}

}
