package StaticBlockQuestions;

public class StaticBlockQuestion4 {
	
	/*
	 * Q5. Is it possible to compile and run a Java program without writing main() method?
	 */
	
	static int age = 20;
	
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	static {
		System.out.println("static block3");
	}

}
