package BasicJava;

public class IfElseConceptInJava3 {
	
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		//if-else(">" Operator)
		if(a>b) {
			System.out.println("a is greater than b");
		}else {
			System.out.println("b is greater than a");
		}
		//if-else("==" operator)
		if(a == b) {
			System.out.println("a and b are same");
		}else {
			System.out.println("a and b are not same");
		}
		
		//Which is Greatest(Nested loop)
		int x =600;
		int y = 200;
		int z = 300;
		
		if(x>y & x>z) {
			System.out.println("x is greatest");
		}else if(y>x & y>z) {
			System.out.println("y is greatest");
		}else {
			System.out.println("z is greatest");
		}
		
	}

}
