package oopConceptPart1;

public class StaticAndNonStaticConcept5 {

	//Global variables: The scope of global variables will be available across all the functions with some conditions(static and not static)
	String name = "Itachi";//non-static global var
	static int age = 25;//static global var

	public static void main(String[] args) {
		//## How to call static method and variables:
		//1. Direct calling:
		workbook();
		System.out.println(age);
		//2. Calling by classname:
		StaticAndNonStaticConcept5.workbook();
		System.out.println(StaticAndNonStaticConcept5.age);

		//## How to call non-static methods and variables
		//To call non-static method pr vars, we need to create object first
		StaticAndNonStaticConcept5 obj = new StaticAndNonStaticConcept5();
		obj.notebook();
		System.out.println(obj.name);

		//##Can i access static method using object reference:?
		obj.workbook();//Yes I can access but warning will br given
	}
	public void notebook() {
		System.out.println("Non-static method");
	}
	public static void workbook() {
		System.out.println("Static method");
	}

}
