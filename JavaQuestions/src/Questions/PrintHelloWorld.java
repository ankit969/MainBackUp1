package Questions;

public class PrintHelloWorld {
	//"\n" is used to generate a new line
	
	public static void main(String[] args) {
		//print Hello World without using semi colon(;)
		
		//1.
		if(System.out.printf("Hello world" + "\n") == null) {
			
		}
		//2.
		if(System.out.append("Hello world" + "\n") == null) {
			
		}
		//3.
		if(System.out.append("Hello world" + "\n").equals(null)) {
			
		}
		//4.
		for(int i=0; i<1; System.out.println("Hello world")) {
			i++;
		}
	}

}
