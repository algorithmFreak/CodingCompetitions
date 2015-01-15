package com.acc.rahul.srcBinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

import com.acc.rahul.srcLinkedList.LinkedListReadOperation;
import com.acc.rahul.srcLinkedList.LinkedListWriteOperation;
import com.acc.rahul.srcLinkedList.SLLNode;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		BinarySearchTreeOperation op = new BinarySearchTreeOperation();
		BinarySearchTreeNode root = null;
		BinarySearchTreeNode temp = null;
		root = op.insertNode(root, 2);
		root = op.insertNode(root, 8);
		root = op.insertNode(root, 1);
		root = op.insertNode(root, 4);
		root = op.insertNode(root, 3);
		root = op.insertNode(root, 5);
		root = op.insertNode(root, 0);

		op.inOrderTraversal(root);
		System.out.println("\n" + op.findInBSTRecursive(root, 5).getData());
		System.out.println(op.findInBSTIteratively(root, 3).getData());
		System.out.println(op.findMinInBSTRecursively(root).getData());
		System.out.println(op.findMinInBSTIteratively(root).getData());
		System.out.println(op.findMaxInBSTRecursively(root).getData());
		System.out.println(op.findMaxInBSTIteratively(root).getData());

		// root=op.deleteNode(root, 4);
		op.inOrderTraversal(root);
		System.out.println();
		// root= op.insertNode(root, 4);
		op.inOrderTraversal(root);
		temp = op.findLCAIteratively(root, 4, 5);
		if (temp != null)
			System.out.println("\n" + temp.getData());
		else
			System.out.println("\n" + temp);

		temp = op.findLCARecursively(root, 0, 5);
		if (temp != null)
			System.out.println("\n" + temp.getData());
		else
			System.out.println("\n" + temp);

		System.out.println(op.isBSTEfficient(root));
		System.out.println(op.isBSTUsingInOrderTraversal(root));
		
		// BinarySearchTreeNode head = op.convertBSTtoDLL(root);
		// op.traverseDLL(head);
		BinarySearchTreeNode head = op.convertBSTtoCircularDLL(root);
		op.traverseCircularDLL(head);

		root = op.buildBSTFromArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println();
		op.inOrderTraversal(root);

		List<Integer> list = new ArrayList<Integer>();
		System.out.println(list.size());

		list.add(0, 100);
		list.set(0, 10);
		System.out.println(list.size());
		
		System.out.println(op.findKthSmallestInBST(root, 10));
		
		BinarySearchTreeNode r = null;
		r = op.insertNode(r,3);
		r = op.insertNode(r, 10);
		r = op.insertNode(r,1);
		r = op.insertNode(r, 20);
		r = op.insertNode(r,17);
		r = op.insertNode(r, 19);
		op.inOrderTraversal(r);
		System.out.println();
		BinarySearchTreeNode floor = op.findFloorInBST(r, 24);
		if(floor!=null){
			System.out.println("floor= "+floor.getData());
		}else 
			System.out.println("floor= "+floor);
		
		BinarySearchTreeNode ceil = op.findCeilInBST(r, 24);
		if(ceil!=null){
			System.out.println("ceil= "+ ceil.getData());
		}else 
			System.out.println("ceil= "+ ceil);
		
		op.rangePrinterRecursively(r, -1, 25);
		System.out.println("----------");
		op.rangePrinterUsingLevelOrder(r, -1, 26);

		/*	LinkedListWriteOperation write = new LinkedListWriteOperation();
		LinkedListReadOperation read = new LinkedListReadOperation();

		SLLNode sllNode = new SLLNode(1);
		sllNode = write.insertInSinglyLinkedList(sllNode, new SLLNode(4), 2);
		sllNode = write.insertInSinglyLinkedList(sllNode, new SLLNode(5), 3);
		sllNode = write.insertInSinglyLinkedList(sllNode, new SLLNode(7), 4);
		sllNode = write.insertInSinglyLinkedList(sllNode, new SLLNode(9), 5);
		sllNode = write.insertInSinglyLinkedList(sllNode, new SLLNode(10), 6);
		sllNode = write.insertInSinglyLinkedList(sllNode, new SLLNode(15), 7);
		sllNode = write.insertInSinglyLinkedList(sllNode, new SLLNode(24), 8);
		sllNode = write.insertInSinglyLinkedList(sllNode, new SLLNode(34), 9);
		read.printSLListLength(sllNode);
		
		root = op.sortedListToBST(sllNode, 9);
		op.inOrderTraversal(root);
	*/	
	}

}
