package dev.java.design.pattern.creational.singleton;

/**
 * Creational Deisgn Pattern
 * 
 * Singleton pattern is a design pattern that restricts the instantiation of a
 * class to one object.
 * 
 * Type 2: Synchronized Method, synchronized makes sure that only one thread at
 * a time can execute getInstance().
 * 
 */
public class SingletonType2 {

	private static SingletonType2 obj;

	private SingletonType2() {
	}

	// Only one thread can execute this at a time
	public static synchronized SingletonType2 getInstance() {
		if (obj == null) {
			obj = new SingletonType2();
		}
		return obj;
	}
}
