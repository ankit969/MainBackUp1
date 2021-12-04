package ConstructorConcept;

public class Constructor {
	
	public Constructor() {
		System.out.println("Default constructor");
	}
	public Constructor(int i) {//overloading constructor
		System.out.println("sinle param constructor");
		System.out.println("the value of i: "+i);
	}
	public Constructor(int i, int j) {//overloading constructor
		System.out.println("two param constructor");
		System.out.println("the value of i: "+i);
		System.out.println("the value of j: "+j);
	}
	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		Constructor obj2 = new Constructor(10);
		Constructor obj3 = new Constructor(20,30);
	}

}
