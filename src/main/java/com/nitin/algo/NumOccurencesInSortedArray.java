/*
 * Given a sorted array arr[] and a number x, write a function that counts the occurrences of x in arr[]. Expected time complexity is O(Logn)

  Examples:

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
  Output: 4 // x (or 2) occurs 4 times in arr[]

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 3
  Output: 1 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 1
  Output: 2 

  Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 4
  Output: -1 // 4 doesn't occur in arr[] 
 */

package com.nitin.algo;

public class NumOccurencesInSortedArray {
	
	private static int count = -1;
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 2, 2, 3};
		int n = 4;
		System.out.println("The number " + n + " occurs " + numOccur(arr, n) + " times.");
	
	}

	private static int numOccur(int[] arr, int n) {
		int low = 0, high = arr.length - 1;
		binSearch(arr, low, high, n);
		return count;
	}

	private static void binSearch(int[] arr, int low, int high, int target) {
		if(low > high)
			return;
		int mid = (low + (high-low)/2);
		if(arr[mid] == target) {
			count++;
			binSearch(arr, low, mid - 1, target);
		}
		else if(arr[mid] > target) {
			binSearch(arr, low, mid - 1, target);
		}
		else {
			binSearch(arr, mid + 1, high, target);
		}
		
	}

}
