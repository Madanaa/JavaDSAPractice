package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// ArrayList VS LinkedList Which take more comparing
public class LinkedListTimeCount {
         static void getTime(List<Integer> list) {
        	 
        	 long start =System.currentTimeMillis();
        	 for(int i = 0; i < 100000; i++) {
        		 list.add(0,i);
        	 }
        	 long end = System.currentTimeMillis();
        	 System.out.println(list.getClass().getName()+ " ---> " +(end-start));
         }
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		List<Integer> l = new LinkedList<Integer>();
		getTime(li);
		getTime(l);

	}

}
