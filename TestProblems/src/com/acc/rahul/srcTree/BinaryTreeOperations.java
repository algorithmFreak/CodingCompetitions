package com.acc.rahul.srcTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeOperations<E> {

	private BinaryTreeNode<E> root = null;
	

	public void insertInBinaryTree(E data) {
		Queue<BinaryTreeNode<E>> Q = new Queue<BinaryTreeNode<E>>();
		BinaryTreeNode<E> temp;
		BinaryTreeNode<E> newNode = new BinaryTreeNode<E>();
		newNode.setData(data);
		if (root == null) {
			this.root = newNode;
			return;
		}
		Q.enqueue(root);
		while (!Q.isEmpty()) {
			temp = Q.dequeue();
			if (temp.getLeft() != null) {
				Q.enqueue(temp.getLeft());
			} else {
				temp.setLeft(newNode);
				return;
			}

			if (temp.getRight() != null) {
				Q.enqueue(temp.getRight());
			} else {
				temp.setRight(newNode);
				return;
			}
		}
	}

	public void deleteBinaryTree(BinaryTreeNode<E> root) {
		
		if(root==null){
			return;
		}
		deleteBinaryTree(root.getLeft());
		deleteBinaryTree(root.getRight());
		root=null;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTreeOperations<Integer> bop = new BinaryTreeOperations<Integer>();
		for (int i = 1; i <= 12; i++)
			bop.insertInBinaryTree(i);
		
	
		
		
		BinaryTreeOperations<Integer> bop2 = new BinaryTreeOperations<Integer>();
		for (int i = 1; i <= 7; i++)
			bop2.insertInBinaryTree(i);
		
		BinaryTreeTraversal traversal = new BinaryTreeTraversal();

	System.out.println();
	traversal.levelOrderTraversal(bop2.root);	
		/*
		System.out.println("-------Level order travseral");
		traversal.levelOrderTraversal(bop.root);
		System.out.println("\n-------PreOrder traversal Recursive");
		traversal.preOrderTraversalRecursive(bop.root);
		System.out.println("\n-------PreOrder traversal Iterative");
		traversal.preOrderTraversalIterative(bop.root);
		System.out.println();
		traversal.preOrderTraversalIterativeEasy(bop.root);
		System.out.println("\n-------InOrder traversal Recursive");
		traversal.inOrderTraversalRecursive(bop.root);
		System.out.println("\n-------InOrder traversal Iterative");
		traversal.inOrderTraversalIterative(bop.root);
		System.out.println("\n-------PostOrder traversal Recursive");
		traversal.postOrderTraversalRecursive(bop.root);
		System.out.println("\n-------PostOrder traversal Iterative");
		traversal.postOrderTraversalIterative(bop.root);
		System.out.println("\nMaximum element in tree is: "
				+ traversal.findMaxElementInTreeRecursive(bop.root));
		System.out.println("\nMinimum element in tree is: "
				+ traversal.findMinElementInTreeRecursive(bop.root));
		System.out
				.println("\nMaximum element in tree is: "
						+ traversal
								.findMaxElementInTreeUsingLevelOrderTraversal(bop.root));
		System.out
				.println("\nMinimum element in tree is: "
						+ traversal
								.findMinElementInTreeUsingLevelOrderTraversal(bop.root));
		int element = 10;
		System.out.println("Question: Is "+element +" present in binary tree? Answer: "+ traversal.findElementInBinaryTreeUsingRecursion(bop.root,element));
		System.out.println("Question: Is "+element +" present in binary tree? Answer: "+ traversal.findElementInBinaryTreeUsingLevelOrder(bop.root,element));
		System.out.println("Size of tree is "+traversal.findSizeOfBinaryTreeUsingRecursion(bop.root)); 
		System.out.println("Size of tree is "+traversal.findSizeOfBinaryTreeUsingLevelOrder(bop.root)); 	
		
		traversal.levelOrderTraversalInReverse(bop.root);
		System.out.println("Height of tree is "+traversal.heightOfBinaryTreeUsingRecursion(bop.root));
		System.out.println("Height of tree is "+traversal.heightOfBinaryTreeUsingLevelOrder(bop.root)); 
		System.out.println("The deepest node of the tree is "+traversal.findDeepestNodeInBinaryTree(bop.root).getData());
	
	traversal.deleteNodeFromBinaryTree(bop.root, 3);
	traversal.preOrderTraversalIterative(bop.root); 
	System.out.println("The number of leaf nodes are "+traversal.findNumberOfLeafNodesInBinaryTree(bop.root)); 
	System.out.println("The number of full nodes are "+traversal.findNumberOfFullNodesInBinaryTree(bop.root)); 
	System.out.println("The number of full nodes are "+traversal.findNumberOfHalfNodesInBinaryTree(bop.root)); 
	 
	
	System.out.println("Are these two trees structurally identical: "+traversal.areStructurallyIdentical(bop.root,bop2.root)); 
	System.out.println("Diameter is: "+ traversal.diameterOfBinaryTree(bop.root)); 
	System.out.println("Level with max sum is: "+traversal.findLevelWithMaxSum(bop.root)); 
	
	traversal.printPathToLeaves(bop.root);
	
	System.out.println(traversal.hasPathSum(bop.root, 8));

	System.out.println(traversal.sumOfAllNodesRecursively(bop.root));
	System.out.println(traversal.sumOfAllNodesIteratively(bop.root));
	traversal.mirrorOfBinaryTree(bop.root);
	traversal.inOrderTraversalIterative(bop.root);
	System.out.println("Are two trees mirror of each other:"+traversal.areTwoBinaryTreesMirrorOfEachOther(bop.root, bop2.root));
	
	*/
	
	/*List<Integer> inOrder = new ArrayList<Integer>();
	inOrder.add(4);
	inOrder.add(2);
	inOrder.add(5);
	inOrder.add(1);
	inOrder.add(6);
	inOrder.add(3);
	inOrder.add(7);
	List<Integer> preOrder = new ArrayList<Integer>();
	preOrder.add(1);
	preOrder.add(2);
	preOrder.add(4);
	preOrder.add(5);
	preOrder.add(3);
	preOrder.add(6);
	preOrder.add(7);
	BinaryTreeOperations<Integer> bop4 = new BinaryTreeOperations<Integer>();
	bop4.root =traversal.buildBinaryTreeUsingInOrderAndPreOrderSequence(inOrder,preOrder);
	traversal.levelOrderTraversal(bop4.root);*/

/*	BinaryTreeOperations<Integer> bop3 = new BinaryTreeOperations<Integer>();
	bop3.root =traversal.buildBinaryTreeUsingInOrderAndPreOrderTraversal(new int[]{4,2,5,1,6,3,7}, new int[]{1,2,4,5,3,6,7},0,6);
	traversal.levelOrderTraversal(bop3.root);
*/
/*	BinaryTreeNode<Integer> node =traversal.getElementInBinaryTreeUsingLevelOrder(bop.root, 15);
	System.out.println(); 
	traversal.printAllAncestors(bop.root, node);
	BinaryTreeNode<Integer> node2 =traversal.getElementInBinaryTreeUsingLevelOrder(bop.root, 15);
	BinaryTreeNode<Integer> LCA= traversal.LCAofTwoBinaryTreeNodes(bop.root, node, node2);
	if(LCA !=null){
		System.out.println("\n"+LCA.getData());
	}else
		System.out.println("\n No LCA");
	}*/
	System.out.println("\nZig Zag traversal");
	traversal.zigZagTraversalOfBinaryTree(bop.root);
	traversal.verticalSumInBinaryTree(bop.root, 0);

	BinaryTreeOperations<Character> charTree = new BinaryTreeOperations<Character>();
	charTree.root =traversal.buildTreeFromPreOrder(new char[]{'I','I','L','L','I','L','L'});
	System.out.println(charTree.root.getData()+" "+charTree.root.getLeft().getData()+" "+charTree.root.getRight().getData());
	
	traversal.levelOrderTraversal(charTree.root);


	}	
	
}
