package com.acc.rahul.srcGenericTree;

public class GenericTreeOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeNode[] t = new TreeNode[12];
		for (int i = 0; i < 12; i++) {
			t[i] = new TreeNode(i + 1);
		}
		t[0].setNextSibling(null);

		t[0].setFirstChild(t[1]);
		t[1].setNextSibling(t[2]);
		t[2].setNextSibling(t[3]);
		t[3].setNextSibling(t[4]);

		t[1].setFirstChild(t[5]);
		t[5].setNextSibling(t[6]);
		t[6].setNextSibling(null);

		t[2].setFirstChild(t[7]);
		t[7].setNextSibling(t[8]);
		t[8].setNextSibling(t[9]);
		t[9].setFirstChild(t[10]);
		t[10].setNextSibling(t[11]);

		TreeNode[] r = new TreeNode[12];
		for (int i = 0; i < 12; i++) {
			r[i] = new TreeNode(i + 1);
		}
		r[0].setNextSibling(null);

		r[0].setFirstChild(r[1]);
		r[1].setNextSibling(r[2]);
		r[2].setNextSibling(r[3]);
		r[3].setNextSibling(r[4]);

		r[1].setFirstChild(r[5]);
		r[5].setNextSibling(r[6]);
		r[6].setNextSibling(null);

		r[2].setFirstChild(r[7]);
		r[7].setNextSibling(r[8]);
		r[8].setNextSibling(r[9]);
		r[9].setFirstChild(r[10]);
		r[10].setNextSibling(r[11]);

		GenericTreeOperations treeOperations = new GenericTreeOperations();
		System.out.println(treeOperations.sumOfAllElements(t[0]));
		System.out.println(treeOperations.depthInGenericTree(new int[] { -1, 0,
				1, 6, 6, 0, 0, 2, 7 }, 9));

		System.out.println(treeOperations.siblingsCount(t[1]));
		System.out.println(treeOperations.areTreesIsomorphic(t[1], r[1]));  
		System.out.println(treeOperations.childCount(t[2]));
	}

	/**
	 * This method finds the sum of all node data in the generic tree.
	 * 
	 * @param root
	 * @return
	 */
	public int sumOfAllElements(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return root.getData() + sumOfAllElements(root.getFirstChild())
				+ sumOfAllElements(root.getNextSibling());
	}

	public int depthInGenericTree(int[] P, int n) {
		int maxDepth = -1, currentDepth = -1, j;
		for (int i = 0; i < n; i++) {
			currentDepth = 0;
			j = i;
			while (P[j] != -1) {
				currentDepth++;
				j = P[j];
			}
			maxDepth = Math.max(currentDepth, maxDepth);
		}
		return maxDepth;
	}

	public int siblingsCount(TreeNode node) {
		int count = 0;
		while (node.getNextSibling() != null) {
			count++;
			node = node.getNextSibling();
		}
		return count;
	}

	public boolean areTreesIsomorphic(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if ((root1 == null && root2 != null)
				|| (root1 != null && root2 == null)) {
			return false;
		}
		return (areTreesIsomorphic(root1.getFirstChild(), root2.getFirstChild()) && areTreesIsomorphic(
				root1.getNextSibling(), root2.getNextSibling()));
	}
	
	public int childCount(TreeNode node){
		if(node==null){
			return 0;
		}
		int count=0;
		TreeNode child = node.getFirstChild();
		while(child!=null){
			count++;
			child = child.getNextSibling();
		}
		return count;
	}
}
