package oopConceptPart1;

public class Car2 {
	int model;
	int wheel;
	
	public static void main(String[] args) {
		//Car2 is a class
		
		Car2 a = new Car2();
		Car2 b = new Car2();
		Car2 c = new Car2();
		
		a.model = 2015;
		a.wheel = 4;
		b.model = 2014;
		c.wheel = 4;
		
		System.out.println("Before assigning the reference");
		System.out.println(b.model);
		System.out.println(c.wheel);
		
		a = b;
		b = c;
		c = a;
		
		a.model = 100;
		System.out.println(a.model);//100
		c.model = 200;
		System.out.println(a.model);//200
		System.out.println(c.model);//200
	}

}
