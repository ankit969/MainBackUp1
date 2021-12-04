package StaticBlockQuestions;

public class StaticBlockQuestions3 {
	
	/*
	 * Q4. How can we create objects if we make the constructor private?
	 */
	
	int age;
	
	static {
		StaticBlockQuestions3 obj1 = new StaticBlockQuestions3();
	}
	public static int createObject() {
		StaticBlockQuestions3 obj1 = new StaticBlockQuestions3();
		obj1.age = 40;
		return obj1.age;
	}
	//By using static block and static method we can create object in another class
	
	
	private StaticBlockQuestions3() {//private constructor: it can be called within the class
		age = 30;
	}
	
	public static void main(String[] args) {
		StaticBlockQuestions3 obj = new StaticBlockQuestions3();
		System.out.println(obj.age);//we can call private constructor by using object within the class but not in other class 
	}

}
