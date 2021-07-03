package BasicsInJava;

import java.util.Hashtable;

public class HashtableinJava9 {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(1, "Tom");
		h.put('A', 200);
		System.out.println(h.size());
		System.out.println(h.get('A'));
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		Hashtable<String, Integer> h2 = new Hashtable<String, Integer>();
	}

}
