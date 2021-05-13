package com.amey.linkedlist;


public class MiddleElement {
	 Node head;
	 class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	 
	 public void  insert(MiddleElement list , int data){
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
		
		
		public void printList(MiddleElement list) {
			
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
		
		public int findMiddleElement(MiddleElement list){
			
			int length = 0;
			Node temp = list.head;
			Node middle =  list.head;
			while(temp.next != null) {
				length++;
				if(length % 2 == 0 ) {
					middle = middle.next;
				}
				temp = temp.next;
			}
			if(length % 2 == 1 ) {
				middle = middle.next;
			}
			return middle.data;
		}
		
		public void findMiddleElement2(MiddleElement list){
			int length = 0;
			Node current = list.head;
			Node middle =  list.head;
			while(current.next != null){
		          length++;
		          if(length%2 ==0){
		              middle = middle.next;
		          }
		          current = current.next;
		      }
		    
		      if(length%2 == 1){
		          middle = middle.next;
		      }

		      System.out.println("length of LinkedList: " + length);
		      System.out.println("middle element of LinkedList : "+ middle.data);
		     
		    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleElement list = new MiddleElement();
		list.insert(list,1);
		list.insert(list,2);
		list.insert(list,3);
		list.insert(list,4);
		list.insert(list,5);
		list.insert(list,6);
		//list.printList(list);
		//int middle = list.findMiddleElement(list);
		list.findMiddleElement2(list);
	//System.out.println("" + middle);
	}

}
