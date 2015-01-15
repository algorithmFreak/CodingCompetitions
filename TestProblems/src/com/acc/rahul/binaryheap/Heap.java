package com.acc.rahul.binaryheap;

public class Heap {

	public int[] array;
	
	/**
	 * No of elements in heap.
	 */
	public int count;
	
	/**
	 * Size of heap.
	 */
	public int capacity;
	
	/**
	 * min heap or max heap.
	 */
	public int heap_type;
	
	/**
	 * constructor.
	 * @param capacity
	 * @param heap_type
	 */
	public Heap(int capacity, int heap_type){
		this.heap_type = heap_type;
		this.count=0;
		this.capacity=capacity;
		this.array = new int[capacity];
	}
	
	/**
	 * For a node at ith location, its parent is at (i-1)/2 location.
	 * 
	 * @param i
	 * @return
	 */
	public int getParent(int i){
		if(i<=0 || i>this.count){
			return -1;
		}
		return (i-1)/2;
	}
	
	/**
	 * This returns the left child of a node at ith location.
	 * @param i
	 * @return
	 */
	public int leftChild(int i){
		int left = 2*i + 1;
		if(left>=this.count){
			return -1;
		}
		return left;
	}
	
	/**
	 * This returns the left child of a node at ith location.
	 * @param i
	 * @return
	 */
	public int rightChild(int i){
		int right = 2*i + 2;
		if(right>=this.count){
			return -1;
		}
		return right;
	}
	
	/**
	 * This return the maximum element of max heap.
	 * This will be the root node, incase of max heap. 
	 * @param i
	 * @return
	 */
	public int getMaximum(int i){
		if(this.count==0){
			return -1;
		}
		return this.array[0];
	}
	
	public void insert(int data){
		int i;
		if(this.count==this.capacity){
			resizeHeap();
		}
		this.count++;   //increasing the heap size to hold this new item
		i = this.count - 1;		
		int pIndex;
		while(i>=0 && data>this.array[pIndex = getParent(i)]){
			this.array[i] = this.array[pIndex];
			i = pIndex;
		}
		this.array[i] = data;
	}
	
	private void resizeHeap(){
		int[] array_old = new int[this.capacity];
		System.arraycopy(this.array, 0, array_old, 0, this.count);
		this.capacity *=2;
		this.array = new int[this.capacity];
		System.arraycopy(array_old, 0, this.array, 0, array_old.length);
		array_old = null;
	}
	
}
