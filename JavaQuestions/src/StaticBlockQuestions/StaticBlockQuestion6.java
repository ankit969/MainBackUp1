package StaticBlockQuestions;

class Test {

	/*
	 * Q. Will the static block be executed in the following code? why? Ans: static
	 * block will not be executed, because compiler will not load the
	 * Test class. Compiler will see x =20 and it is static in
	 * nature which actually available in the metaspace inside the common memory
	 * allocation in the java memory and then without loading the
	 * Test class "StaticBlockQuestion6.x" will directly taken from
	 * common memory allocation , so no need to load the class unnecessary
	 * 
	 */

	static {
		System.out.println(" Test -- static block");
	}
	public static final int x = 20;

}

public class StaticBlockQuestion6 {
	public static void main(String[] args) {
		System.out.println(Test.x);
	}

}