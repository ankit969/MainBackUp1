package ISARelationship;

public class HSBCBank implements UKBank, RussiaBank{
	
	public void debit() {
		System.out.println("UKBank -- Method");
	}
	public void credit() {
		System.out.println("UKBank -- Method");
	}
	public void tranferMoney() {
		System.out.println("UKBank -- Method");
	}
	public void mutualFunds() {
		System.out.println("RussiaBank -- Method");
	}
	public void Stock() {
		System.out.println("HSBCBank -- Method");
	}

}
