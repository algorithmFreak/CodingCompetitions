package com.acc.rahul.srcLinkedList;

public class SinglyLinkedListTest {

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LinkedListWriteOperation write = new LinkedListWriteOperation();
		LinkedListReadOperation read = new LinkedListReadOperation();
		
		
		SLLNode headNode = new SLLNode(1);	
		
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(40) ,2); 
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		
		
		headNode = write.insertInSinglyLinkedList(headNode,  new SLLNode(190),3); 
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		
		headNode = write.insertInSinglyLinkedList(headNode,  new SLLNode(116),4); 
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		
		headNode = write.insertInSinglyLinkedList(headNode,  new SLLNode(10),5); 
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		
		int n=4;
		System.out.println(n+"th node from the end is "+ read.findNthNodeFromEnd(headNode, n).getData());
		
		
		headNode = write.deleteNodeFromSinglyLinkedList(headNode, 2);
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));

		headNode = write.deleteNodeFromSinglyLinkedList(headNode, 1);
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		
		headNode = write.insertInSinglyLinkedList(headNode,  new SLLNode(1),1); 
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(2) ,2); 
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(3) ,3); 
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(5) ,4);
		headNode = write.insertInSortedList(headNode, new SLLNode(4));
		read.printSLListLength(headNode);
		
		headNode = write.reverseLinkedList(headNode);
		read.printSLListLength(headNode);
		
		SLLNode headNode2 = new SLLNode(90);
		headNode2 = write.insertInSinglyLinkedList(headNode2,  new SLLNode(20),2); 
		read.printSLListLength(headNode2);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode2));
		
		headNode2 = write.insertInSinglyLinkedList(headNode2,  new SLLNode(40),3); 
		read.printSLListLength(headNode2);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode2));
		
		read.printSLListLength(headNode2);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode2));
		
		SLLNode intersectingNode = new SLLNode(1000);
		headNode = write.insertInSinglyLinkedList(headNode,intersectingNode,3); 
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		
		System.out.println("Middle is"+ read.findMiddleNode(headNode).getData()); 
{	
		SLLNode temp=headNode2;
		while(temp.getNext()!=null){
			temp= temp.getNext();
		}
		temp.setNext(intersectingNode);
}		
		read.printSLListLength(headNode2);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode2));
		System.out.println("Middle is"+ read.findMiddleNode(headNode2).getData()); 
		
		read.printSLListLength(headNode);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		
		System.out.println(read.findIntersectingNode(headNode, headNode2).getData());
		
		headNode = write.insertInSinglyLinkedList(headNode,  new SLLNode(80),3); 
		read.printSLListLength(headNode2);
		System.out.println("Singly Linked list size is:"+read.getSLListLength(headNode));
		System.out.println("Middle is"+ read.findMiddleNode(headNode).getData()); 
		
		read.printSLListLength(headNode);
		read.printLinkedListFromEnd(headNode);
		System.out.println();
		read.printSLListLength(headNode2);
		System.out.println("\n Is list even--"+read.isLinkedListEven(headNode2)); 
		headNode2 = write.insertInSinglyLinkedList(headNode2,  new SLLNode(50),2); 
		read.printSLListLength(headNode2);
		System.out.println("\n Is list even--"+read.isLinkedListEven(headNode2)); 
		
		
		
		headNode = new SLLNode(1);
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(3) ,2); 
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(4) ,3); 
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(6) ,4); 
		read.printSLListLength(headNode);
		
		headNode2 = new SLLNode(2);
		headNode2 = write.insertInSinglyLinkedList(headNode2, new SLLNode(2) ,2); 
		headNode2 = write.insertInSinglyLinkedList(headNode2, new SLLNode(5) ,3); 
		headNode2 = write.insertInSinglyLinkedList(headNode2, new SLLNode(5) ,4); 
		read.printSLListLength(headNode2);
		
		headNode = write.mergeSortedList(headNode, headNode2);
		read.printSLListLength(headNode);
		headNode = new SLLNode(1);
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(3) ,2); 
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(4) ,3); 
		headNode = write.insertInSinglyLinkedList(headNode, new SLLNode(6) ,4); 
		read.printSLListLength(headNode);
	//	write.reversePairByRecursion(headNode);
	//	headNode=write.reversePairByIteration(headNode);
		write.exchangeAdjacentNodes(headNode);
		read.printSLListLength(headNode);
	}
}
