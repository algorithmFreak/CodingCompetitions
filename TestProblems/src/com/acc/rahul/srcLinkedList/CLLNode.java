package com.acc.rahul.srcLinkedList;

public class CLLNode implements LinkedList{

	private int data;
	private CLLNode next;
	
	
	/**
	 * @param data
	 */
	public CLLNode(int data) {
		super();
		this.data = data; 
	}
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the next
	 */
	public CLLNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(CLLNode next) {
		this.next = next;
	}
}
