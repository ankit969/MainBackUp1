package practice16;

public class OOPConcept1 {
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		OOPConcept1 a = new OOPConcept1();
		OOPConcept1 b = new OOPConcept1();
		OOPConcept1 c = new OOPConcept1();
		//new OOPConcept1(): It is the object of the class
		//new keyword is used to create a object
		// a,b,c are the object reference variable or name
		a.mod=2016;
		a.wheel=2;
		b.mod=2018;
		b.wheel=4;
		c.mod=2020;
		c.wheel=6;
		System.out.println("Before assiging the references");
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		System.out.println("After assiging the references");
		a=b;//a=2018
		b=c;//b=2020
		c=a;//c=2018
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
	}

}
