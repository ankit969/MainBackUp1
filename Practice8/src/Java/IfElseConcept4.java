package Java;

public class IfElseConcept4 {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		if(x>y) {
			System.out.println("x is greater than y");
		}else {
			System.out.println("y is greater than x");
		}
		
		int a = 100;
		int b = 300;
		int c = 500;
		
		if(a>b && a>c) {
			System.out.println("a is greatest");
		}else if(b>a && b>c) {
			System.out.println("b is greatest");
		}else {
			System.out.println("c is greatest");
		}
	}

}
