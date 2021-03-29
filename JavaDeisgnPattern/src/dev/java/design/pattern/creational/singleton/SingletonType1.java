package dev.java.design.pattern.creational.singleton;

/**
 * Creational Deisgn Pattern
 * 
 * Singleton pattern is a design pattern that restricts the instantiation of a
 * class to one object.
 * 
 * Type 1: Lazy Instantiation: Singleton obj is not created until call
 * getInstance() method
 * 
 * Condition: 1. Private Constructor 2. Static method
 * 
 */
public class SingletonType1 {

	// static method is used to access without obj creation
	private static SingletonType1 obj;

	// private constructor is force to create object in the same class
	private SingletonType1() {
	}

	public static SingletonType1 getInstance() {
		if (obj == null) {
			obj = new SingletonType1();

		}
		return obj;
	}
}
