package dev.basic.feature.advanced;

import java.util.Arrays;

/**
 * 
 * Differenece toString and deepToString for dimensional and multidimensional
 * array.
 *
 */
public class ArraysDeepToString {
	public static void main(String[] args) {
		// Trying to print array of strings using toString
		String[] strs = new String[] { "Welcome", "to", "Java" };
		System.out.println(Arrays.toString(strs));

		// Trying to print multidimensional array using toString
		int[][] mat = new int[2][2];
		mat[0][0] = 100;
		mat[0][1] = 101;
		mat[1][0] = 110;
		mat[1][1] = 111;
		System.out.println(Arrays.toString(mat));

		// print 2D integer array using deepToString()
		System.out.println(Arrays.deepToString(mat));
	}
}
