package OOPConceptPart1;

public class MethodOverloadingInJava4 {
	
	public static void main(String[] args) {
		MethodOverloadingInJava4 obj = new MethodOverloadingInJava4();
		
		main(10);
		main(20, 30);
		
		obj.test();
		obj.test(50);
		obj.test(100.00);
		obj.test(50, 50);
	}
    public static void main(int z) {
     	System.out.println("Print main method with different argument");
     	System.out.println(z);
    }
    public static void main(int x, int y) {
    	System.out.println("Print main method with multiple arguments");
    	System.out.println(x+y);
    }
    public void test() {
    	System.out.println("Zero Parameter for test method");
    }
    public void test(int a) {
    	System.out.println("onr parameter for test method");
    	System.out.println(a);
    }
    public void test(double b) {
    	System.out.println("one parameter but different datatype for test method");
    	System.out.println(b);
    }
    public void test(int c, int d) {
    	System.out.println("two parameter for test method");
    	System.out.println(c+d);
    }

}
