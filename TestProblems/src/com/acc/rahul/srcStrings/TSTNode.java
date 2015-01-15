package com.acc.rahul.srcStrings;

public class TSTNode {

	char data;
	boolean endOfString;
	TSTNode left;
	TSTNode eq;
	TSTNode right;
	
	/**
	 * @param data
	 * @param isEndOfString
	 * @param left
	 * @param eq
	 * @param right
	 */
	public TSTNode(char data) {
		super();
		this.data = data;
		this.endOfString = false;
		this.left = null;
		this.eq = null;
		this.right = null;
	}
	/**
	 * @return the data
	 */
	public char getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(char data) {
		this.data = data;
	}
	/**
	 * @return the isEndOfString
	 */
	public boolean isEndOfString() {
		return endOfString;
	}
	/**
	 * @param isEndOfString the isEndOfString to set
	 */
	public void setEndOfString(boolean isEndOfString) {
		this.endOfString = isEndOfString;
	}
	/**
	 * @return the left
	 */
	public TSTNode getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(TSTNode left) {
		this.left = left;
	}
	/**
	 * @return the eq
	 */
	public TSTNode getEq() {
		return eq;
	}
	/**
	 * @param eq the eq to set
	 */
	public void setEq(TSTNode eq) {
		this.eq = eq;
	}
	/**
	 * @return the right
	 */
	public TSTNode getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(TSTNode right) {
		this.right = right;
	}
	
	
	
}
