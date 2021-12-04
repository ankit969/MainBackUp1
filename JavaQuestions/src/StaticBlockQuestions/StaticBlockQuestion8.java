package StaticBlockQuestions;

public class StaticBlockQuestion8 {
	
	/*
	 * Q1. What will be the output of executing following class?
	 * Ans: Once the class is loaded it will call static block and then call the main method, Here "Instance Initiallization" and "constructor"
	 * will not be called bacause they need objects to call. 
	 */
	
	static {
		System.out.println("static block");
	}
	{
		System.out.println(" Instance Initialization block");
	}
	
	StaticBlockQuestion8(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
	}

}
