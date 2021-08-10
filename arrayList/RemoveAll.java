package arrayList;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(36);
		list.add(24);
		ArrayList<Integer> Rlist = new ArrayList<Integer>();
		Rlist.add(36);
		list.removeAll(Rlist);
		System.out.println(list);

	}

}
