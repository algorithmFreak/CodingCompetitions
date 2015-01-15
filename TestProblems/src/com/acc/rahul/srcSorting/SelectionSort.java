package com.acc.rahul.srcSorting;

/**
 * Selection sort is an in-place sorting algorithm. Selection sort works well for small files.
 * It is used for sorting the files ith very large values and small keys. This is because of the fact
 * that selection is made based on keys and swaps are made only when required.
 * 
 *  Worst Case Complexity: O(n^2)
 * Best Case Complexity(improved version): O(n) 
 * Average Case complexity(basic version): O(n^2)
 * Worst Case space complexity: O(1)
 * @author RAHUL
 *
 */
public class SelectionSort extends Sort {

	public void selectionSort(int[] arr, int n){
		int min;
		for(int i=0;i<n-1;i++){
			min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			swap(arr,min,i);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
	}

}
