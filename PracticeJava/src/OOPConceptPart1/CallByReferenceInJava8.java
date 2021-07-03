package OOPConceptPart1;

public class CallByReferenceInJava8 {
	int p;
	int q;
	
	public static void main(String[] args) {
		CallByReferenceInJava8 obj = new CallByReferenceInJava8();
		obj.p = 10;
		obj.q = 20;
		System.out.println(obj.p);
		System.out.println(obj.q);
		System.out.println("Before swap method is called");
		
		obj.swap(obj);
		System.out.println("After swap method is called");
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public void swap(CallByReferenceInJava8 t) {
		int temp;
		temp = p;//temp=10
		p = q;//p=20
		q = temp;//q=10
	}

}
