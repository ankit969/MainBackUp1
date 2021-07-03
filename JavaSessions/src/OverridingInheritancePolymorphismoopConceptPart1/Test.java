package OverridingInheritancePolymorphismoopConceptPart1;

public class Test {
	
	public static void main(String[] args) {
		
		//static polymorphism - compile time polymorphism
		
		BMW b = new BMW();
		b.Start();//Overridden child class method will be called
		b.stop();
		b.theftSafety();
		b.reFuel();
		b.engine();
		System.out.println("****************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.reFuel();
		c.engine();
		System.out.println("*****************");
		
		//dynamic polymorphism or Runtime polymorphism
		//Top Casting:
		Car c1 = new BMW();//Child class object can be referred by Parent class reference variable is called dynamic polymorphism
		c1.start();
        c1.stop();
		c1.reFuel();
		
		//Down casting:
		BMW b1 = (BMW) new Car();//java.lang.ClassCastException during runtime
		//b1.theftSafety();
		//b1.stop();
		//b1.engine();
	}

}
