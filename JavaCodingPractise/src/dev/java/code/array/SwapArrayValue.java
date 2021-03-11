package dev.java.code.array;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Swap implements using the Random class for find the random index and swap the
 * values using the temp variables
 * 
 * @author karth
 *
 */
public class SwapArrayValue {
	public static void main(String[] args) {

		int[] arrays = { 1, 2, 3, 4, 5 };

		Random rand = new Random();

		for (int i = 0; i < arrays.length; i++) {

			// swap functioality, get the random index and stroe the value of the index
			// value into the temp variable and then
			int randomIndexToSwap = rand.nextInt(arrays.length);
			int temp = arrays[randomIndexToSwap];

			// stroe the increament index value to the random index position of the arrays
			// and store temp valus to the incraemnt position
			arrays[randomIndexToSwap] = arrays[i];
			arrays[i] = temp;

		}
		System.out.println(Arrays.toString(arrays));
	}

}
