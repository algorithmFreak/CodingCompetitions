package com.acc.rahul.srcLinkedList;

public class LinkedListWithLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListWriteOperation write = new LinkedListWriteOperation();
		LinkedListReadOperation read = new LinkedListReadOperation();
		
		SLLNode sslHeadNode = new SLLNode(1);	
		
		sslHeadNode = write.insertInSinglyLinkedList(sslHeadNode, new SLLNode(40) ,2); 
		read.printSLListLength(sslHeadNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(sslHeadNode));
		
		
		sslHeadNode = write.insertInSinglyLinkedList(sslHeadNode,  new SLLNode(190),3); 
		read.printSLListLength(sslHeadNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(sslHeadNode));
		
		sslHeadNode = write.insertInSinglyLinkedList(sslHeadNode,  new SLLNode(116),4); 
		read.printSLListLength(sslHeadNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(sslHeadNode));
		
		sslHeadNode = write.insertInSinglyLinkedList(sslHeadNode,  new SLLNode(10),5); 
		read.printSLListLength(sslHeadNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(sslHeadNode));
		
		sslHeadNode = write.insertInSinglyLinkedList(sslHeadNode,  new SLLNode(100),6); 
		read.printSLListLength(sslHeadNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(sslHeadNode));
		
		
		write.createLoopInLinkedList(sslHeadNode, 3);
		System.out.println(read.isLinkedListContainsLoop(sslHeadNode));
		
		System.out.println(read.findBeginofLoop(sslHeadNode).getData());
		
		System.out.println(read.findLoopLength(sslHeadNode));
		
	}

}
