package dev.eight.feature.lambda;

/**
 * 
 * @author karth
 *
 */
public class FnInterfaceTest {

	// Functional Interface inside the class and by-default its abstract
	interface FunInter1 {
		int operation(int x, int y);
	}

	interface FunInter2 {
		void sayMessgae(String msg);
	}

	// Method of the normal class and pass the reference of the functional interface
	int operate(int x, int y, FunInter1 fun1) {
		return fun1.operation(x, y);
	}

	public static void main(String[] args) {

		// funtional interface implementation logic, add the reference based on the
		// logic
		FunInter1 add = (x, y) -> x + y;

		FunInter1 multiple = (x, y) -> x * y;

		FnInterfaceTest test = new FnInterfaceTest();
		System.out.println(test.operate(1, 2, add));

		System.out.println(test.operate(2, 2, multiple));

		FunInter2 fun2 = (msg) -> System.out.println(msg + ",");
		fun2.sayMessgae("Dear");

	}

}
