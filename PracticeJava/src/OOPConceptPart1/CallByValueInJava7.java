package OOPConceptPart1;

public class CallByValueInJava7 {
	
	public static void main(String[] args) {
		CallByValueInJava7 obj = new CallByValueInJava7();
		int a = 10;
		int b = 20;
		
		obj.sum(a, b);
	}
	public void sum(int x, int y) {
		 x = 30;
		 y = 40;		
		int z = x+y;
		System.out.println(z);
	}

}
