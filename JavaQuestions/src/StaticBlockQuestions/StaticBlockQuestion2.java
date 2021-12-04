package StaticBlockQuestions;

public class StaticBlockQuestion2 {
	
	/*
	 * Q2. How can we run a java program without making any object?
	 * Q3. Similarity and Difference between static block and static method?
	 */
	
	static {//static block: once the class is loaded static block will be stored
		System.out.println("static block");
	}
	public static void test() {//static method: method has to call from main method
		System.out.println("testing method");
	}
	public static void cover() {
		System.out.println("Cover mehtod");
		test();//we can call test() method inside another static method
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		test();
		StaticBlockQuestion2.test();//we can call sattic method by using class name
		
		cover();
	}

}
