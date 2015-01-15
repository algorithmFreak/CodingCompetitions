package com.acc.rahul.srcLinkedList;

public class SLLNode implements LinkedList {

	private int data;
	private SLLNode next;

	/**
	 * @param data
	 */
	public SLLNode(int data) {
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
	 * @param data
	 *            the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public SLLNode getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(SLLNode next) {
		this.next = next;
	}
}
