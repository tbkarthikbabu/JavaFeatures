package dev.java.design.pattern.creational.singleton;

/**
 * Creational Deisgn Pattern
 * 
 * Singleton pattern is a design pattern that restricts the instantiation of a
 * class to one object.
 * 
 * Type 4: Double Checked Locking, only acquire lock on the getInstance() once,
 * when the obj is null.
 * 
 * volatile: it's used to make a variable as thread-safe.
 * 
 */
public class SingletonType4 {

	private static volatile SingletonType4 obj = null;

	private SingletonType4() {
	}

	public static SingletonType4 getInstance() {
		if (obj == null) {
			// To make thread safe
			synchronized (SingletonType4.class) {
				// check again as multiple threads and can reach above step
				if (obj == null)
					obj = new SingletonType4();
			}
		}
		return obj;
	}
}
