package dev.java.design.pattern.creational.abstractfactory;

public class AbstractFactory {

	public static void main(String[] args) {
		System.out.println(SchoolFactory.eduStudent(Standard.UKG));
	}

}

enum Standard {
	LKG, UKG;
}

abstract class School {
	Standard st;

	public School(Standard st) {
		this.st = st;
	}

	abstract void educate();

}

class LKG extends School {

	public LKG(Standard st) {
		super(st);
		educate();
	}

	@Override
	void educate() {
		System.out.println("Studying LKG Standard...");
	}

}

class UKG extends School {

	public UKG(Standard st) {
		super(st);
		educate();
	}

	@Override
	void educate() {
		System.out.println("Studying UKG Standard...");
	}

}

class SchoolFactory {

	static School eduStudent(Standard standard) {
		School school = null;
		switch (standard) {
		case LKG:
			school = new LKG(standard);
			break;
		case UKG:
			school = new UKG(standard);
			break;
		default:
			break;
		}
		return school;
	}

}
