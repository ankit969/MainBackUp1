package Java;

public class OneDimensionalArray3 {
	
	public static void main(String[] args) {
		
		//int DataType:
		int i[] = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		System.out.println(i.length);
		System.out.println(i[1]);
		
		for (int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		char c[] = new char[3];
		double d[] = new double[3];
		boolean b[] = new boolean[2];
		String s[] = new String[4];
		
		Object obj[] = new Object[4];
		obj[0] = 100;
		obj[1] = "Hello";
		obj[2] = 'A';
		obj[3] = 15.55;
		System.out.println(obj.length);
		System.out.println(obj[2]);
	}

}
