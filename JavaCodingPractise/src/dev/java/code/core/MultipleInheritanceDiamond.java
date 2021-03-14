package dev.java.code.core;

interface I {
	void foo();
}

class A implements I {

	@Override
	public void foo() {
	}

}

class B implements I {

	@Override
	public void foo() {
	}

}

/*
 * class C extends A,B{
 * 
 * public void bar() { } }
 */
/**
 * 
 * Diamond Issue: While doing the extends the two classes which is implemets
 * same parent interface , it makes the diamond strucutre, it throess sysntax
 * error
 * 
 * @author karth
 *
 */
public class MultipleInheritanceDiamond extends A {

	public void bar() {
		super.foo();

	}

}
