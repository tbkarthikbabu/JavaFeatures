package dev.basic.feature.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * SerialVersionUID: The Serialization runtime associates a version number with
 * each Serializable class called a SerialVersionUID, which is used during
 * Deserialization to verify that sender and reciever of a serialized object
 * have loaded classes for that object which are compatible with respect to
 * serialization. If the reciever has loaded a class for the object that has
 * different UID than that of corresponding sender’s class, the Deserialization
 * will result in an InvalidClassException.
 * 
 * A Serializable class can declare its own UID explicitly by declaring a field
 * name. It must be static, final and of type long.
 * 
 * i.e- ANY-ACCESS-MODIFIER static final long serialVersionUID=42L;
 * 
 * If a serializable class doesn’t explicitly declare a serialVersionUID, then
 * the serialization runtime will calculate a default one for that class based
 * on various aspects of class, as described in Java Object Serialization
 * Specification. However it is strongly recommended that all serializable
 * classes explicitly declare serialVersionUID value, since its computation is
 * highly sensitive to class details that may vary depending on compiler
 * implementations, any change in class or using different id may affect the
 * serialized data.
 * 
 * It is also recommended to use private modifier for UID since it is not useful
 * as inherited member.
 * 
 * serialver: The serialver is a tool that comes with JDK. It is used to get
 * serialVersionUID number for Java classes. You can run the following command
 * to get serialVersionUID
 *
 * i.e. serialver [-classpath classpath] [-show] [classname…]
 * 
 * 
 * transient variables:- A variable defined with transient keyword is not
 * serialized during serialization process.This variable will be initialized
 * with default value during deserialization. (e.g: for objects it is null, for
 * int it is 0).
 * 
 * 
 * static Variables:- A variable defined with static keyword is not serialized
 * during serialization process.This variable will be loaded with current value
 * defined in the class during deserialization.
 * 
 * 
 * 
 * @author karth
 *
 */
class SerializeEmp implements Serializable {

	private static final long serialversionUID = 129348938L;

	transient int transitValue;
	static int staticValue;
	String name;
	int age;

	public SerializeEmp(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.transitValue = a;
		this.staticValue = b;
	}

}

/**
 * @author karth
 *
 */
public class SerializeWithTransitentAndStatic {

	public static void printdata(SerializeEmp emp) {
		System.out.println("name = " + emp.name);
		System.out.println("age = " + emp.age);
		System.out.println("a = " + emp.transitValue);
		System.out.println("b = " + emp.staticValue);
	}

	public static void main(String[] args) {

		SerializeEmp sralEmp = new SerializeEmp("Karthik", 20, 2, 1000);
		String filename = "serialize.txt";

		// Serialization
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(sralEmp);

			out.close();
			file.close();
			System.out.println("Object has been serialized and Data before Deserialization.");
			printdata(sralEmp);

			// value of static variable changed
			sralEmp.staticValue = 2000;
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		SerializeEmp dsralEmp = null;

		// Deserialization
		try {

			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			dsralEmp = (SerializeEmp) in.readObject();

			in.close();
			file.close();
			System.out.println("Object has been deserialized and Data after Deserialization.");
			printdata(dsralEmp);

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}
}
