package linkedList;

public class MiddleElement {
	private Node head;
	public MiddleElement() {
		this.head = null;
	}
	public Node insert(int data) {
		if(head == null) {
			head = new Node(data);
		}
		else {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
 		}
		return head;
	}
  public void printMiddleElement() {
	  Node slow = head;
	  Node fast = head;
	  while(fast != null && fast.next != null) {
		  slow = slow.next;
		  fast = fast.next.next;
	  }
	  System.out.println("Middle element of linked lis is " +slow.data);
  }
  public void print() {
	  Node temp = head;
	  while(temp != null) {
		  System.out.println(temp.data);
		  temp =temp.next;
	  }
  }
	public static void main(String[] args) {
		MiddleElement list = new MiddleElement();
		list.insert(6);
		list.insert(5);
		list.insert(8);
		list.insert(9);
		list.insert(15);
		list.print();
		list.printMiddleElement();

	}

}
