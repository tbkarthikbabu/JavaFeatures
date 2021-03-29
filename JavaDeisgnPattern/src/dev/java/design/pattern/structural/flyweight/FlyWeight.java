package dev.java.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Structural Design Pattern
 * 
 * provides ways to decrease object count so improving application required
 * objects structure.
 * 
 * Flyweight pattern is used when we need to create a large number of similar
 * objects (say 10^5).
 * 
 * One important feature of flyweight objects is that they are immutable. This
 * means that they cannot be modified once they have been constructed. *
 * 
 * Fix: to avoid the OutOfmemory Exception for reduce the memory usage.
 * 
 * Condition: Using the HashMap class, check the condition and reduces the
 * object creation of the same type and point the refernce to the same object
 * 
 * Usage: To reduce the no of objects creation
 * 
 * @author karth
 *
 */
public class FlyWeight {

	static String[] associates = { "Developer", "Tester" };

	static String[] tasks = { "Unit Testing", "Functiolity Testing", "Developement", "Analysis", "Deployment" };

	public static void main(String[] args) {

		// map size is 2, even if iterate upto 10, use the same object in hashmap
		for (int i = 0; i < 10; i++) {
			Associate asso = AssociateFactory.getAssociate(getRandomAssociate());
			asso.assignTask(getRandomTask());
			asso.goal();
		}

	}

	static String getRandomAssociate() {
		Random r = new Random();
		int index = r.nextInt(associates.length);
		return associates[index];
	}

	static String getRandomTask() {
		Random r = new Random();
		int index = r.nextInt(tasks.length);
		return tasks[index];
	}

}

class AssociateFactory {

	private static Map<String, Associate> mapAssociates = new HashMap<>();

	public static Associate getAssociate(String type) {

		Associate e;

		if (mapAssociates.containsKey(type)) {
			e = mapAssociates.get(type);
		} else {
			switch (type) {
			case "Developer":
				System.out.println("Developer Created");
				e = new Developer();
				break;

			default:
				System.out.println("Tester Created");
				e = new Tester();
				break;
			}
			mapAssociates.put(type, e);
		}

		System.out.println("map size->" + mapAssociates.size());

		return e;
	}
}

interface Associate {

	public void assignTask(String task);

	public void goal();

}

class Developer implements Associate {

	private String task;

	@Override
	public void assignTask(String task) {
		this.task = task;
	}

	@Override
	public void goal() {
		System.out.println("Developer Done - " + task);
	}

}

class Tester implements Associate {

	private String task;

	@Override
	public void assignTask(String task) {
		this.task = task;
	}

	@Override
	public void goal() {
		System.out.println("Tester Done - " + task);
	}

}
