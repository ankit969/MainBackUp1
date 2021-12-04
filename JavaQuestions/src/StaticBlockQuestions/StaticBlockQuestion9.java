package StaticBlockQuestions;

public class StaticBlockQuestion9 {
	
	/*
	 * Q2. What will be the output upon executing following class?
	 * Ans: It will load static block(the moment class is loaded) once the class is loaded, then it will print main method, then it will execute
	 *      Initialization  and then constructor 
	 */
	
	static {
		System.out.println("static blocm");
	}
	{
		System.out.println("Instance Initilaztion block");
	}
	StaticBlockQuestion9(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		new StaticBlockQuestion9();
	}
	

}
