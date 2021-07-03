package oopConceptPart2;

public interface USBank {
	
	//In Interface, we don't give method body(no need to declare method body)
	//No main method in Interface
	//In Interface, we can declare the variables. Variables are by default static in nature
	//Variables value will not be changed, its final/constant in nature
	//No static method in Interface
	//We can not create Object of the Interface
	//Interface  is abstract in nature
	
	//If a particular class is implementing an Interface, then we have to define all the Interface methods inside that particular class.
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();

}
