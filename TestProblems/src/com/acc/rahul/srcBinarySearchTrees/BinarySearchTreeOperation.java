package com.acc.rahul.srcBinarySearchTrees;

import com.acc.rahul.srcLinkedList.SLLNode;
import com.acc.rahul.srcTree.Queue;

public class BinarySearchTreeOperation {

	/**
	 * This method inserts node to a BST.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public BinarySearchTreeNode insertNode(BinarySearchTreeNode root, int data) {
		if (root == null) {
			root = new BinarySearchTreeNode();
			root.setData(data);
		} else {
			if (data < root.getData()) {
				root.setLeft(insertNode(root.getLeft(), data));
			} else if (data > root.getData()) {
				root.setRight(insertNode(root.getRight(), data));
			}
		}
		return root;
	}

	/**
	 * In-order traversal of BST.
	 * 
	 * @param root
	 */
	public void inOrderTraversal(BinarySearchTreeNode root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.getLeft());
		System.out.print(root.getData() + " ");
		inOrderTraversal(root.getRight());
	}

	/**
	 * This method finds an element in a BST recursively.
	 * 
	 * @param root
	 * @param data
	 */
	public BinarySearchTreeNode findInBSTRecursive(BinarySearchTreeNode root,
			int data) {
		if (root == null)
			return null;
		if (data < root.getData()) {
			return findInBSTRecursive(root.getLeft(), data);
		} else if (data > root.getData()) {
			return findInBSTRecursive(root.getRight(), data);
		}
		return root;
	}

	/**
	 * This method finds an element in a BST iteratively.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public BinarySearchTreeNode findInBSTIteratively(BinarySearchTreeNode root,
			int data) {
		if (root == null) {
			return null;
		}
		while (root != null) {
			if (data == root.getData()) {
				return root;
			} else if (data < root.getData()) {
				root = root.getLeft();
			} else if (data > root.getData()) {
				root = root.getRight();
			}
		}
		return null;
	}

	/**
	 * This method finds minimum element in a BST recursively.
	 * 
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode findMinInBSTRecursively(
			BinarySearchTreeNode root) {
		if (root == null) {
			return null;
		} else if (root.getLeft() == null)
			return root;
		else
			return findMinInBSTRecursively(root.getLeft());
	}

	/**
	 * This method finds minimum element in a BST iteratively.
	 * 
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode findMinInBSTIteratively(
			BinarySearchTreeNode root) {
		if (root == null) {
			return null;
		}
		while (root.getLeft() != null) {
			root = root.getLeft();
		}
		return root;
	}

	/**
	 * This method finds max element in BST recursively.
	 * 
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode findMaxInBSTRecursively(
			BinarySearchTreeNode root) {
		if (root == null) {
			return root;
		} else if (root.getRight() == null) {
			return root;
		} else {
			return findMaxInBSTRecursively(root.getRight());
		}
	}

	/**
	 * this method finds min element in BST iteratively.
	 * 
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode findMaxInBSTIteratively(
			BinarySearchTreeNode root) {
		if (root == null) {
			return null;
		}
		while (root.getRight() != null) {
			root = root.getRight();
		}
		return root;
	}

	/**
	 * This method deletes a node from BST.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */
	public BinarySearchTreeNode deleteNode(BinarySearchTreeNode root, int data) {
		BinarySearchTreeNode temp;
		if (root == null) {
			System.out.println("No element in the tree");
		} else if (data < root.getData()) {
			root.setLeft(deleteNode(root.getLeft(), data));
		} else if (data > root.getData()) {
			root.setRight(deleteNode(root.getRight(), data));
		} else {
			/* the node to be deleted. */
			if (root.getLeft() != null && root.getRight() != null) {
				/* Replace with largest in the left subtree */
				temp = findMaxInBSTIteratively(root.getLeft());
				root.setData(temp.getData());
				root.setLeft(deleteNode(root.getLeft(), temp.getData()));
			} else {
				/* one child or no child */
				if (root.getLeft() == null) {
					root = root.getRight();
				} else if (root.getRight() == null) {
					root = root.getLeft();
				}
			}
		}
		return root;
	}

	/**
	 * This method finds the LCA of two node values of a BST. This also
	 * represents the shortest path between two nodes in a BST. The first node
	 * we encounter with value between val1 and val2 is their LCA
	 * 
	 * @param root
	 * @param val1
	 * @param val2
	 * @return
	 */

	public BinarySearchTreeNode findLCAIteratively(BinarySearchTreeNode root,
			int val1, int val2) {
		if (this.findInBSTIteratively(root, val1) == null
				|| this.findInBSTIteratively(root, val2) == null) {
			return null;
		}

		int min = Math.min(val1, val2);
		int max = Math.max(val1, val2);
		while (root != null) {
			// If both min and max are smaller than root, then LCA lies in left
			if (root.getData() > min && root.getData() > max)
				root = root.getLeft();

			// If both min and max are greater than root, then LCA lies in right
			else if (root.getData() < min && root.getData() < max)
				root = root.getRight();
			else
				break;
		}
		return root;
	}

	/**
	 * This method finds the LCA of two nodes recursively.
	 * 
	 * @param root
	 * @param min
	 * @param max
	 * @return
	 */
	public BinarySearchTreeNode findLCARecursively(BinarySearchTreeNode root,
			int min, int max) {
		if (root == null) {
			return null;
		}
		// If both min and max are smaller than root, then LCA lies in left
		if (root.getData() > min && root.getData() > max)
			return findLCARecursively(root.getLeft(), min, max);

		// If both min and max are greater than root, then LCA lies in right
		else if (root.getData() < min && root.getData() < max)
			return findLCARecursively(root.getRight(), min, max);

		return root;
	}

	/**
	 * This method test whether a tree is BST or not. For each node, check if
	 * max value in left subtree is smaller than the current node data and min
	 * value in right subtree greater than the node data
	 * 
	 * @param root
	 * @return
	 */
	public boolean isBST(BinarySearchTreeNode root) {
		if (root == null) {
			return true;
		}
		if (root.getLeft() != null
				&& this.findMaxInBSTRecursively(root.getLeft()).getData() > root
						.getData()) {
			return false;
		}
		if (root.getRight() != null
				&& this.findMinInBSTRecursively(root.getRight()).getData() < root
						.getData()) {
			return false;
		}
		if (!isBST(root.getLeft()) || !isBST(root.getRight())) {
			return false;
		}
		return true;
	}

	/**
	 * Here, we look at each node only once. we keep traversing down the tree
	 * keeping track of the narrowing min and max allowed values as it goes,
	 * looking at each node once.
	 * 
	 * @param root
	 * @return
	 */
	public boolean isBSTEfficient(BinarySearchTreeNode root) {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * This is a utility method used by above method.
	 * 
	 * @param root
	 * @param min
	 * @param max
	 * @return
	 */
	private boolean isBSTUtil(BinarySearchTreeNode root, int min, int max) {
		if (root == null) {
			return true;
		}
		return (root.getData() > min && root.getData() < max
				&& isBSTUtil(root.getLeft(), min, root.getData()) && isBSTUtil(
					root.getRight(), root.getData(), max));
	}

	/**
	 * used by below method
	 */
	private int prev = Integer.MIN_VALUE;

	/**
	 * The idea behind this solution is that, inOrder traversal of BST produces
	 * sorted lists. While traversing the BST inOrder, at each node check the
	 * condition that its key value should be greater than the key value of its
	 * previous visited node.
	 * 
	 * @param root
	 * @return
	 */
	public boolean isBSTUsingInOrderTraversal(BinarySearchTreeNode root) {
		if (root == null)
			return true;
		if (!isBSTUsingInOrderTraversal(root.getLeft()))
			return false;
		if (root.getData() < prev)
			return false;
		prev = root.getData();
		System.out.print(prev + " ");
		return isBSTUsingInOrderTraversal(root.getRight());
	}

	/**
	 * This method converts a binary search tree to doubly linked list in place.
	 * Modify the same BST.
	 * 
	 * @param root
	 */
	private BinarySearchTreeNode BSTtoDLL(BinarySearchTreeNode root) {
		if (root == null) {
			return null;
		}
		if (root.getLeft() != null) {
			BinarySearchTreeNode left = BSTtoDLL(root.getLeft());
			while (left.getRight() != null) {
				left = left.getRight();
			}
			left.setRight(root);
			root.setLeft(left);
		}
		if (root.getRight() != null) {
			BinarySearchTreeNode right = BSTtoDLL(root.getRight());
			while (right.getLeft() != null) {
				right = right.getLeft();
			}
			right.setLeft(root);
			root.setRight(right);
		}
		return root;
	}

	/**
	 * This method is used to traverse a DLL converted from a BST.
	 * 
	 * @param start
	 */
	public BinarySearchTreeNode convertBSTtoDLL(BinarySearchTreeNode root) {
		root = BSTtoDLL(root);
		BinarySearchTreeNode start = root;
		while (start.getLeft() != null) {
			start = start.getLeft();
		}
		return start;
	}

	/**
	 * This method is used to traverse a DLL.
	 * 
	 * @param start
	 */
	public void traverseDLL(BinarySearchTreeNode start) {
		if (start == null) {
			System.out.println("No element in list");
			return;
		}
		while (start != null) {
			System.out.print(start.getData() + "<-->");
			start = start.getRight();
		}
	}

	/**
	 * This method is used to convert a BST to Circular DLL.
	 * 
	 * @param root
	 * @return
	 */
	public BinarySearchTreeNode convertBSTtoCircularDLL(
			BinarySearchTreeNode root) {
		root = BSTtoDLL(root);
		BinarySearchTreeNode start = root, end = root;
		while (start.getLeft() != null) {
			start = start.getLeft();
		}
		while (end.getRight() != null) {
			end = end.getRight();
		}
		start.setLeft(end);
		end.setRight(start);
		return start;
	}

	/**
	 * This method is used to traverse a circular DLL.
	 * 
	 * @param start
	 */
	public void traverseCircularDLL(BinarySearchTreeNode start) {
		if (start == null) {
			System.out.println("No element in list");
			return;
		}
		BinarySearchTreeNode temp = start;
		System.out.print(start.getData() + "<-->");
		start = start.getRight();
		while (start != temp) {
			System.out.print(start.getData() + "<-->");
			start = start.getRight();
		}
	}

	/**
	 * This method is used to build BST from sorted array.
	 * 
	 * @param A
	 * @return
	 */

	public BinarySearchTreeNode buildBSTFromArray(int[] A) {
		return buildBST(A, 0, A.length - 1);
	}

	/**
	 * This method is used to build a BST from a sorted array.
	 * 
	 * @param A
	 * @param left
	 * @param right
	 * @return
	 */
	private BinarySearchTreeNode buildBST(int[] A, int start, int end) {
		BinarySearchTreeNode newNode;
		if (start > end) {
			return null;
		}
		newNode = new BinarySearchTreeNode();
		if (start == end) {
			newNode.setData(A[start]);
		} else {
			int mid = start + (end - start) / 2;
			newNode.setData(A[mid]);
			newNode.setLeft(buildBST(A, start, mid - 1));
			newNode.setRight(buildBST(A, mid + 1, end));
		}
		return newNode;
	}

	/**
	 * This method converts a SLL to BST.
	 * 
	 * @param head
	 * @param n
	 * @return
	 */
	public BinarySearchTreeNode sortedListToBST(SLLNode head, int n) {
		return sortedListToBST(head, 0, n - 1);
	}

	// wrong
	private BinarySearchTreeNode sortedListToBST(SLLNode head, int start,
			int end) {
		if (start > end) {
			return null;
		}
		int mid = start + (end - start) / 2;
		BinarySearchTreeNode leftChild = sortedListToBST(head, start, mid - 1);
		BinarySearchTreeNode parent = new BinarySearchTreeNode();
		parent.setData(head.getData());
		parent.setLeft(leftChild);
		head = head.getNext();
		parent.setRight(sortedListToBST(head, mid + 1, end));
		return parent;
	}

	/**
	 * This method finds kth smallest element in a BST.
	 * 
	 * @param root
	 * @param k
	 * @return
	 */
	int count = 0;

	public BinarySearchTreeNode findKthSmallestInBST(BinarySearchTreeNode root,
			int k) {
		if (root == null) {
			return null;
		}
		BinarySearchTreeNode left = findKthSmallestInBST(root.getLeft(), k);
		if (left != null) {
			return left;
		}
		if (++count == k) {
			return root;
		}
		return findKthSmallestInBST(root.getRight(), k);
	}

	/**
	 * This method return the floor of a key present in a BST.
	 * 
	 * @param root
	 * @param data
	 * @return
	 */

	private BinarySearchTreeNode previous = null;

	
	public BinarySearchTreeNode findFloorInBST(BinarySearchTreeNode root,
			int data) {
		previous=null;
		BinarySearchTreeNode min = findMinInBSTIteratively(root); 
		BinarySearchTreeNode max = findMaxInBSTIteratively(root);
		if(min!=null && data<min.getData()){
			return null;
		}
		if(max!=null && data>max.getData()){
			return max;
		}
		return floorInBST(root, data);
	}

	/**
	 * This method works exclusively only for the key between max and min of BST.
	 * @param root
	 * @param data
	 * @return
	 */
	private BinarySearchTreeNode floorInBST(BinarySearchTreeNode root, int data) {
		if(root==null){
			return null;
		}
		BinarySearchTreeNode floorNode = null;
		if((floorNode =floorInBST(root.getLeft(), data))!=null){
			return floorNode;
		}
		if(root.getData()==data){
			return root;
		}if(root.getData()>data){
			return previous;
		}
		previous=root;
		return floorInBST(root.getRight(), data);
	}

	/**
	 * This method finds the ceiling node of a particular node data.
	 *This method works exclusively only for the key between max and min of BST.
	 * @param root
	 * @param data
	 * @return
	 */
	public BinarySearchTreeNode findCeilInBST(BinarySearchTreeNode root, int data) {
		previous =null;
		BinarySearchTreeNode min = findMinInBSTIteratively(root); 
		BinarySearchTreeNode max = findMaxInBSTIteratively(root);
		if(min!=null && data<min.getData()){
			return min;
		}
		if(max!=null && data>max.getData()){
			return null;
		}
		return ceilInBST(root, data);
	}
	
	/**
	 * This method works exclusively only for the key between max and min of BST.
	 * @param root
	 * @param data
	 * @return
	 */
	private BinarySearchTreeNode ceilInBST(BinarySearchTreeNode root, int data){
		if(root==null){
			return null;
		}
		BinarySearchTreeNode ceilNode = null;
		if((ceilNode =ceilInBST(root.getRight(), data))!=null){
			return ceilNode;
		}
		if(root.getData()==data){
			return root;
		}if(root.getData()<data){
			return previous;
		}
		previous=root;
		return ceilInBST(root.getLeft(), data);
	}
	
	
	/**
	 * This method prints all the elements of a BST in the range K1 and K2 recursively.
	 * Assume K1 < K2.
	 * @param root
	 * @param K1
	 * @param K2
	 */
	public void rangePrinterRecursively(BinarySearchTreeNode root, int K1, int K2){
		if(root==null){
			return;
		}
		if(root.getData()>=K1){
			rangePrinterRecursively(root.getLeft(),K1,K2);
		}
		if(root.getData()>=K1 && root.getData()<=K2){
			System.out.print(root.getData()+" ");
		}
		if(root.getData()<=K2){
			rangePrinterRecursively(root.getRight(), K1, K2);
		}
	}
	
	/**
	 * This method prints all the elements of a BST in the range K1 and K2 iteratively.
	 * @param root
	 * @param K1
	 * @param K2
	 */
	public void rangePrinterUsingLevelOrder(BinarySearchTreeNode root, int K1, int K2){
		BinarySearchTreeNode temp;
		Queue<BinarySearchTreeNode> Q = new Queue<BinarySearchTreeNode>();
		if(root==null){
			return;
		}
		Q.enqueue(root);
		while(!Q.isEmpty()){
			temp =  Q.dequeue();
			if(temp.getData()>=K1 && temp.getData()<=K2){
				System.out.print(temp.getData()+" ");
			}
			if(temp.getLeft()!=null /*&& temp.getData()>=K1*/){
				Q.enqueue(temp.getLeft());
			}
			if(temp.getRight()!=null /*&& temp.getData()<=K2*/){
				Q.enqueue(temp.getRight());
			}
		}
	}

}
