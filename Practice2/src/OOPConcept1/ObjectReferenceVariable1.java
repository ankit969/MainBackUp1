package OOPConcept1;

public class ObjectReferenceVariable1 {
	int model;
	int wheel;
	public static void main(String[] args) {
		
		ObjectReferenceVariable1 a = new ObjectReferenceVariable1();
		ObjectReferenceVariable1 b = new ObjectReferenceVariable1();
		ObjectReferenceVariable1 c = new ObjectReferenceVariable1();
		
		a.wheel = 4;
		b.wheel = 6;
		c.wheel = 8;
		
		System.out.println(a.wheel);
		System.out.println(b.wheel);
		System.out.println(c.wheel);
	}
	
	
}
