package PolymorphismInJava;

public class Test {

	public static void main(String[] args) {

		//Static polymorphism
		BMW b = new BMW();
		b.Engine();
		b.start();//Overridden method
		b.refuel();
        b.stop();
        b.theftysafe();
        
        Car c = new Car();
        c.Engine();
        c.start();
        
        //dynamic polymorphism
        //Top Casting:
        Car c1 = new BMW();
        c1.Engine();
        c1.start();
        
        //Down Casting
        BMW b1 = (BMW) new Car();//runtime exception ClassCastException
        b1.theftysafe();
	}

}
