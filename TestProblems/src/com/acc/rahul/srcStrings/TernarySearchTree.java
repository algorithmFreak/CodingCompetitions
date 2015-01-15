package com.acc.rahul.srcStrings;

import java.util.ArrayList;
import java.util.List;

public class TernarySearchTree {

	private TSTNode root;
	private List<String> al;

	/**
	 * @return the root
	 */
	public TSTNode getRoot() {
		return root;
	}

	/**
	 * @param root the root to set
	 */
	public void setRoot(TSTNode root) {
		this.root = root;
	}

	/**
	 * @param root
	 */
	public TernarySearchTree() {
		super();
		this.root = null;
	}

	public void insert(String word) {
		root = insertInTST(root, word.toCharArray(), 0);
	}

	public TSTNode insertInTST(TSTNode root, char[] word, int position) {
		if (root == null) {
			root = new TSTNode(word[position]);
		}
		if (word[position] < root.getData()) {
			root.setLeft(insertInTST(root.getLeft(), word, position));
		} else if (word[position] > root.getData()) {
			root.setRight(insertInTST(root.getRight(), word, position));
		} else {
			if (position + 1 < word.length)
				root.setEq(insertInTST(root.getEq(), word, position + 1));
			else
				root.setEndOfString(true);
		}
		return root;
	}

	public String toString(){
		al= new ArrayList<String>();
		traverse(root,"");
		return "Ternary search tree:" +al;
	}
	
	public void traverse(TSTNode root, String str){
		if(root!=null){
			traverse(root.getLeft(),str);
			str+=root.getData();
			if(root.isEndOfString()){
				al.add(str);
			}
            traverse(root.getEq(), str);
            str = str.substring(0, str.length() - 1);
            traverse(root.getRight(), str);
		}
	}
	
}
