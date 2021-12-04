package Questions;

public class NullConcept {
	// null is case sensitive because it is a keyword and keywords aee always
	// written in small letters

	static Object obj;// object class
	static String str;// Default class
	static NullConcept nc;// custom class

	// Default value of any class will be null

	public static void main(String[] args) {

		// 1. case sensitive:
		// Object obj = null;//can not wtire NULL or Null because keyword are always
		// written in small letters

		//2. Default reference value will be null
//		System.out.println(obj);
//		System.out.println(str);
//		System.out.println(nc);
		
		//3.
//		Integer i = null;
//		int j = i;//java.lang.NullPointerException
		//if a null value is assigned to a primitive data type then it gives "java.lang.NullPointerException" error
		
		//4. instanceOf operator:
		Integer i = null;
		Integer j = 10;
		
		System.out.println(j instanceof Integer);//true
		System.out.println(i instanceof Integer);//false
		
		//5. static vs non-static
		NullConcept obj = null; //object is refering to null
		
		//obj.send();//it will give null pointerexception because non static methos is allocated to object of the class and here object is null
		obj.sum();//static method can be called bacuse static method or varaible does not allocate to object of a class
		
		//6. wrapper
		String str = null;
		Integer i1 = null;
		Double d = null;
		
		//7. TypeCasting
		String s1 = (String) null;
		System.out.println(s1+ "123");
		System.out.println(s1+ "Hello");
		//System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		
		Integer i2 = (Integer)null;
		Double d2 = (Double)null;
	}
	
	public static void sum() {
		System.out.println("sum---");
	}
	public void send() {
		System.out.println("send---");
	}

}
