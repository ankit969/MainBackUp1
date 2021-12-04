package practice16;

public class OneDimensionalArray4 {
	
	public static void main(String[] args) {
		//1. int Array:
		int i[] = new int[2];
		i[0] = 10;
		i[1] = 20;
		//System.out.println(i[1]);
		//System.out.println(i.length);
		for(int j=0; j<i.length; j++) {
			//System.out.println(i[j]);
		}
		//2. String array:
		String x[] = new String[3];
		x[0] = "A";
		x[1] = "B";
		x[2] = "C";
		//System.out.println(x[2]);
		//System.out.println(x.length);
		for(int k=0; k<x.length; k++) {
			//System.out.println(x[k]);
		}
		//3. Object:
		Object obj1[] = new Object[4];
		obj1[0] = 100;
		obj1[1] = 'c';
		obj1[2] = true;
		obj1[3] = "Itachi";
		System.out.println(obj1[2]);
		System.out.println(obj1[1]);
		for(int a=0; a<obj1.length; a++) {
			System.out.println(obj1[a]);
		}
	}

}
