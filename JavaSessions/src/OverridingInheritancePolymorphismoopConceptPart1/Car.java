package OverridingInheritancePolymorphismoopConceptPart1;

public class Car extends Vehicle{
	
	public void start() {
		System.out.println("Car -- Start");
	}
	public void stop() {
		System.out.println("Car -- Stop");
	}
	public void reFuel() {
		System.out.println("Car -- refuel");
	}

}
