package com.acc.rahul.srcHashing;

public class HashTable {

	private int tableSize; //no of rows in table
	private int count;
	private HashTableNode[] table;
	
	/**
	 * @return the tableSize
	 */
	public int getTableSize() {
		return tableSize;
	}
	/**
	 * @param tableSize the tableSize to set
	 */
	public void setTableSize(int tableSize) {
		this.tableSize = tableSize;
		table = new HashTableNode[tableSize];
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the table
	 */
	public HashTableNode[] getTable() {
		return table;
	}
	/**
	 * @param table the table to set
	 */
	public void setTable(HashTableNode[] table) {
		this.table = table;
	}
	
	
}
