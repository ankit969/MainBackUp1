package OOPConceptPart1;

public class StaticAndNonStaticMethod5 {
	
	public static void main(String[] args) {
		StaticAndNonStaticMethod5 obj = new StaticAndNonStaticMethod5();
		
		//sum();
		//StaticAndNonStaticMethod.sum();
		obj.sum();
		obj.test();
	}
	public void test() {
		System.out.println("Non-Static method is called");
	}
	public static void sum() {
		System.out.println("Static method is called");
	}

}
