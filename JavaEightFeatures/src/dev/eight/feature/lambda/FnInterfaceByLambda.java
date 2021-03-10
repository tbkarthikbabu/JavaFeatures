package dev.eight.feature.lambda;

/**
 * 
 * Lambda function is used to implementation of the FunctionalInterface abstract
 * method
 * 
 * @author karth
 *
 */
public class FnInterfaceByLambda {

	public static void main(String[] args) {

		FirstFunctionalInterface interObj = (x) -> System.out.println(2 * x);
		interObj.abstractMed(10);

		interObj.normalMed();

		interObj.defaultMed();
	}
}

/**
 * 
 * functional method not allow to create the multiple abstract method with same
 * signature like void abstractMed2(int x);
 * 
 * can add n of default methods in functional interface
 * 
 * @author karth
 *
 */
@FunctionalInterface
interface FirstFunctionalInterface {

	void abstractMed(int x);

	default void normalMed() {
		System.out.println("Hello");
	}

	default void defaultMed() {
		System.out.println("hi");
	}

}
