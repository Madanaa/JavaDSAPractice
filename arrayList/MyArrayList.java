package arrayList;

import java.util.ArrayList;

 class Pair1<X,Y> {
	X x;
	Y y;
	
	public Pair1(X x, Y y) {
		this.x = x;
		this.y = y;
	}
	public void getPrint() {
		System.out.println(x+ " and "+y);
	}
}

public class MyArrayList {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Apple");
		a.add("mango");
		System.out.println(a);
      ArrayList <Integer> marks =new ArrayList<Integer>();
      
      Pair1<String, Integer> p = new Pair1<String, Integer>("Apple",32);
 	 Pair1<String, Boolean> p1 = new Pair1<String, Boolean>("Apple",true);
      p.getPrint();
      p1.getPrint();
	}

}
