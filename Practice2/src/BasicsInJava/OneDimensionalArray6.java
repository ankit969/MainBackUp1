package BasicsInJava;

public class OneDimensionalArray6 {
	
	public static void main(String[] args) {
		//all types of array
		
		//int Array:
		int i[] = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		System.out.println(i[0]);
		System.out.println(i.length);
		//for loop to get the values if Index
		for(int a=0; a<i.length; a++) {
			System.out.println(i[a]);
		}
		//char
		//double
		//boolean
		//String
			
		Object ob[] = new Object[4];
		ob[0] = "Itachi";
		ob[1] = 'A';
		ob[2] = 10;
		ob[3] = 20.44;
		
		System.out.println(ob[0]);
		System.out.println(ob.length);
		}
	}


