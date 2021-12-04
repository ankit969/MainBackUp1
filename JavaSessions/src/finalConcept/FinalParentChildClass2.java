package finalConcept;

public class FinalParentChildClass2 {
	
	public void start() {
		System.out.println("parent--start method");
	}

public class FinalchildClass{
	
	public void start() {
		System.out.println("child--start method");
	}
}
//Here start() method is overriding
//But if we use final keyword in parent class then it will give error
//"final" keyword is used to prevent inheritance and method and overriding.

}
