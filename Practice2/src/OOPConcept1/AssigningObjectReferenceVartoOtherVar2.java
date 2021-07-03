package OOPConcept1;

public class AssigningObjectReferenceVartoOtherVar2 {
	int model;
	public static void main(String[] args) {
		AssigningObjectReferenceVartoOtherVar2 a = new AssigningObjectReferenceVartoOtherVar2();
		AssigningObjectReferenceVartoOtherVar2 b = new AssigningObjectReferenceVartoOtherVar2();
		AssigningObjectReferenceVartoOtherVar2 c = new AssigningObjectReferenceVartoOtherVar2();
		
		a.model = 100;
		b.model = 200;
		c.model = 300;
		System.out.println("Before assigning the car value to anoter var");
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		a = b;
		b = c;
		c = a;
		
		System.out.println("After assigning the var value to another val");
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
	}

}
