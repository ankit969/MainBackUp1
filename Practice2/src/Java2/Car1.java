package Java2;

public class Car1 {
	int model;
	int wheel;
	public static void main(String[] args) {
		Car1 a = new Car1();
		Car1 b = new Car1();
		Car1 c = new Car1();
		
		a.model = 100;
		b.model = 200;
		c.model = 300;
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		
		a=b;
		b=c;
		c=a;
		System.out.println("After assigning values");
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
	}

}
