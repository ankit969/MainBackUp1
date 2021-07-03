package HasARelationshipInJava;

public class Test {
	
	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.wheels();
		obj.Diesel();
		obj.Petrol();//method overriding
		obj.thefSafety();
		
		//DynamicPolymorphism:
		Vehicle obj2 = new BMW();
		obj2.chesis();
		obj2.wheels();
		
		//Top Casting:
		//Vehicle obj2 = new BMW();
		Car obj3 = new BMW();
		obj3.Petrol();
		
		//Down Casting:
		BMW obj4 = (BMW) new Car();
		obj4.thefSafety();//ClassCastException
	}

}
