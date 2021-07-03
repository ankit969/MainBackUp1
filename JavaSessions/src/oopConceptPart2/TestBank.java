package oopConceptPart2;

public class TestBank {
	
	//Iterface concept with multiple Inheritance in Java
	public static void main(String[] args) {
		
		//Even if Interface vaiables are static in nature, we have to provide Interface name to call the function
		System.out.println(USBank.min_bal);
		
		//Can not create object for USBank or BrazilBank Interface
		//We can create object for class method(HSBCNank)
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.mutualFund();
		hs.educationLoan();
		hs.carLoan();
		
		//Dynamic Polymorphism:
		//child class object can be referred by parent Interface reference variable
		
		USBank b = new HSBCBank();//Dynamic Polymorphism
		b.credit();
		b.debit();
		b.transferMoney();
		
		BrazilBank c = new HSBCBank();//Dynamic Polymorphism
		c.mutualFund();
	}

}
