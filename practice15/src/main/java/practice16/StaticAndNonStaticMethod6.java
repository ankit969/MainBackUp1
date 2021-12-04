package practice16;

public class StaticAndNonStaticMethod6 {
	String x = "Itachi";//non static global variable
	static int age =25;//static global variable
	
	public static void main(String[] args) {
		System.out.println(age);
		
		//To call non static variable, we need to create object of the class
		StaticAndNonStaticMethod6 st = new StaticAndNonStaticMethod6();
		System.out.println(st.x);
		
		staticMethod();
		st.nonStaticMethod();
	}
	
	//1. static method:
	public static void staticMethod() {
		int a =10;
		int b =20;
		int c = a+b;
		System.out.println(c);
	}
	//2. non static method:
	public void nonStaticMethod() {
		int r = 100;
		int j = 200;
		int k = r+j;
		System.out.println(k);
	}
	

}
