package day_5;

import java.util.LinkedList;

public class LinkedListEx {
	Node head;
	class Node {
		int data;
		Node next;
		Node (int  d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<Integer>(); 
		obj.add(23);
       System.out.println(obj);
	}

}
