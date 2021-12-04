package ConstructorConcept;

public class A {
	
	public A() {
		System.out.println("Parent class constructor");
	}
	public A(int i) {
		System.out.println("Parent class constructor with value i: "+i);
	}
	public A(int i, int j) {
		System.out.println("Parent class constructor with value i: "+i);
		System.out.println("Parent class constructor with value j: "+j);
	}

}
