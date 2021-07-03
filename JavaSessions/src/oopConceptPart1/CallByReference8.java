package oopConceptPart1;

public class CallByReference8 {
	int p;
	int q;
	
	public static void main(String[] args) {
		CallByReference8 obj = new CallByReference8();
		
		obj.p = 50;
		obj.q = 60;
		System.out.println("Before swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		System.out.println("After swap");
		obj.swap(obj);//t = obj
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	//Call by Reference or Pass by reference
	public void swap(CallByReference8 t) {
		int temp;
		temp = t.p;//temp=50
		t.p = t.q;//t.p=60
		t.q = temp;//t.q=50
	}

}
