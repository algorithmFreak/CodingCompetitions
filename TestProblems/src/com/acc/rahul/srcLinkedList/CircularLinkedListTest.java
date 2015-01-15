package com.acc.rahul.srcLinkedList;

import java.util.List;

public class CircularLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListWriteOperation write = new LinkedListWriteOperation();
		LinkedListReadOperation read = new LinkedListReadOperation();
		
		CLLNode headNode = new CLLNode(1);
		headNode.setNext(headNode);
		
		headNode = write.insertAtBeginInCircularLinkedList(headNode,new CLLNode(2));
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));

		headNode = write.insertAtBeginInCircularLinkedList(headNode,new CLLNode(3));
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		headNode = write.insertAtBeginInCircularLinkedList(headNode,new CLLNode(4));
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		headNode = write.insertAtBeginInCircularLinkedList(headNode,new CLLNode(5));
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		headNode = write.insertAtEndInCircularLinkedList(headNode,new CLLNode(6));
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		headNode = write.insertAtEndInCircularLinkedList(headNode,new CLLNode(7));
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		headNode = write.insertAtEndInCircularLinkedList(headNode,new CLLNode(8));
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		headNode = write.deleteFirstNodeFromCircularLinkedList(headNode);
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		headNode = write.deleteLastNodeFromCircularLinkedList(headNode);
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		headNode = write.insertAtEndInCircularLinkedList(headNode,new CLLNode(300));
		read.printCLListLength(headNode);
		System.out.println("Circular linked list size is:"+read.getCLListLength(headNode));
		
		List<CLLNode> headList = write.splitCircularListIntoTwo(headNode);
		if(headList!=null){
			read.printCLListLength(headList.get(0));
			read.printCLListLength(headList.get(1));
		}
		
	}

	
}
