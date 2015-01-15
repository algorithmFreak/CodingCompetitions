package com.acc.rahul.srcHashing;

public class HashTableOperations {

	public final static int LOADFACTOR = 20;

	/**
	 * This is the hash function.
	 * 
	 * @param data
	 * @param size
	 * @return
	 */
	public static int Hash(int data, int size) {
		return data % size;
	}

	/**
	 * This method creates a hash table.
	 * 
	 * @param size
	 * @return
	 */
	public static HashTable createHashTable(int size) {
		HashTable h = new HashTable();
		// count is set to zero by default
		h.setTableSize(size / LOADFACTOR);
		for (int i = 0; i < h.getTableSize(); i++) {
			h.getTable()[i] = new HashTableNode();
			h.getTable()[i].setStartNode(null);
		}
		return h;
	}

	/**
	 * This method searches for the data in the hash table
	 * 
	 * @param h
	 * @param data
	 * @return
	 */
	public static boolean hashSearch(HashTable h, int data) {
		ListNode temp = h.getTable()[Hash(data, h.getTableSize())]
				.getStartNode();
		while (temp != null) {
			if (temp.getData() == data) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
	
	/**
	 * This method searches for the data in the hash table and returns the node.
	 * 
	 * @param h
	 * @param data
	 * @return
	 */
	public static ListNode hashSearchedNode(HashTable h, int data) {
		ListNode temp = h.getTable()[Hash(data, h.getTableSize())]
				.getStartNode();
		while (temp != null) {
			if (temp.getData() == data) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}

	/**
	 * This method inserts data to hash table.
	 * 
	 * @param h
	 * @param data
	 * @return
	 */
	public static HashTable hashInsert(HashTable h, int data) {
		int index;
		ListNode temp, newNode;
		if (hashSearch(h, data))
			return h;
		index = Hash(data, h.getTableSize());
		temp = h.getTable()[index].getStartNode();
		newNode = new ListNode();
		newNode.setKey(index);
		newNode.setData(data);
		newNode.setNext(temp);
		h.getTable()[index].setStartNode(newNode);
		h.getTable()[index]
				.setBlockCount(h.getTable()[index].getBlockCount() + 1);
		h.setCount(h.getCount() + 1);
		if (h.getCount() / h.getTableSize() > LOADFACTOR) {
			h = reHash(h);
		}
		return h;
	}

	/**
	 * This method deletes a data from hash table.
	 * 
	 * @param h
	 * @param data
	 * @return
	 */
	public static boolean hashDelete(HashTable h, int data) {
		ListNode temp, prev;
		int index = Hash(data, h.getTableSize());
		HashTableNode tableNode = h.getTable()[index];

		temp = tableNode.getStartNode();
		prev = null;
		while (temp != null) {
			if (temp.getData() == data) {
				if (prev == null) {
					tableNode.setStartNode(temp.getNext());
				} else {
					prev.setNext(temp.getNext());
				}
				temp.setNext(null);
				temp = null;
				return true;
			}
		}
		return false;
	}

	/**
	 * This method rehashes a hash table.
	 * 
	 * @param h
	 * @return
	 */
	public static HashTable reHash(HashTable h) {
		int oldSize, index, newSize;
		ListNode temp1, temp2;
		HashTableNode[] oldTable = h.getTable();
		oldSize = h.getTableSize();
		newSize = oldSize * 2;

		h = new HashTable();
		h.setTableSize(newSize);
		for (int i = 0; i < oldSize; i++) {
			temp1 = oldTable[i].getStartNode();
			while (temp1 != null) {
				temp2 = temp1.getNext();
				index = Hash(temp1.getData(), h.getTableSize());
				if (h.getTable()[index] == null) {
					h.getTable()[index] = new HashTableNode();
				}
				ListNode temp3 = h.getTable()[index].getStartNode();
				h.getTable()[index].setStartNode(temp1);
				h.getTable()[index].setBlockCount(h.getTable()[index]
						.getBlockCount() + 1);
				temp1.setNext(temp3);
				oldTable[i].setStartNode(temp2);
				temp1 = temp2;
			}
		}
		return h;
	}

	/**
	 * This method prints the hash table.
	 * 
	 * @param h
	 */
	public static void printHashTable(HashTable h) {
		for (HashTableNode row : h.getTable()) {
			ListNode node = row.getStartNode();

			System.out.print("\nblock count " + row.getBlockCount()
					+ "; Elements are: ");
			while (node != null) {
				System.out.print(node.getKey() + "-" + node.getData() + "  ");
				node = node.getNext();
			}
		}
		System.out.println("\n---------------");
	}

	public static void main(String... args) {
		HashTable h = HashTableOperations.createHashTable(50);
		for (int i = 1; i <= 60; i++) {
			h = HashTableOperations.hashInsert(h, i);
		}
		HashTableOperations.printHashTable(h);
	}

}
