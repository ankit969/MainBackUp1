package oopConceptPart2;

//"Is-a relationship" -- Interface and class relationship
//"has-s relationship" -- class to class relationship
public class HSBCBank implements USBank, BrazilBank{//"Is-a relationship"
	//We are achieving multiple Inheritance
	//If a class is Implementing any Interface then its mandatory to define/override all the methods of Interface 
	
	//USBank Method: Overriding from USBank
	public void credit() {
		System.out.println("hsbc -- credit");
	}
	public void debit() {
		System.out.println("hsbc -- debit");
	}
	public void transferMoney() {
		System.out.println("hsbc -- tranfer Monay");
	}
	
	//BrazilBank Method: Overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc -- mutual fund");
	}
	
	//Separate methods of HSBC bank
	public void educationLoan() {
		System.out.println("hsbc -- education loan");
	}
	public void carLoan() {
		System.out.println("hsbc -- car loan");
	}

}
