package com.amey.linkedlist;

public class LinkedNode {

	private int data;
	
	private LinkedNode next;
	
	private LinkedNode start = null;

	public LinkedNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LinkedNode getNext() {
		return next;
	}

	public void setNext(LinkedNode next) {
		this.next = next;
	}
	
	/*
	 * public void insertNode(LinkedNode newNode) { // Insertion at the begining
	 * if(start == null) { start = newNode; newNode.next = null; }// At the end
	 * else{ LinkedNode ref = start; while(ref != null) { ref = start.next; } } //
	 * At the end
	 * 
	 * }
	 * 
	 * public void deleteNode() {
	 * 
	 * }
	 * 
	 * public void traverse() {
	 * 
	 * }
	 */
}
