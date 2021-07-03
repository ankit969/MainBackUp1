package OOPConceptPart1;

public class AssigningReferenceInJava2 {
	int cost;
	int wheel;
	
	public static void main(String[] args) {
		AssigningReferenceInJava2 a = new AssigningReferenceInJava2();
		AssigningReferenceInJava2 b = new AssigningReferenceInJava2();
		AssigningReferenceInJava2 c = new AssigningReferenceInJava2();
		
		a.cost = 100;
		b.cost = 200;
		c.cost = 300;
		
		System.out.println("Before assigning the reference");
		System.out.println(a.cost);
		System.out.println(b.cost);
		System.out.println(c.cost);
		
		System.out.println("After assigning the reference");
		
		a = b;
		b = c;
		c = a;
		
		System.out.println(a.cost);
		System.out.println(b.cost);
		System.out.println(c.cost);
	}

}
