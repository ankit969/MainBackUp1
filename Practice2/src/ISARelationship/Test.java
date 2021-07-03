package ISARelationship;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(UKBank.min_Bal);
		
		HSBCBank x = new HSBCBank();
		x.credit();
		x.debit();
		x.mutualFunds();
		x.Stock();
		
		//Dynamic polymorphism:
		UKBank y = new HSBCBank();
		y.debit();
		y.credit();
		
		//Dynamic polymorphism:
		RussiaBank z = new HSBCBank();
		z.mutualFunds();
		
	}

}
