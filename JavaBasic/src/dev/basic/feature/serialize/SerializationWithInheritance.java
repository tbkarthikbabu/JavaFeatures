package dev.basic.feature.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * <li>1. If superclass is serializable then subclass is automatically
 * serializable
 * <li>2. If a superclass is not serializable then subclass can still be
 * serialized
 * <li>3. If the superclass is serializable but we don’t want the subclass to be
 * serialized
 * 
 */
class A implements Serializable {
	int superVal;

	// parameterized constructor
	public A(int i) {
		this.superVal = i;
	}

}

// subclass B, B class doesn't implement Serializable interface.
class B extends A {
	int subVal;

	// parameterized constructor
	public B(int i, int j) {
		super(i);
		this.subVal = j;
	}
}

// Driver class
public class SerializationWithInheritance {
	public static void main(String[] args) throws Exception {
		B b1 = new B(10, 20);

		System.out.println("i = " + b1.superVal);
		System.out.println("j = " + b1.subVal);

		/* Serializing B's(subclass) object */

		// Saving of object in a file
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Method for serialization of B's class object
		oos.writeObject(b1);

		// closing streams
		oos.close();
		fos.close();

		System.out.println("Object has been serialized");

		/* De-Serializing B's(subclass) object */

		// Reading the object from a file
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// Method for de-serialization of B's class object
		B b2 = (B) ois.readObject();

		// closing streams
		ois.close();
		fis.close();

		System.out.println("Object has been deserialized");

		System.out.println("i = " + b2.superVal);
		System.out.println("j = " + b2.subVal);
	}
}
