package StaticBlockQuestions;


/*
 * Q. Will static block for Test class execute in the following code?
 * Ans: Yes.
 */

class Test1{
	static {
		System.out.println("Test -- static block");
	}
	public final int x = 20;
}

public class StaticBlockQuestion7 {
	
	public static void main(String[] args) {
		System.out.println(new Test1().x);
	}
}
