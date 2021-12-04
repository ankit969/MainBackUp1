package Questions;

public class StaticBlockWithFinal {
	
	public static void main(String[] args) {
		System.out.println(Main.x);
	}

}

class Main{
	public static final int x = 100;
	
	static {
		System.out.println("Main-- class static block---");
	}
}

//If we put final in the Main class for static method then only final method will printed: 100
//If we remove final keyword then both static method will be printed: for example remove final keyword  and run the program