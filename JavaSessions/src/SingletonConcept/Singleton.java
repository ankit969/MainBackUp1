package SingletonConcept;

public class Singleton {
	
	//In OOP, a singleton class is a class that can have only once object(instance of the class) at a time.
	//How to design singleton class:
	//1.make constructor as private
	//2.write a public static method(getInstance) that has return type of object of this 
	//singleton class(Lazy initialization)
	
	private static Singleton Singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "Hey I am using Singleton class pattern";
	}
	public static Singleton getInstance() {//Lazy initialization
		if(Singleton_instance==null)
			Singleton_instance = new Singleton();
		return Singleton_instance;
	}
	
	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}
	//IMP: If we try to create multiple objects then these objects will point to the same(first) object always.
	//for normal class we use constructor whereas for Singleton class we use getInstance() method for 
	//initialization

}
