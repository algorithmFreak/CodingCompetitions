package com.acc.rahul.srcGenericTree;

public class TreeNode {

	private int data;
	private TreeNode nextSibling;
	private TreeNode firstChild;
	
	public TreeNode(int data){
		this.data=data;
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
	 * @return the nextSibling
	 */
	public TreeNode getNextSibling() {
		return nextSibling;
	}
	/**
	 * @param nextSibling the nextSibling to set
	 */
	public void setNextSibling(TreeNode nextSibling) {
		this.nextSibling = nextSibling;
	}
	/**
	 * @return the firstChild
	 */
	public TreeNode getFirstChild() {
		return firstChild;
	}
	/**
	 * @param firstChild the firstChild to set
	 */
	public void setFirstChild(TreeNode firstChild) {
		this.firstChild = firstChild;
	}
	
	
	
}
