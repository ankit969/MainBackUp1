package HasARelationship;

public class Test {
	
	public static void main(String[] args) {
		BMW a = new BMW();
		a.Engine();
		a.Petrol();
		a.Safety();
		
		Car b = new Car();
		b.Engine();
		b.Petrol();
		
		//Top Casting
		Car c = new BMW();
		c.Engine();
		c.Petrol();
		
		//Down Casting:
		BMW d = (BMW) new Car();
		d.Petrol();//ClassCastException in runtime
		d.Safety();//ClassCastException in runtime
	}

}
