package OverridingInheritancePolymorphismoopConceptPart1;

public class BMW extends Car{//"has-a relationship"
	
	//When same method is present in Parent class as well as in child class with the same name and same number of arguments
	//is called "Method Overriding"
	
	public void Start() {//Overridden method
		System.out.println("BMW -- Start");
	}
	public void theftSafety() {
		System.out.println("BMW -- theft Safety");
	}

}
