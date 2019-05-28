// Chapter 13 Exercise 18
// Write a modified version of the selection sort algorithm that 
// selects the largest element each time and moves its to the end of the array, 
// rather than selecting the smallest element and moving it to the beginning.  

// Will this algorithm be faster than the standard selection sort? 
// NO, same a regular SelectionSort

// What will its complexity class (big-Oh) be?
// O(N^2)  ; both algorithms have quadratic O(n^2) complexity; the run time are the same

import java.util.*;

public class Assignment7Edited {

	public static void main(String[] args) {

		// to test the known method
		int[] nums = { 5, 9, 13, 12, 69, 99, 81, 67 };
		System.out.println(Arrays.toString(nums));

		System.out.println(Arrays.toString(SelectionSortRegular(nums)));

		// to test the assignment method
		int numsL[] = { 5, 9, 13, 12, 69, 99, 81, 67 };
		System.out.println(Arrays.toString(numsL));

		System.out.println(Arrays.toString(SelectionSortL(numsL)));

	}

	// use SelectionSort regular to build the reverse
	// SelectionSortL for Largest
	public static int[] SelectionSortRegular(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			// to find index of largest element
			int smallest = i;
			for (int j = j = i + 1; j < a.length; j++) {
				if (a[j] < a[smallest]) {
					smallest = j;
				}
			}
			
			// to swap largest to back end of index

			swap(a, i, smallest); 
		}
		return a;
	}

	// SelectionSortL for largest
	public static int[] SelectionSortL(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			// find index of largest element
			int largest = i;
			// for(int j = a.length - 1; j > 0 ; j--){
			for (int j = i - 1; j >= 0; j--) {
				if (a[j] > a[largest]) {
					largest = j;
				}
			}
			
			// to swap largest to back end of index
			swap(a, i, largest); 
		}
		return a;
	}

	// to swap array entries
	public static void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

}
