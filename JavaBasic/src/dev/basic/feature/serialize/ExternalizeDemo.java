package dev.basic.feature.serialize;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 
 * it's manatory no arg constructor with public access specifier for serialize
 * and deserialize the object
 * 
 * @author karth
 *
 */
public class ExternalizeDemo {

	public static void main(String[] args) {

		Car car = new Car("Swift", 2021);
		Car exterCar = null;

		try {
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("ExternalizeDemo.txt"));
			out.writeObject(car);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ObjectInput in = new ObjectInputStream(new FileInputStream("ExternalizeDemo.txt"));
			exterCar = (Car) in.readObject();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(car);
		System.out.println(exterCar);

	}

}

class Car implements Externalizable {

	static int age;
	String name;
	int year;

	public Car() {
		System.out.println("default construtor");
	}

	Car(String name, int year) {
		this.name = name;
		this.year = year;
		age = 10;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(year);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		year = in.readInt();
		age = in.readInt();
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", year=" + year + "]";
	}

}
