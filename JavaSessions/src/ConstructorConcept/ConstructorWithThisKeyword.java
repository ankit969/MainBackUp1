package ConstructorConcept;

public class ConstructorWithThisKeyword {
	//"this" keyword is used to initialize the class variable
	//if you are giving same name for local variable and global variable so to differentiate the variable
	//and calling the global variable we use "this" keyword
	
	//class variable(which are global):
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Itachi",29);
	}

}
