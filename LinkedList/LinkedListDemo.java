package linkedList;

public class LinkedListDemo {
	Node head;
	void add(int data) {
		Node toadd = new Node(data);
		if(head == null) {
			head = toadd;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next =toadd;
	}
	boolean isEmpty() {
		return head == null;
	}

	static class Node {
		int data;
		Node next;
        public Node (int data) {
        	this.data = data;
        	next = null;
        }
	}
	void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
	}
	
	

}
