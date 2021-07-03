package Java;

import java.util.Hashtable;

public class hashTableInJava9 {
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		//h.put(10, "Hello");
		h.put('A', 200);
		System.out.println(h.get(10));
		System.out.println(h.get('A'));
		
		//h.remove(10);
		//System.out.println(h.get(10));
	}

}
