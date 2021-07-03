package OOP1;

public class CallByReferenceInJava2 {
	int p;
	int q;
	public static void main(String[] args) {
		CallByReferenceInJava2 obj = new CallByReferenceInJava2();
		obj.p = 50;
		obj.q = 60;
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		//after swap:
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public void swap(CallByReferenceInJava2 t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}

}
