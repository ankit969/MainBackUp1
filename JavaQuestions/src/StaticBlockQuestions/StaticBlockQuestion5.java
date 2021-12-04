package StaticBlockQuestions;

public class StaticBlockQuestion5 {
	
	/*
	 * Q6. Can we initialize member variables within static block?
	 * Ans: By creating object of the class, we can initialize the member variables.
	 */
	
	String name;
	static int age;
	static {
		StaticBlockQuestion5 e1 = new StaticBlockQuestion5();
		e1.name = "Itachi";
		age = 28;
		
		System.out.println(e1.name + " " +age);
	}
	
	public static void main(String[] args) {
		
	}

}
