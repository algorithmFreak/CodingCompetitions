package com.acc.rahul.srcLinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListWriteOperation {

	private LinkedListReadOperation linkedListReadOperation = new LinkedListReadOperation();

	/**
	 * this method inserts a new node to a singly linked list.
	 * 
	 * @param headNode
	 * @param nodeToInsert
	 * @param position
	 * @return SLLNode
	 */
	public SLLNode insertInSinglyLinkedList(SLLNode headNode,
			SLLNode nodeToInsert, int position) {

		// Inserting at beginning in an empty list.
		if (headNode == null) {
			return nodeToInsert;
		}
		int size = linkedListReadOperation.getSLListLength(headNode);
		if (position < 1 || position > size + 1) {
			System.out
					.println("Position of node to insert in invalid. The valid inputs are 1 to "
							+ (size + 1));
			return headNode;
		}
		// inserting at the beginning in a non-empty list.
		if (position == 1) {
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		} else {
			// inserting the node in middle or end.
			SLLNode previousNode = headNode;
			int count = 1;
			while (count < position - 1) {
				previousNode = previousNode.getNext();
				count++;
			}
			SLLNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}

	/**
	 * This method deletes a node from singly linked list.
	 * 
	 * @param headNode
	 * @param position
	 * @return SLLNode
	 */
	public SLLNode deleteNodeFromSinglyLinkedList(SLLNode headNode, int position) {

		if (headNode == null) {
			System.out.println("List is empty");
			return null;
		}

		int size = linkedListReadOperation.getSLListLength(headNode);
		if (position < 1 || position > size) {
			System.out
					.println("Position of node to delete is invalid. The valid inputs are 1 to "
							+ size);
			return headNode;
		}
		// deleting from the beginning.
		if (position == 1) {
			SLLNode currentNode = headNode.getNext();
			System.out.println("Node deleted is" + headNode.getData());
			headNode = null;
			return currentNode;
		} else {
			// deleting the node from middle or end.
			int count = 1;
			SLLNode previousNode = headNode;
			while (count < position - 1) {
				previousNode = previousNode.getNext();
				count++;
			}
			SLLNode currentNode = previousNode.getNext();
			System.out.println("Node deleted is" + currentNode.getData());
			previousNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		return headNode;
	}

	/**
	 * this method inserts a new node to a singly linked list.
	 * 
	 * @param headNode
	 * @param nodeToInsert
	 * @param position
	 * @return DLLNode
	 */
	public DLLNode insertInDoublyLinkedList(DLLNode headNode,
			DLLNode nodeToInsert, int position) {

		// Inserting at beginning in an empty list.
		if (headNode == null) {
			return nodeToInsert;
		}
		int size = linkedListReadOperation.getDLListLength(headNode);
		if (position < 1 || position > size + 1) {
			System.out
					.println("Position of node to insert in invalid. The valid inputs are 1 to "
							+ (size + 1));
			return headNode;
		}
		// inserting at the beginning in a non-empty list.
		if (position == 1) {
			nodeToInsert.setNext(headNode);
			headNode.setPrevious(nodeToInsert);
			return nodeToInsert;
		} else {
			// inserting the node in middle or end.
			DLLNode previousNode = headNode;
			int count = 1;
			while (count < position - 1) {
				previousNode = previousNode.getNext();
				count++;
			}
			DLLNode currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			nodeToInsert.setPrevious(previousNode);
			previousNode.setNext(nodeToInsert);
			if (currentNode != null) {
				currentNode.setPrevious(nodeToInsert);
			}
		}
		return headNode;
	}

	/**
	 * This method deletes a node from singly linked list.
	 * 
	 * @param headNode
	 * @param position
	 * @return DLLNode
	 */
	public DLLNode deleteNodeFromDoublylyLinkedList(DLLNode headNode,
			int position) {

		if (headNode == null) {
			System.out.println("List is empty");
			return null;
		}

		int size = linkedListReadOperation.getDLListLength(headNode);
		if (position < 1 || position > size) {
			System.out
					.println("Position od node to delete is invalid. The valid inputs are 1 to "
							+ size);
			return headNode;
		}
		// deleting from the beginning.
		if (position == 1) {
			DLLNode currentNode = headNode.getNext();
			System.out.println("Node deleted is " + headNode.getData());
			currentNode.setPrevious(null);
			headNode = null;
			return currentNode;
		} else {
			// deleting the node from middle or end.
			int count = 1;
			DLLNode previousNode = headNode;
			while (count < position - 1) {
				previousNode = previousNode.getNext();
				count++;
			}
			DLLNode currentNode = previousNode.getNext();
			DLLNode nextNode = currentNode.getNext();
			System.out.println("Node deleted is " + currentNode.getData());
			previousNode.setNext(nextNode);
			if (nextNode != null)
				nextNode.setPrevious(previousNode);
			currentNode = null;
		}
		return headNode;
	}

	/**
	 * This method adds a new Node at the end of a circular linked list.
	 * 
	 * @param headNode
	 * @param nodeToInsert
	 * @return CLLNode
	 */
	public CLLNode insertAtEndInCircularLinkedList(CLLNode headNode,
			CLLNode nodeToInsert) {

		nodeToInsert.setNext(nodeToInsert);
		if (headNode == null) {
			return nodeToInsert;
		}
		CLLNode currentNode = headNode;
		while (currentNode.getNext() != headNode) {
			currentNode = currentNode.getNext();
		}

		nodeToInsert.setNext(headNode);
		currentNode.setNext(nodeToInsert);

		return headNode;
	}

	/**
	 * This method adds a new Node at the beginning of a circular linked list.
	 * 
	 * @param headNode
	 * @param NodeToInsert
	 * @return CLLNode
	 */
	public CLLNode insertAtBeginInCircularLinkedList(CLLNode headNode,
			CLLNode nodeToInsert) {

		nodeToInsert.setNext(nodeToInsert);
		if (headNode == null) {
			return nodeToInsert;
		}
		CLLNode currentNode = headNode;
		while (currentNode.getNext() != headNode) {
			currentNode = currentNode.getNext();
		}
		nodeToInsert.setNext(headNode);
		currentNode.setNext(nodeToInsert);

		return nodeToInsert;
	}

	/**
	 * This method deletes the last Node from circular linked list
	 * 
	 * @param head
	 * @return CLLNode
	 */
	public CLLNode deleteLastNodeFromCircularLinkedList(CLLNode headNode) {

		if (headNode == null) {
			return null;
		}
		CLLNode tempNode = headNode;
		CLLNode previousNode = headNode;
		while (previousNode.getNext() != headNode) {
			tempNode = previousNode;
			previousNode = previousNode.getNext();
		}
		System.out.println("Node deleted is" + previousNode.getData());
		tempNode.setNext(headNode);
		return headNode;
	}

	/**
	 * This method deletes the last Node from circular linked list
	 * 
	 * @param head
	 * @return CLLNode
	 */
	public CLLNode deleteFirstNodeFromCircularLinkedList(CLLNode headNode) {

		if (headNode == null) {
			return null;
		}

		CLLNode currentNode = headNode;
		while (currentNode.getNext() != headNode) {
			currentNode = currentNode.getNext();
		}
		System.out.println("Node deleted is" + headNode.getData());
		CLLNode tempNode = headNode.getNext();
		currentNode.setNext(tempNode);
		headNode = tempNode;

		return headNode;
	}

	/**
	 * this method inserts a new node to a singly linked list.
	 * 
	 * @param headNode
	 * @param nodeToInsert
	 * @param position
	 * @return
	 */
	public void createLoopInLinkedList(SLLNode headNode, int position) {

		int size = linkedListReadOperation.getSLListLength(headNode);
		if (position < 1 || position > size + 1) {
			System.out
					.println("Position of node to insert in invalid. The valid inputs are 1 to "
							+ (size + 1));
		}

		SLLNode currentNode = headNode, temp = null;
		int count = 0;
		while (currentNode.getNext() != null) {
			count++;
			if (count == position) {
				temp = currentNode;
			}
			currentNode = currentNode.getNext();
		}

		System.out.println("last" + currentNode.getData());
		currentNode.setNext(temp);
		System.out.println("joining at" + temp.getData());
	}

	/**
	 * this method inserts a new node to a singly linked list.
	 * 
	 * @param headNode
	 * @param nodeToInsert
	 * @param position
	 * @return SLLNode
	 */
	public SLLNode insertInSortedList(SLLNode headNode, SLLNode nodeToInsert) {

		// Inserting at beginning in an empty list.
		if (headNode == null) {
			return nodeToInsert;
		}

		if (headNode.getData() > nodeToInsert.getData()) {
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		}

		SLLNode current = headNode, temp = headNode;
		while (current != null && current.getData() < nodeToInsert.getData()) {
			temp = current;
			current = current.getNext();
		}
		nodeToInsert.setNext(current);
		temp.setNext(nodeToInsert);

		return headNode;
	}

	/**
	 * This method reverses the linked list.
	 * 
	 * @param headNode
	 * @return SLLNode
	 */
	public SLLNode reverseLinkedList(SLLNode headNode) {

		SLLNode temp = null, nextNode = null;
		while (headNode != null) {
			nextNode = headNode.getNext();
			headNode.setNext(temp);
			temp = headNode;
			headNode = nextNode;
		}
		return temp;
	}

	/**
	 * This method merges two sorted singly linked list.
	 * 
	 * @param headNode1
	 * @param headNode2
	 * @return SLLNode
	 */
	public SLLNode mergeSortedList(SLLNode headNode1, SLLNode headNode2) {

		if (headNode1 == null) {
			return headNode2;
		}
		if (headNode2 == null) {
			return headNode1;
		}
		SLLNode result = null;
		if (headNode1.getData() <= headNode2.getData()) {
			result = headNode1;
			result.setNext(mergeSortedList(headNode1.getNext(), headNode2));
		} else {
			result = headNode2;
			result.setNext(mergeSortedList(headNode2.getNext(), headNode1));
		}
		return result;

	}

	/**
	 * This method reverses the list element in pair recursively.
	 * 
	 * @param headNode
	 */
	public void reversePairByRecursion(SLLNode headNode) {
		SLLNode temp;
		if (headNode == null || headNode.getNext() == null) {
			return;
		}
		temp = headNode.getNext();
		headNode.setNext(temp.getNext());
		temp.setNext(headNode);
		reversePairByRecursion(headNode.getNext());
	}

	/**
	 *  This method reverses the list element in pair iteratively.
	 */
	public SLLNode reversePairByIteration(SLLNode headNode) {
		SLLNode temp, temp2, current = headNode, nextPtr = headNode.getNext();
		while (current != null && current.getNext() != null) {
			temp = current.getNext();
			temp2 = temp.getNext();
			current.setNext(temp2);
			temp.setNext(current);
			if (current.getNext() != null) {
				temp2 = current;
				current = current.getNext();
				temp2.setNext(current);
			}
		}
		return nextPtr;
	}

	/**
	 * This method splits a circular list into two.
	 * 
	 * @param headNode
	 */
	public List<CLLNode> splitCircularListIntoTwo(CLLNode headNode) {
		CLLNode slowPtr = headNode, fastPtr = headNode;
		List<CLLNode> headList = new ArrayList<CLLNode>();
		if (headNode == null) {
			return null;
		}
		/*
		 * If there are odd nodes in the circular list then fastPtr.getNext()
		 * becomes head and for even nodes fastPtr.getNext().getNext() becomes
		 * head
		 */
		while (fastPtr.getNext() != headNode
				&& fastPtr.getNext().getNext() != headNode) {
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
		}

		/* If there are even elements in list then move fastPtr */
		if (fastPtr.getNext().getNext() == headNode) {
			fastPtr = fastPtr.getNext();
		}
		CLLNode head1 = headNode, head2 = null;
		if (headNode.getNext() != headNode) {
			head2 = slowPtr.getNext();
		}
		fastPtr.setNext(head2);
		slowPtr.setNext(head1);

		headList.add(head1);
		headList.add(head2);
		return headList;
	}

	/**
	 * This method exchanges the adjacent elements in a linked list.
	 * 
	 * @param headNode
	 */
	public void exchangeAdjacentNodes(SLLNode headNode) {

		SLLNode currentNode, temp, nextNode;
		currentNode = headNode;
		if (currentNode == null || currentNode.getNext() == null)
			return;
		headNode = currentNode.getNext();
		while (currentNode != null && currentNode.getNext() != null) {
			nextNode = currentNode.getNext();
			currentNode.setNext(nextNode.getNext());
			temp = currentNode.getNext();
			nextNode.setNext(currentNode);
			if (temp != null && temp.getNext() != null)
				currentNode.setNext(currentNode.getNext().getNext());
			currentNode = temp;
		}
	}

	/**
	 * This method converts a sorted DLL to balanced BST.
	 * 
	 * @param headNode
	 * @return
	 */
	public DLLNode DLLtoBalancedBST(DLLNode headNode) {
		DLLNode middle, p, q;
		if (headNode == null || headNode.getNext() == null) {
			return headNode;
		}
		middle = linkedListReadOperation.findMiddleDLLNode(headNode);
		p = headNode;
		if (headNode != middle) {
			while (p.getNext() != middle) {
				p = p.getNext();
			}
			q = middle.getNext();
			p.setNext(null);
			q.setPrevious(null);
			middle.setPrevious(DLLtoBalancedBST(headNode));
			middle.setNext(DLLtoBalancedBST(q));
		} else {
			q = middle.getNext();
			p.setNext(null);
			q.setPrevious(null);
			middle.setPrevious(null);
			middle.setNext(DLLtoBalancedBST(q));
		}
		return middle;
	}

}
