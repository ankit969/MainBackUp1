package ConstructorConcept;

public class B extends A{
	
	public B() {
		super();
	}
	public B(int i) {
		super(i);
	}
	public B(int i, int j) {
		super(i,j);
	}
	
	public static void main(String[] args) {
		B obj1 = new B();
		B obj2 = new B(10);
		B obj3 = new B(20,30);
	}
	//"super" keyword is used to call the parent class constructor
	//"super" keyword is used as a first statement into the child class constructor
	//multiple super keyword can not be used into one child class constructor, we have to create individual
	//constructor to use super() keyword

}
