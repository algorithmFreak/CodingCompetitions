package com.acc.rahul.srcTree;

public class BinaryTreeNode<E> {

	private E data;
	private BinaryTreeNode<E> left;
	private BinaryTreeNode<E> right;
	private BinaryTreeNode<E> nextSibling;
	
	/**
	 * @return the data
	 */
	public E getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(E data) {
		this.data = data;
	}
	/**
	 * @return the left
	 */
	public BinaryTreeNode<E> getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(BinaryTreeNode<E> left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public BinaryTreeNode<E> getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(BinaryTreeNode<E> right) {
		this.right = right;
	}
	/**
	 * @return the nextSibling
	 */
	public BinaryTreeNode<E> getNextSibling() {
		return nextSibling;
	}
	/**
	 * @param nextSibling the nextSibling to set
	 */
	public void setNextSibling(BinaryTreeNode<E> nextSibling) {
		this.nextSibling = nextSibling;
	}
	
	
	
}
