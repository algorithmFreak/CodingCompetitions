package com.acc.rahul.srcSorting;

/**
 * The only significant advantage that bubble sort has over other other
 * implementation is that it can detect whether the input list is already sorted
 * or not. 
 * this method works like bubble out the largest element and place it at the last.
 * Worst Case Complexity: O(n^2)
 * Best Case Complexity(improved version): O(n) 
 * Average Case complexity(basic version): O(n^2)
 * Worst Case space complexity: O(1)
 * 
 * @author RAHUL
 * 
 */
public class BubbleSort extends Sort {

	public void bubbleSort(int[] arr, int n) {
		// we have to make n passes
		// to make sure the array is sorted
		for (int pass = n - 1; pass >= 0; pass--) {
			for (int i = 0; i < pass; i++) { // start from the first element and
												// iterate till the pass.
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
			//System.out.println("pass " + pass);
		}

	}

	/**
	 * When there are no more swaps, indicate the completion of sorting. If the
	 * list is already sorted, by using this flag we can skip the remaining
	 * passes.
	 * 
	 * @param arr
	 * @param n
	 */
	public void bubbleSortImproved(int[] arr, int n) {
		boolean swapped=true;
		for(int pass=n-1;pass>=0 && swapped;pass--){
			swapped=false;
			for(int i=0;i<pass;i++){
				if(arr[i]>arr[i+1]){
					swap(arr,i,i+1);
					swapped=true;
				}
			}
			System.out.println("pass " + pass);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr = new int[] { 4, 1, 9, 10, 3, 2, 7, 8 };
		bubbleSort.printArrayElements(arr);
		//bubbleSort.bubbleSort(arr, arr.length);
		bubbleSort.bubbleSortImproved(arr, arr.length);
		bubbleSort.printArrayElements(arr);
	}

}
