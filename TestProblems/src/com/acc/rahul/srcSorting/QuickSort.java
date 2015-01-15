package com.acc.rahul.srcSorting;

public class QuickSort extends Sort {

	/**
	 * This method return the final position of a pivot element before the
	 * completely sorted array. This function takes last element as pivot,
	 * places the pivot element at its correct position in sorted array, and
	 * places all smaller (smaller than pivot) to left of pivot and all greater
	 * elements to right of pivot
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // make the last element as pivot
		int i = (low - 1); // start i from the value one less than low
		for (int j = low; j <= high - 1; j++) { // loop till j points to high-1
			if (arr[j] <= pivot) { // if element <= pivot, then increment i by 1
									// and swap i & j
				i++;
				swap(arr, i, j); // this will swap by the same value if all the
									// element were less
			}
		}
		swap(arr, i + 1, high); // at the end it will find its final position.
		return (i + 1);
	}

	/**
	 * This method sorts an array recursively using QuickSort Algorithm.
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 */
	public void quickSortRecursively(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			quickSortRecursively(arr, low, pivotIndex - 1);
			quickSortRecursively(arr, pivotIndex + 1, high);
		}
	}

	/**
	 * This method sorts an array iteratively using QuickSort Algorithm.
	 * 
	 * @param arr
	 * @param low
	 * @param high
	 */
	public void quickSortIteratively(int[] arr, int low, int high) {
		int[] stack = new int[high-low+1];  // Create an auxiliary stack
		int top =-1;		// initialize top of stack
		
		// push initial values of l and h to stack
		stack[++top]=low;
		stack[++top]=high;
		
	  // Keep popping from stack while is not empty
		while(top>=0){
			
		  //pop high and low
			high = stack[top--];
			low = stack[top--];
			
			// Set pivot element at its correct position in sorted array
			int pivotIndex = partition(arr, low, high);
			
			// If there are elements on left side of pivot, then push left
	        // side to stack
			if(pivotIndex-1>low){
				stack[++top] = low;
				stack[++top] =pivotIndex-1;
			}
			
			// If there are elements on right side of pivot, then push right
	        // side to stack
			if(pivotIndex+1<high){
				stack[++top] = pivotIndex+1;
				stack[++top] = high;
			}
		}
	}


	public static void main(String[] args) {
		QuickSort quicksort = new QuickSort();
		int[] arr = new int[] { 1, 4, 2, 9, 7, 6 }; // sorted would be
													// 1,2,4,6,7,9
		quicksort.printArrayElements(arr);
	//	quicksort.quickSortRecursively(arr, 0, arr.length - 1);
		quicksort.quickSortIteratively(arr, 0, arr.length - 1);
		quicksort.printArrayElements(arr);
	}

}
