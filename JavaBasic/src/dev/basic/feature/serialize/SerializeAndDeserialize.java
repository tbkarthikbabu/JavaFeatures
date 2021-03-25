package dev.basic.feature.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * Serializable is a marker interface (has no data member and method). It is
 * used to “mark” java classes so that objects of these classes may get certain
 * capability. Other examples of marker interfaces are:- Cloneable and Remote.
 * 
 * Advantages of Serialization
 * <li>1. To save/persist state of an object.
 * <li>2. To travel/pass an object across a network.
 * 
 * Points to remember
 * <li>1. If a parent class has implemented Serializable interface then child
 * class doesn’t need to implement it but vice-versa is not true.
 * <li>2. Only non-static data members are saved via Serialization process.
 * <li>3. Static data members and transient data members are not saved via
 * Serialization process.So, if you don’t want to save value of a non-static
 * data member then make it transient.
 * <li>4. Constructor of object is never called when an object is deserialized.
 * <li>5. Associated objects must be implementing Serializable interface.
 * 
 * 
 * @author karth
 *
 */
class SerializedClass implements java.io.Serializable {

	public int a;
	public String b;

	public SerializedClass(int a, String b) {
		this.a = a;
		this.b = b;
	}

}

/**
 * 
 * Serialization is a mechanism of converting the state of an object into a byte
 * stream.
 * 
 * Deserialization is the reverse process where the byte stream is used to
 * recreate the actual Java object in memory. This mechanism is used to persist
 * the object.
 * 
 * @author karth
 *
 */
public class SerializeAndDeserialize {

	public static void main(String[] args) {

		SerializedClass sralObj = new SerializedClass(1, "Java");

		String fileName = "serilize.ser";

		// Serialization process is saving the object into a file
		try {
			// Saving of object in a file
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(sralObj);
			out.close();
			file.close();

			System.out.println("Object has been serialized");
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		SerializedClass deSralObj = null;

		// Deserialization process is readObject from file and convert into object
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			deSralObj = (SerializedClass) in.readObject();
			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + deSralObj.a);
			System.out.println("b = " + deSralObj.b);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}
}
