package dev.java.design.pattern.creational.abstractfactory;

/**
 * 
 * Creational Design Pattern
 * 
 * Def: adding antoher layer of abstraction over the factory method
 * 
 * @author karth
 *
 */
public class AbstractFactoryDP {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.MICRO));
		System.out.println(CarFactory.buildCar(CarType.MINI));

	}

}

enum CarType {
	MICRO, MINI, SPORTS
}

enum Location {
	USA, INDIA
}

abstract class Car {

	CarType model;
	Location loc;

	public Car(CarType model, Location loc) {
		this.model = model;
		this.loc = loc;
	}

	abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + loc + "]";
	}

}

class MicroCar extends Car {

	public MicroCar(Location loc) {
		super(CarType.MICRO, loc);
		construct();
	}

	@Override
	void construct() {
		System.out.println("MicroCar");
	}

}

class MiniCar extends Car {

	public MiniCar(Location loc) {
		super(CarType.MINI, loc);
		construct();
	}

	@Override
	void construct() {
		System.out.println("MiniCar");
	}

}

class IndiaCarFactory {

	static Car buildCar(CarType model) {

		Car car;
		switch (model) {
		case MICRO:
			car = new MicroCar(Location.INDIA);
			break;
		default:
			car = new MiniCar(Location.INDIA);
			break;
		}
		return car;

	}

}

class UsaCarFactory {

	static Car buildCar(CarType model) {

		Car car;
		switch (model) {
		case MICRO:
			car = new MicroCar(Location.USA);
			break;
		default:
			car = new MiniCar(Location.USA);
			break;
		}
		return car;

	}

}

class CarFactory {
	private CarFactory() {
	}

	public static Car buildCar(CarType type) {
		Car car;

		Location indiaLoc = Location.INDIA;

		switch (indiaLoc) {
		case INDIA:
			car = IndiaCarFactory.buildCar(type);
			break;

		default:
			car = UsaCarFactory.buildCar(type);
			break;
		}

		return car;

	}
}