package OOPConceptPart1;

public class ObjectReferenceVaraible1 {
	int model;
	int wheel;
	
	public static void main(String[] args) {
		
		ObjectReferenceVaraible1 a = new ObjectReferenceVaraible1();
		ObjectReferenceVaraible1 b = new ObjectReferenceVaraible1();
		ObjectReferenceVaraible1 c = new ObjectReferenceVaraible1();
		
		a.model = 2020;
		a.wheel = 6;
		
		b.model = 2021;
		b.wheel = 8;
		
		c.model = 2022;
		c.wheel = 10;
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
	}

}
