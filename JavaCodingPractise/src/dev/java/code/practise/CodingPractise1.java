package dev.java.code.practise;

import java.util.HashSet;

public class CodingPractise1 {

	public static void main(String[] args) {

		// 1. Addition Operator Priority
		String s1 = "abc";
		String s2 = "abc";

		// java + operator precedence is more than == operator. so given expression is
		// evaluted to "s1==s2 is abc"=="abc" i.e. false
		System.out.println("s1==s2 is" + s1 == s2); // false

		// equal the both values i.e. true
		System.out.println(s1 == s2);// true

		// 2. Automatic typecasting of based the inputs
		String s3 = "Karthik";
		int start = 1;
		char end = 5;
		System.out.println(start + end);
		System.out.println(s3.substring(start, end));

		// 3. convertion of integer datatype
		HashSet shortSet = new HashSet();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			// i-1 automatcally converted into the integer object, so there is no integer
			// object in hashmap i.e. false , it wont remove any object
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());

		// 4. flag value for execute the finally block
		// never execte the finally blobk due to if its TRUE, it goes to infinite loop
		// and if its FALSE, it terminate the JVM
		boolean flag = false;
		try {
			if (flag) {
				while (true) {
					// infinite loop
				}
			} else {
				// System.exit(1);
			}
		} finally {
			System.out.println("In Finally");
		}

		String str = null;
		String str1 = "abc";
		System.out.println(str1.equals("abc"));
		// System.out.println(str.equals(null)); // Null pointer exception

		String x = "abc";
		String y = "abc";
		x.concat(y);
		System.out.print(x);// abc

	}

}
