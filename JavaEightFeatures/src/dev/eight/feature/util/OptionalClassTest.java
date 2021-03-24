package dev.eight.feature.util;

import java.util.Optional;

public class OptionalClassTest {

	public static void main(String[] args) {

		String[] arr = new String[10];
		arr[0] = "ONE";
		arr[1] = "TWO";

		Optional<String> chkNull = Optional.ofNullable(arr[5]);

		if (chkNull.isPresent()) {
			System.out.println(arr[1].toLowerCase());
		} else {
			System.out.println("arr is null");
		}
	}

}
