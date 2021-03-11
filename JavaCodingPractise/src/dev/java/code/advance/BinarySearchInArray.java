package dev.java.code.advance;

/**
 * 
 * Binary Search based on the mid veriable to findout the key\ Check the list of
 * arrays into two part one is low and another one is high
 * 
 * Key is to find/search the element into the arrays 1. high checks the 1st part
 * of the arrays using mid e.g. high = mid-1 2. low checks the 2nd part of the
 * arrays using mid e.g. low = mid+1
 * 
 * @author karth
 *
 */
public class BinarySearchInArray {

	public static void main(String[] args) {

		int arr[] = { 5, 3, 8, 1, 10 };
		int n = arr.length;
		int x = 5;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	public static int binarySearch(int arr[], int low, int high, int key) {
		int mid = (low + high) / 2;

		while (low <= high) {
			if (arr[mid] < key) {
				low = mid + 1;
			} else if (arr[mid] == key) {
				return mid;
			} else {
				high = mid - 1;
			}
			mid = (low + high) / 2;
		}
		if (low > high) {
			return -1;
		}
		return -1;
	}

}
