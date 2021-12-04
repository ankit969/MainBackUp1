package Questions;

public class StringObject {

	public static void main(String[] args) {
		
		//Q. How many string objects will be created?
		//Ans: 3
		
		//In the heap memory 2 objects will created n1 and n2 and one string constant pool(SCP) will create where string "Hello world" will be
		//present(which is a one object) so total objects are 3
		
		String s1 = "Hello World";
	    String s2 = "Hello World";
	    String s3 = "Hello World";
	    
	    String n1 = new String("Hello World");
	    String n2 = new String("Hello World");
	    
	    System.out.println(s1==s2);
	    System.out.println(s1==s3);
	    System.out.println(s2==s3);
	    
	    System.out.println(n1==n2);
	    System.out.println(n1==s1);
	    System.out.println(n2==s1);
	}

}
