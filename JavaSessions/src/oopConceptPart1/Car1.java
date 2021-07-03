package oopConceptPart1;

public class Car1 {
	int model;
	int wheel;

	public static void main(String[] args) {
		//Car1 is a Class

		Car1 a = new Car1();
		Car1 b = new Car1();
		Car1 c = new Car1();

		//"new Car1();"---> this is the Object of the Car1 class
		//"new" keyword is used to create the object
		//a,b,c ---> Object reference variable

		a.model = 2015;
		a.wheel = 4;
		b.model = 2014;
		b.wheel = 4;
		c.model = 2013;
		c.wheel = 4;

		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
	}

}
