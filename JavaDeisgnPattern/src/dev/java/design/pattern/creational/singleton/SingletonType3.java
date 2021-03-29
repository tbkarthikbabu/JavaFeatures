package dev.java.design.pattern.creational.singleton;

/**
 * Creational Deisgn Pattern
 * 
 * Singleton pattern is a design pattern that restricts the instantiation of a
 * class to one object.
 * 
 * Type 3: Eager Instantiation, singleton object created when the class is
 * loaded in static initializer and hence this is guaranteed to be thread safe
 * 
 *
 */
public class SingletonType3 {

	private static SingletonType3 obj = new SingletonType3();

	private SingletonType3() {
	}

	public static synchronized SingletonType3 getInstance() {
		return obj;
	}
}
