package com.acc.rahul.srcLinkedList;

public class DoublyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedListWriteOperation write = new LinkedListWriteOperation();
		LinkedListReadOperation read = new LinkedListReadOperation();
		
		DLLNode headNode = new DLLNode(1);
		
		headNode =	write.insertInDoublyLinkedList(headNode, new DLLNode(2),2);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));	
		
		headNode = write.insertInDoublyLinkedList(headNode, new DLLNode(3),3);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));	
		
		headNode =	write.insertInDoublyLinkedList(headNode,new DLLNode(4),4);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));	
		
		headNode =	write.insertInDoublyLinkedList(headNode, new DLLNode(5),5);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));	
		
	//	headNode =	write.deleteNodeFromDoublylyLinkedList(headNode,1);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));	
		
	//	headNode =	write.deleteNodeFromDoublylyLinkedList(headNode,1);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));
		
		headNode =	write.insertInDoublyLinkedList(headNode, new DLLNode(9),6);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));
		
		headNode =	write.insertInDoublyLinkedList(headNode, new DLLNode(10),7);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));
		
		headNode =	write.insertInDoublyLinkedList(headNode, new DLLNode(11),8);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));
		
		headNode =	write.insertInDoublyLinkedList(headNode, new DLLNode(12),9);
		read.printDLListLength(headNode);
		System.out.println("Doubly linked list size is:"+read.getDLListLength(headNode));
		
		DLLNode root = write.DLLtoBalancedBST(headNode);
		read.inOrderTraversalofBST(root);
		
	}

}
