package dev.eight.feature;

public class NullExceWOOptional {

	public static void main(String[] args) {

		String[] arr = new String[10];
		// it throws error due to not adding it the elements
		System.out.println(arr[5].toLowerCase());
	}

}
