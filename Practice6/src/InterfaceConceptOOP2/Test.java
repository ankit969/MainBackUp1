package InterfaceConceptOOP2;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(RussiaBank.min_bal);
		
		HDFCBank obj = new HDFCBank();
		obj.Adhar();
		obj.DebitCard();
		obj.CreditCard();
		obj.Loan();
		
		//Dynamic Polymorphism: Child class object can be referred by Parent Interface refernce varaible.
		IndiaBank obj1 = new HDFCBank();
		obj1.Adhar();
		
		//Dynamic polymorphism:
		RussiaBank obj2 = new HDFCBank();
		obj2.DebitCard();
		obj2.CreditCard();
		
	}

}
