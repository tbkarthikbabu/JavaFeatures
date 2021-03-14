package dev.java.code.basic;

public class ImmutableDemo {

	public static void main(String[] args) {

		// "Java" string craeted in pool and reference assign to s1
		String s1 = "Java";
		// s2 is also same refernce to "Java" in the pool
		String s2 = s1;
		// proof that s1 and s2 have same refernce
		System.out.println(s1 == s2);

		// After the assign the new values to s1 and s2 is point to same object in pool
		s1 = "DotNet";
		// s1 value got changed to "DotNet" and how string is immutable/constant?

		// here, new string "DotNet" is created in pool and s1 is referring to the new
		// but, the orignial string "Java" is still unchanged and remains in the pool

		// s2 is still referring to the orginal string "Java" in the pool

		// proof that s1 and s2 have difference
		System.out.println(s1 == s2);

		// orginal value is unchaged and remians same in pool

		System.out.println("s2---->" + s2);
	}

}
