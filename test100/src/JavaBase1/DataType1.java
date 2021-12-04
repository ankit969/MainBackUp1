package JavaBase1;

public class DataType1 {

	public static void main(String[] args) {
		int a = 10;
		  int b = 20;
		  if(a>b){
		    System.out.println("a is greater than b");
		  }else{
		    System.out.println("b is greater than a");
			
		  }
		  //Nested if-else:
		  int x = 100;
		  int y = 300;
		  int z = 200;
		  if(x>y && x>z){
		     System.out.println("x is greatest");
		  }else if(y>x && y>z){
		     System.out.println("y is greatest");
		  }else{
		     System.out.println("z is greatest"); 
		  }
	}

}
