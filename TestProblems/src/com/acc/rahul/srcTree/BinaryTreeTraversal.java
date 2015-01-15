package com.acc.rahul.srcTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.acc.rahul.srcGenericTree.TreeNode;

public class BinaryTreeTraversal {

	/**
	 * This method performs the level order traversal
	 * 
	 * @param root
	 */
	public <E> void levelOrderTraversal(BinaryTreeNode<E> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<E>> Q = new Queue<BinaryTreeNode<E>>();
		Q.enqueue(root);
		BinaryTreeNode<E> temp;
		while (!Q.isEmpty()) {
			temp = Q.dequeue();
			if (temp.getLeft() != null) {
				Q.enqueue(temp.getLeft());
			}
			if (temp.getRight() != null) {
				Q.enqueue(temp.getRight());
			}
			System.out.print(temp.getData() + "  ");
		}
	}

	/**
	 * This method performs pre order traversal recursively.
	 * 
	 * @param root
	 */
	public <E> void preOrderTraversalRecursive(BinaryTreeNode<E> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.getData() + "  ");
		preOrderTraversalRecursive(root.getLeft());
		preOrderTraversalRecursive(root.getRight());
	}

	/**
	 * This method performs in order traversal recursively.
	 * 
	 * @param root
	 */
	public <E> void inOrderTraversalRecursive(BinaryTreeNode<E> root) {
		if (root == null) {
			return;
		}
		inOrderTraversalRecursive(root.getLeft());
		System.out.print(root.getData() + "  ");
		inOrderTraversalRecursive(root.getRight());
	}

	/**
	 * This method performs post order traversal recursively.
	 * 
	 * @param root
	 */
	public <E> void postOrderTraversalRecursive(BinaryTreeNode<E> root) {
		if (root == null) {
			return;
		}
		postOrderTraversalRecursive(root.getLeft());
		postOrderTraversalRecursive(root.getRight());
		System.out.print(root.getData() + "  ");

	}

	/**
	 * This method performs pre order traversal iteratively.
	 * 
	 * @param root
	 */
	public <E> void preOrderTraversalIterative(BinaryTreeNode<E> root) {
		if (root == null) {
			return;
		}
		Stack<BinaryTreeNode<E>> S = new Stack<BinaryTreeNode<E>>();
		while (true) {
			while (root != null) {
				System.out.print(root.getData() + "  ");
				S.push(root);
				root = root.getLeft();
			}
			if (S.isEmpty())
				break;
			root = S.pop();
			root = root.getRight();
		}
	}

	/**
	 * This method performs pre order traversal iteratively.(An easy way)
	 * 
	 * @param root
	 */
	public <E> void preOrderTraversalIterativeEasy(BinaryTreeNode<E> root) {
		if (root == null) {
			return;
		}
		Stack<BinaryTreeNode<E>> S = new Stack<BinaryTreeNode<E>>();
		S.push(root);
		while (!S.isEmpty()) {
			root = S.pop();
			if (root != null) {
				System.out.print(root.getData() + "  ");
				if (root.getRight() != null)
					S.push(root.getRight());
				if (root.getLeft() != null)
					S.push(root.getLeft());
			}
		}
	}

	/**
	 * This method performs in order traversal iteratively.
	 * 
	 * @param root
	 */
	public <E> void inOrderTraversalIterative(BinaryTreeNode<E> root) {
		if (root == null) {
			return;
		}
		Stack<BinaryTreeNode<E>> S = new Stack<BinaryTreeNode<E>>();
		while (true) {
			while (root != null) {
				S.push(root);
				root = root.getLeft();
			}
			if (S.isEmpty())
				break;
			root = S.pop();
			System.out.print(root.getData() + "  ");
			root = root.getRight();
		}
	}

	/*
	 * public <E> void postOrderTraversalIterative(BinaryTreeNode<E> root) { if
	 * (root == null) { return; } Stack<BinaryTreeNode<E>> S = new
	 * Stack<BinaryTreeNode<E>>(); while (true) { while (root != null) {
	 * S.push(root); root = root.getLeft(); } if (S.isEmpty()) return; else if
	 * (S.peek().getRight() == null) { root = S.pop();
	 * System.out.print(root.getData() + "  "); if (root == S.peek().getRight())
	 * { System.out.print(S.peek().getData()+ "  "); S.pop(); } } if
	 * (!S.isEmpty()) { root = S.peek().getRight(); } else { root = null; } } }
	 */

	/**
	 * This method performs post order traversal iteratively.
	 * 
	 * @param root
	 */
	public <E> void postOrderTraversalIterative(BinaryTreeNode<E> root) {
		if (root == null) {
			return;
		}
		Stack<BinaryTreeNode<E>> SReverse = new Stack<BinaryTreeNode<E>>();
		Stack<BinaryTreeNode<E>> S = new Stack<BinaryTreeNode<E>>();
		SReverse.push(root);
		while (!SReverse.isEmpty()) {
			root = SReverse.pop();
			if (root != null) {
				S.push(root);
				if (root.getLeft() != null)
					SReverse.push(root.getLeft());
				if (root.getRight() != null)
					SReverse.push(root.getRight());
			}
		}
		while (!S.isEmpty()) {
			System.out.print(S.pop().getData() + "  ");
		}
	}

	/**
	 * This method finds maximum element recursively.
	 * 
	 * @param root
	 * @return
	 */
	public int findMaxElementInTreeRecursive(BinaryTreeNode<Integer> root) {
		int data, left, right, max = Integer.MIN_VALUE;
		if (root != null) {
			data = root.getData();
			left = findMaxElementInTreeRecursive(root.getLeft());
			right = findMaxElementInTreeRecursive(root.getRight());
			max = Math.max(data, Math.max(right, left));
		}
		return max;
	}

	/**
	 * This method finds the maximum element iteratively.
	 * 
	 * @param root
	 * @return
	 */
	public int findMaxElementInTreeUsingLevelOrderTraversal(
			BinaryTreeNode<Integer> root) {
		int max = Integer.MIN_VALUE;
		BinaryTreeNode<Integer> temp;
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		while (!Q.isEmpty()) {
			temp = Q.dequeue();
			max = Math.max(temp.getData(), max);
			if (temp.getLeft() != null)
				Q.enqueue(temp.getLeft());
			if (temp.getRight() != null)
				Q.enqueue(temp.getRight());
		}
		return max;
	}

	/**
	 * This method finds the minimum element recursively.
	 * 
	 * @param root
	 * @return
	 */
	public int findMinElementInTreeUsingLevelOrderTraversal(
			BinaryTreeNode<Integer> root) {
		int min = Integer.MAX_VALUE;
		BinaryTreeNode<Integer> temp;
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		while (!Q.isEmpty()) {
			temp = Q.dequeue();
			min = Math.min(temp.getData(), min);
			if (temp.getLeft() != null)
				Q.enqueue(temp.getLeft());
			if (temp.getRight() != null)
				Q.enqueue(temp.getRight());
		}
		return min;
	}

	/**
	 * This method finds the minimum element iteratively.
	 * 
	 * @param root
	 * @return
	 */
	public int findMinElementInTreeRecursive(BinaryTreeNode<Integer> root) {
		int data, left, right, min = Integer.MAX_VALUE;
		if (root != null) {
			data = root.getData();
			left = findMinElementInTreeRecursive(root.getLeft());
			right = findMinElementInTreeRecursive(root.getRight());
			min = Math.min(data, Math.min(right, left));
		}
		return min;
	}

	/**
	 * This method finds an element in tree recursively.
	 * 
	 * @param root
	 * @param element
	 * @return
	 */
	public boolean findElementInBinaryTreeUsingRecursion(
			BinaryTreeNode<Integer> root, int element) {
		if (root == null) {
			return false;
		} else if (root.getData() == element) {
			return true;
		} else if (findElementInBinaryTreeUsingRecursion(root.getLeft(),
				element)) {
			return true;
		} else {
			return findElementInBinaryTreeUsingRecursion(root.getRight(),
					element);
		}
	}

	/**
	 * This method finds an element in tree iteratively.
	 * 
	 * @param root
	 * @param element
	 * @return
	 */
	public boolean findElementInBinaryTreeUsingLevelOrder(
			BinaryTreeNode<Integer> root, int element) {
		if (root == null) {
			return false;
		} else if (root.getData() == element) {
			return true;
		} else {
			Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
			Q.enqueue(root);
			BinaryTreeNode<Integer> temp;
			while (!Q.isEmpty()) {
				temp = Q.dequeue();
				if (temp.getData() == element) {
					return true;
				} else {
					if (temp.getLeft() != null) {
						Q.enqueue(temp.getLeft());
					}
					if (temp.getRight() != null) {
						Q.enqueue(temp.getRight());
					}
				}
			}
		}
		return false;
	}

	/**
	 * This method finds the size of tree recursively.
	 * size means number of nodes.
	 * 
	 * @param root
	 * @return
	 */
	public int findSizeOfBinaryTreeUsingRecursion(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		} else {
			return (findSizeOfBinaryTreeUsingRecursion(root.getLeft()) + 1 + findSizeOfBinaryTreeUsingRecursion(root
					.getRight()));
		}
	}

	/**
	 * This method finds an element in tree iteratively.
	 * 
	 * @param root
	 * @param element
	 * @return
	 */
	public BinaryTreeNode<Integer> getElementInBinaryTreeUsingLevelOrder(
			BinaryTreeNode<Integer> root, int element) {
		if (root == null) {
			return null;
		} else if (root.getData() == element) {
			return root;
		} else {
			Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
			Q.enqueue(root);
			BinaryTreeNode<Integer> temp;
			while (!Q.isEmpty()) {
				temp = Q.dequeue();
				if (temp.getData() == element) {
					return temp;
				} else {
					if (temp.getLeft() != null) {
						Q.enqueue(temp.getLeft());
					}
					if (temp.getRight() != null) {
						Q.enqueue(temp.getRight());
					}
				}
			}
		}
		return null;
	}

	/**
	 * This method finds the size of tree iteratively.
	 * size means number of nodes in the tree.
	 * @param root
	 * @return
	 */
	public int findSizeOfBinaryTreeUsingLevelOrder(BinaryTreeNode<Integer> root) {
		int count = 0;
		if (root == null) {
			return 0;
		} else {
			Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
			Q.enqueue(root);
			BinaryTreeNode<Integer> temp;
			while (!Q.isEmpty()) {
				temp = Q.dequeue();
				count++;
				if (temp.getLeft() != null) {
					Q.enqueue(temp.getLeft());
				}
				if (temp.getRight() != null) {
					Q.enqueue(temp.getRight());
				}
			}
			return count;
		}
	}

	/**
	 * This method prints the reverse level order.
	 * 
	 * @param root
	 */
	public void levelOrderTraversalInReverse(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Stack<BinaryTreeNode<Integer>> S = new Stack<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		BinaryTreeNode<Integer> temp;
		while (!Q.isEmpty()) {
			temp = Q.dequeue();
			if (temp.getRight() != null) {
				Q.enqueue(temp.getRight());
			}
			if (temp.getLeft() != null) {
				Q.enqueue(temp.getLeft());
			}
			S.push(temp);
		}
		while (!S.isEmpty()) {
			System.out.print(S.pop().getData() + "  ");
		}
	}

	/**
	 * This method finds the height of a binary tree recursively.
	 * 
	 * @param root
	 * @return
	 */
	public int heightOfBinaryTreeUsingRecursion(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		} else {
			int leftHeight, rightHeight;
			leftHeight = heightOfBinaryTreeUsingRecursion(root.getLeft());
			rightHeight = heightOfBinaryTreeUsingRecursion(root.getRight());
			return (Math.max(leftHeight, rightHeight) + 1);

		}
	}

	/**
	 * This method finds the height of a binary tree iteratively.
	 * 
	 * @param root
	 * @return
	 */
	public int heightOfBinaryTreeUsingLevelOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		Q.enqueue(null);
		int level = -1;
		BinaryTreeNode<Integer> temp;
		while (!Q.isEmpty()) {
			temp = Q.dequeue();
			if (temp == null) {
				level++;
				if (!Q.isEmpty()) {
					Q.enqueue(null);
				}
			} else {
				if (temp.getLeft() != null) {
					Q.enqueue(temp.getLeft());
				}
				if (temp.getRight() != null) {
					Q.enqueue(temp.getRight());
				}
			}
		}
		return level;
	}

	/**
	 * This method finds the deepest node in a binary tree.
	 * 
	 * @param root
	 * @return
	 */
	public BinaryTreeNode<Integer> findDeepestNodeInBinaryTree(
			BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		BinaryTreeNode<Integer> temp = null;
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		while (!Q.isEmpty()) {
			temp = Q.dequeue();
			if (temp.getLeft() != null) {
				Q.enqueue(temp.getLeft());
			}
			if (temp.getRight() != null) {
				Q.enqueue(temp.getRight());
			}
		}
		return temp;
	}

	/**
	 * This method deletes the node data from the tree.
	 * 
	 * @param root
	 */
	public void deleteNodeFromBinaryTree(BinaryTreeNode<Integer> root,
			int element) {
		if (root == null) {
			return;
		}
		BinaryTreeNode<Integer> deepestNode = this
				.findDeepestNodeInBinaryTree(root);
		System.out.println("Deepest node is " + deepestNode.getData());
		if (deepestNode.getData() == element) {
			deepestNode.setData(null);
			return;
		}
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		BinaryTreeNode<Integer> temp;
		while (!Q.isEmpty()) {
			temp = Q.dequeue();
			if (temp.getData() == element) {
				temp.setData(deepestNode.getData());
				deepestNode.setData(null);
				deepestNode = null;
				return;
			}
			if (temp.getLeft() != null) {
				Q.enqueue(temp.getLeft());
			}
			if (temp.getRight() != null) {
				Q.enqueue(temp.getRight());
			}
		}
	}

	/**
	 * This method returns the numbers of leaf nodes in a binary tree.
	 * 
	 * @param root
	 * @return
	 */
	public int findNumberOfLeafNodesInBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leafNodeCount = 0;
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		while (!Q.isEmpty()) {
			root = Q.dequeue();
			if (root.getLeft() == null && root.getRight() == null) {
				leafNodeCount++;
			}
			if (root.getLeft() != null) {
				Q.enqueue(root.getLeft());
			}
			if (root.getRight() != null) {
				Q.enqueue(root.getRight());
			}
		}
		return leafNodeCount;
	}

	/**
	 * This method returns the numbers of full nodes in a binary tree.
	 * 
	 * @param root
	 * @return
	 */
	public int findNumberOfFullNodesInBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int fullNodeCount = 0;
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		while (!Q.isEmpty()) {
			root = Q.dequeue();
			if (root.getLeft() != null && root.getRight() != null) {
				fullNodeCount++;
			}
			if (root.getLeft() != null) {
				Q.enqueue(root.getLeft());
			}
			if (root.getRight() != null) {
				Q.enqueue(root.getRight());
			}
		}
		return fullNodeCount;
	}

	/**
	 * This method returns the numbers of half nodes in a binary tree.
	 * 
	 * @param root
	 * @return
	 */
	public int findNumberOfHalfNodesInBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int halfNodeCount = 0;
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		while (!Q.isEmpty()) {
			root = Q.dequeue();
			if ((root.getLeft() != null && root.getRight() == null)
					|| (root.getLeft() == null && root.getRight() != null)) {
				halfNodeCount++;
			}
			if (root.getLeft() != null) {
				Q.enqueue(root.getLeft());
			}
			if (root.getRight() != null) {
				Q.enqueue(root.getRight());
			}
		}
		return halfNodeCount;
	}

	/**
	 * This method checks whether two two trees are structurally same or not.
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public boolean areStructurallyIdentical(BinaryTreeNode<Integer> root1,
			BinaryTreeNode<Integer> root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		return ((root1.getData() == root2.getData())
				&& areStructurallyIdentical(root1.getLeft(), root2.getLeft()) && areStructurallyIdentical(
					root1.getRight(), root2.getRight()));
	}

	/**
	 * This method returns the diameter of a tree. The diameter of a tree
	 * (sometimes called the width) is the number of nodes on the longest path
	 * between two leaves in the tree.
	 * 
	 * @param root
	 * @return
	 */
	public int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		int leftDiameter, rightDiameter, leftHeight, rightHeight;
		if (root == null) {
			return 0;
		}
		leftDiameter = diameterOfBinaryTree(root.getLeft());
		rightDiameter = diameterOfBinaryTree(root.getRight());
		leftHeight = heightOfBinaryTreeUsingLevelOrder(root.getLeft());
		rightHeight = heightOfBinaryTreeUsingLevelOrder(root.getRight());

		return Math.max(Math.max(leftDiameter, rightDiameter), (leftHeight + 1
				+ rightHeight + 1 + 1));
	}

	/**
	 * This method finds the level with maximum sum.
	 * 
	 * @param root
	 * @return
	 */
	public int findLevelWithMaxSum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int level = 0, maxLevel = 0;
		int currentSum = 0, maxSum = 0;
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		Q.enqueue(null);
		while (!Q.isEmpty()) {
			root = Q.dequeue();
			if (root == null) {
				if (maxSum < currentSum) {
					maxSum = currentSum;
					maxLevel = level;
				}
				currentSum = 0;
				if (!Q.isEmpty()) {
					Q.enqueue(null);
				}
				level++;
			} else {
				currentSum += root.getData();
				if (root.getLeft() != null) {
					Q.enqueue(root.getLeft());
				}
				if (root.getRight() != null) {
					Q.enqueue(root.getRight());
				}
			}
		}
		return maxLevel;
	}

	/**
	 * This method prints the path from root to every leaf node.
	 * 
	 * @param root
	 */
	public void printPathToLeaves(BinaryTreeNode<Integer> root) {
		List<BinaryTreeNode<Integer>> nodeList = new ArrayList<BinaryTreeNode<Integer>>();
		identifyThePaths(root, nodeList);
	}

	/**
	 * This method identifies the leaf nodes and stores in a list.
	 * 
	 * @param root
	 * @param nodeList
	 */
	private void identifyThePaths(BinaryTreeNode<Integer> root,
			List<BinaryTreeNode<Integer>> nodeList) {
		if (root == null) {
			return;
		}
		nodeList.add(root);
		if (root.getLeft() == null && root.getRight() == null) {
			printPath(nodeList);
		} else {
			identifyThePaths(root.getLeft(), nodeList);
			nodeList.remove(root.getLeft());
			identifyThePaths(root.getRight(), nodeList);
			nodeList.remove(root.getRight());
		}
	}

	/**
	 * This method print the path.
	 * 
	 * @param nodes
	 */
	private void printPath(List<BinaryTreeNode<Integer>> nodes) {
		for (BinaryTreeNode<Integer> node : nodes) {
			System.out.print(node.getData() + " ");
		}
		System.out.println();
	}

	/**
	 * This method checks whether a root to leaf has a path of specified sum.
	 * 
	 * @param root
	 * @param sum
	 * @return
	 */
	public boolean hasPathSum(BinaryTreeNode<Integer> root, int sum) {
		if (root == null) {
			return false;
		}
		int subSum = sum - root.getData();
		if (root.getLeft() == null && root.getRight() == null) {
			return (subSum == 0);
		}
		return (hasPathSum(root.getLeft(), subSum) || hasPathSum(
				root.getRight(), subSum));
	}

	/**
	 * This method performs the sum of all node values, recursively.
	 * 
	 * @param root
	 * @return
	 */
	public int sumOfAllNodesRecursively(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		return (root.getData() + sumOfAllNodesRecursively(root.getLeft()) + sumOfAllNodesRecursively(root
				.getRight()));
	}

	/**
	 * This method performs the sum of all node values, iteratively.
	 * 
	 * @param root
	 * @return
	 */
	public int sumOfAllNodesIteratively(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int sum = 0;
		Queue<BinaryTreeNode<Integer>> Q = new Queue<BinaryTreeNode<Integer>>();
		Q.enqueue(root);
		while (!Q.isEmpty()) {
			root = Q.dequeue();
			sum += root.getData();
			if (root.getLeft() != null) {
				Q.enqueue(root.getLeft());
			}
			if (root.getRight() != null) {
				Q.enqueue(root.getRight());
			}
		}
		return sum;
	}

	/**
	 * this method converts a binary tree to its mirror.
	 * 
	 * @param root
	 */
	public void mirrorOfBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		mirrorOfBinaryTree(root.getLeft());
		mirrorOfBinaryTree(root.getRight());
		BinaryTreeNode<Integer> temp = root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(temp);
	}

	/**
	 * This method checks whether two binary trees are mirror image of each
	 * other.
	 * 
	 * @param root1
	 * @param root2
	 * @return boolean
	 */
	public boolean areTwoBinaryTreesMirrorOfEachOther(
			BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		if (root1.getData() != root2.getData()) {
			return false;
		} else
			return (areTwoBinaryTreesMirrorOfEachOther(root1.getLeft(),
					root2.getRight()) && areTwoBinaryTreesMirrorOfEachOther(
					root1.getRight(), root2.getLeft()));
	}

	/**
	 * this method builds a binary tree using the inOrder and preOrder traversal
	 * sequence.
	 * 
	 * @param inOrder
	 * @param preOrder
	 */
	public <E> BinaryTreeNode<E> buildBinaryTreeUsingInOrderAndPreOrderSequence(
			List<E> inOrder, List<E> preOrder) {
		if (inOrder.isEmpty() || preOrder.isEmpty()
				|| inOrder.size() != preOrder.size()) {
			return null;
		}
		int size = inOrder.size();
		int rootIndexPreOrder = 0;
		BinaryTreeNode<E> root = new BinaryTreeNode<E>();
		E data = preOrder.get(rootIndexPreOrder);
		int rootIndexInOrder = inOrder.indexOf(data);

		root.setData(data);
		if (rootIndexInOrder > 0) {
			root.setLeft(buildBinaryTreeUsingInOrderAndPreOrderSequence(
					inOrder.subList(rootIndexPreOrder, rootIndexInOrder - 1),
					preOrder.subList(rootIndexPreOrder + 1, rootIndexInOrder)));
		}
		root.setRight(buildBinaryTreeUsingInOrderAndPreOrderSequence(
				inOrder.subList(rootIndexInOrder + 1, size),
				preOrder.subList(rootIndexInOrder + 1, size)));

		// System.out.println(root.getData() + " ");
		return root;
	}

	/**
	 * Used in building binary tree;
	 */

	static int preIndex = 0;

	/**
	 * This method builds a binary tree using the inOrder and preOrder traversal
	 * sequence.
	 * 
	 * @param inOrder
	 * @param preOrder
	 * @param inStart
	 * @param inEnd
	 * @return
	 */
	public BinaryTreeNode<Integer> buildBinaryTreeUsingInOrderAndPreOrderTraversal(
			int[] inOrder, int[] preOrder, int inStart, int inEnd) {
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>();

		if (inStart > inEnd) {
			return null;
		}
		newNode.setData(preOrder[preIndex]);
		preIndex++;
		if (inStart == inEnd) {
			return newNode;
		}
		int inIndex = search(inOrder, inStart, inEnd, newNode.getData());
		if (inIndex != -1) {
			newNode.setLeft(buildBinaryTreeUsingInOrderAndPreOrderTraversal(
					inOrder, preOrder, inStart, inIndex - 1));
			newNode.setRight(buildBinaryTreeUsingInOrderAndPreOrderTraversal(
					inOrder, preOrder, inIndex + 1, inEnd));
		}
		return newNode;
	}

	private int search(int[] inOrder, int inStart, int inEnd, int data) {
		for (int i = inStart; i < inEnd; i++) {
			if (inOrder[i] == data) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * This method prints all the ancestor a node.
	 * 
	 * @param root
	 * @param node
	 * @return
	 */
	public boolean printAllAncestors(BinaryTreeNode<Integer> root,
			BinaryTreeNode<Integer> node) {
		if (root == null) {
			return false;
		}
		if (root.getLeft() == node || root.getRight() == node
				|| printAllAncestors(root.getLeft(), node)
				|| printAllAncestors(root.getRight(), node)) {
			System.out.print(root.getData() + " ");
			return true;
		}
		return false;
	}

	/**
	 * This method finds the LCA of two binary tree nodes.
	 * 
	 * @param root
	 * @param node1
	 * @param node2
	 * @return
	 */
	public BinaryTreeNode<Integer> LCAofTwoBinaryTreeNodes(
			BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> node1,
			BinaryTreeNode<Integer> node2) {
		BinaryTreeNode<Integer> left, right;
		if (root == null || node1 == null || node2 == null) {
			return null;
		}
		if (root == node1 || root == node2) {
			return root;
		}
		left = LCAofTwoBinaryTreeNodes(root.getLeft(), node1, node2);
		right = LCAofTwoBinaryTreeNodes(root.getRight(), node1, node2);
		if (left != null && right != null) {
			return root;							
		} else if (left != null) {
			return left;
		} else {
			return right;
		}
	}

	/**
	 * This method is for zigzag traversal of a binary tree. Here, two stacks
	 * are in use. The root is stored in one stack and its children are stored
	 * in another. The stacks are swapped once first stack is empty.
	 * 
	 * @param root
	 */
	public void zigZagTraversalOfBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		boolean leftToRight = true;
		Stack<BinaryTreeNode<Integer>> S1 = new Stack<BinaryTreeNode<Integer>>();
		Stack<BinaryTreeNode<Integer>> S2 = new Stack<BinaryTreeNode<Integer>>();
		S1.push(root);
		while (!S1.isEmpty()) {
			root = S1.pop();
			System.out.print(root.getData() + "  ");
			if (leftToRight) {
				if (root.getLeft() != null) {
					S2.push(root.getLeft());
				}
				if (root.getRight() != null) {
					S2.push(root.getRight());
				}
			} else {
				if (root.getRight() != null) {
					S2.push(root.getRight());
				}
				if (root.getLeft() != null) {
					S2.push(root.getLeft());
				}
			}
			if (S1.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<BinaryTreeNode<Integer>> temp = S1;
				S1 = S2;
				S2 = temp;
			}
		}
	}

	/**
	 * It is used in finding the vertical sum of a binary tree.
	 */
	static Map<Integer, Integer> verticalSum = new TreeMap<Integer, Integer>();

	/**
	 * This method calculates the vertical sum of a binary tree.
	 * 
	 * @param root
	 */
	public void verticalSumInBinaryTree(BinaryTreeNode<Integer> root, int column) {
		int level = this.heightOfBinaryTreeUsingLevelOrder(root);
		for (int i = -level; i <= level; i++) {
			verticalSum.put(i, 0);
		}
		verticalSum(root, column);
		Set<Integer> keys = verticalSum.keySet();
		System.out.println("The vertical sum is calculated as below: ");
		for (Integer key : keys) {
			System.out.print(verticalSum.get(key) + "  ");
		}
	}

	private void verticalSum(BinaryTreeNode<Integer> root, int column) {
		if (root == null) {
			return;
		}
		verticalSum(root.getLeft(), column - 1);
		verticalSum.put(column, verticalSum.get(column) + root.getData());
		verticalSum(root.getRight(), column + 1);
	}

	static int i = 0;

	/**
	 * This method builds a a strict binary tree from preOrder sequence.
	 * 
	 * @param A
	 * @param i
	 * @return
	 */
	public BinaryTreeNode<Character> buildTreeFromPreOrder(char[] A) {
		if (A.length == 0) {
			return null;
		}
		BinaryTreeNode<Character> newNode = new BinaryTreeNode<Character>();
		newNode.setData(A[i]);
		if (A[i] == 'L') {
			return newNode;
		}
		i++;
		newNode.setLeft(buildTreeFromPreOrder(A));
		i++;
		newNode.setRight(buildTreeFromPreOrder(A));
		return newNode;
	}

	/**
	 * this method checks whether two binary trees are isomorphic or not.
	 * 
	 * @param root1
	 * @param root2
	 * @return
	 */
	public <E> boolean areTreesIsomorphic(BinaryTreeNode<E> root1,
			BinaryTreeNode<E> root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		
		if ((root1 == null && root2 != null)
				|| (root1 != null && root2 == null)) {
			return false;
		}
		return (areTreesIsomorphic(root1.getLeft(), root2.getLeft()) && areTreesIsomorphic(
				root1.getRight(), root2.getRight()));
	}

	/**
	 * This method converts a binary tree to doubly linked list in place. Modify
	 * the same binary tree.
	 * 
	 * @param root
	 */
	public <E> BinaryTreeNode<E> convertBinaryTreeToDLL(BinaryTreeNode<E> root) {
		if (root == null) {
			return null;
		}
		if (root.getLeft() != null) {
			BinaryTreeNode<E> left = convertBinaryTreeToDLL(root.getLeft());
			while (left.getRight() != null) {
				left = left.getRight();
			}
			left.setRight(root);
			root.setLeft(left);
		}
		if (root.getRight() != null) {
			BinaryTreeNode<E> right = convertBinaryTreeToDLL(root.getRight());
			while (right.getLeft() != null) {
				right = right.getLeft();
			}
			right.setLeft(root);
			root.setRight(right);
		}
		return root;
	}
	
	/**
	 * This method is used to populate the nextSibling pointer of a binary tree node.
	 * @param root
	 */
	public <E> void fillNextSiblings(BinaryTreeNode<E> root){
		if(root==null){
			return;
		}
		if(root.getLeft()!=null){
			root.getLeft().setNextSibling(root.getRight());
		}
		if(root.getRight()!=null){
			if(root.getNextSibling()!=null){
				root.getRight().setNextSibling(root.getNextSibling().getLeft());
			}
			else root.getRight().setNextSibling(null);
		}
		fillNextSiblings(root.getLeft());
		fillNextSiblings(root.getRight());
	}
	
}
