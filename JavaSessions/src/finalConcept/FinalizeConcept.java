package finalConcept;

public class FinalizeConcept {
	public void finalize() {
		System.out.println("finalized method");
	}
	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		f1=null;
		f2=null;
		System.gc();
	}
	//finalize is related to garbage collector.  finalized is used to pefrom clean up memory processing.
	//Just before the garbage collector automatically finalize method will be called just to clean up
	//processing of the object
	
	//IMP:
	//1.final is a keyword
	//2.finally is a block
	//3.finalize is a method

}
