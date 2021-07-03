package BasicJava;

public class OneDimensionalArrayInJava6 {
	
	public static void main(String[] args) {
		
		//1. Int array:
		int i[] = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		System.out.println(i.length);
		System.out.println(i[2]);
		//System.out.println(i[3]);//ArrayIndexOutOfBoundsException
		
		for(int x=0; x<i.length; x++) {
			System.out.println(i[x]);
		}
		//2. Double array:
		double d[] = new double[2];
		d[0] = 10.11;
		d[1] = 20.22;
		System.out.println(d[0]);
		System.out.println(d.length);
		for(int y=0; y<d.length; y++) {
			System.out.println(d[y]);
		}
		//3. char array:
		char c[] = new char[2];
		c[0] = 'A';
		c[1] = '$';
		System.out.println(c.length);
		
		//4. Boolean array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);
		
		//5. String array:
		String s[] = new String[3];
		s[0] = "Hello";
		s[1] = "World";
		s[2] = "Tom";
		System.out.println(s[2]);
		
		//Object array:
		Object ob[] = new Object[4];
		ob[0] = "Itachi";
		ob[1] = 'M';
		ob[2] = 1000;
		ob[3] = 100.11;
		System.out.println(ob[3]);
	}

}
