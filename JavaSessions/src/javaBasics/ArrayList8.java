package javaBasics;

public class ArrayList8 {
	//Learn ArrayList from another video or refer other channels to learn
	public static void main(String[] args) {
		java.util.ArrayList ar = new java.util.ArrayList();
		
		//In array list we don't create Indexes separately
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		System.out.println(ar.size());//Size/length of an array
		System.out.println(ar.get(1));//Index value
		
		ar.add(400);//3
		ar.add(500);//4
		System.out.println(ar.size());
		
		//In array, If we define Object then any DataType or String can be called from Object
		//In ArrayList we can define directly any DataType or String
		
		ar.add("Tom");//5
		ar.add("Hello");//6
		ar.add(12.33);//7
		ar.add('M');//8
		ar.add(600);//9
		System.out.println(ar.size());
		System.out.println(ar.get(6));
		
		ar.remove(9);
		System.out.println(ar.size());
		
		//Print the specific Index value:
		System.out.println(ar.get(5));
		System.out.println(ar.get(8));
		//System.out.println(ar.get(9));//IndexOutOfBoundsException
		
		//Print all the values for arrayList: use for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//Only Integer type ArrayList:
		java.util.ArrayList<Integer> ar2 = new java.util.ArrayList<Integer>();
		ar2.add(1000);//0
		ar2.add(2000);//1
		//ar2.add("Hello");//Can not take any other DataType or String except Integer
		System.out.println(ar2.size());
		
		//Only String type ArrayList:
		java.util.ArrayList<String> ar3 = new java.util.ArrayList<String>();
		ar3.add("Itachi");//0
		ar3.add("Uchiha");//1
		//ar3.add(3000);//Can not take any other DataType except String
		System.out.println(ar3.size());
	}

}
