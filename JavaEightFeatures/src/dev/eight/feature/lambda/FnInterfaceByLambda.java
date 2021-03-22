package dev.eight.feature.lambda;

/**
 * 
 * Lambda function is used to do the implementation logic of FunctionalInterface
 * abstract method
 * 
 * @author karth
 *
 */
public class FnInterfaceByLambda {

	public static void main(String[] args) {

		// funactional interface implmentation login is done by using lambda expr, so
		// that only one absract method should be in functional interface
		FirstFunctionalInterface interObj = (x) -> System.out.println(2 * x);

		// Reference of the funcational interface to call the abstract methods
		interObj.abstractMed(10);

		FirstFunctionalInterface.normalMed();

		interObj.defaultMed();

		interObj.defaultMed2();
	}
}

/**
 * 
 * Functional Interface: Not allow to create the multiple abstract method, it
 * should be only one absrtace method in the interface --> not accept like void
 * abstractMed2(int x);
 * 
 * can add n no. of default methods in functional interface. default methods are
 * defined methods.
 * 
 * @author karth
 *
 */
@FunctionalInterface
interface FirstFunctionalInterface {

	void abstractMed(int x);

	static void normalMed() {
		System.out.println("Hello");
	}

	default void defaultMed() {
		System.out.println("hi");
	}

	default void defaultMed2() {
		System.out.println("hi2");
	}

}
