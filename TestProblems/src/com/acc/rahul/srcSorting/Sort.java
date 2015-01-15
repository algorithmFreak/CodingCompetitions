package com.acc.rahul.srcSorting;

public abstract class Sort {

	/**
	 * This method swaps two elements of an array.
	 * 
	 * @param arr
	 * @param a
	 * @param b
	 */
	protected void swap(int[] arr, int a, int b) {
		/*int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;*/
		if(arr[a]!=arr[b]){
			arr[a] = arr[a]^arr[b];
			arr[b] = arr[a]^arr[b];
			arr[a] = arr[a]^arr[b];
		}
	}
	
	/**
	 * This method prints the array elements.
	 * @param arr
	 */
	protected void printArrayElements(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
}
