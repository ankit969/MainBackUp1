package InterfaceConceptOOP2;

public class HDFCBank implements IndiaBank, RussiaBank{//Is-a relationship. We are achieving multiple inheritance.
	
	public void Adhar() {
		System.out.println("India -- Adhar");
	}
	public void Gareeb() {
		System.out.println("India -- Gareeb");
	}
	public void DebitCard() {//Overriding method from RussiaBank
		System.out.println("HDFC -- Debit");
	}
	public void CreditCard() {
		System.out.println("Russia -- Credit");
	}
	public void Loan() {
		System.out.println("HDFC -- Loan");
	}

}
