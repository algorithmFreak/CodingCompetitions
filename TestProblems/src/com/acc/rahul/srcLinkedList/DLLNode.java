package com.acc.rahul.srcLinkedList;

public class DLLNode implements LinkedList{

	private DLLNode previous;
	private int data;
	private DLLNode next;
	
	
	
	/**
	 * @param data
	 */
	public DLLNode(int data) {
		super();
		this.data = data;
	}
	
	/**
	 * @return the previous
	 */
	public DLLNode getPrevious() {
		return previous;
	}
	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(DLLNode previous) {
		this.previous = previous;
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
	public DLLNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(DLLNode next) {
		this.next = next;
	}
	
	
	
}
