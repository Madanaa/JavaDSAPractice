package arrayList;

import java.util.ArrayList;
import java.util.List;

public class SetMthod {

	public static void main(String[] args) {
    List<Comparable> l = new ArrayList<Comparable>();
    
    l.add("My name");
    l.add(16);
   
    
    l.set(0, "Madan");
    
    System.out.println(l);

	}

}
