package linkedList;

public class LinkedListLength {
      private Node head;
      public LinkedListLength() {
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
      public int printLength() {
    	  int count = 0;
    	  Node temp = head;
    	  while(temp != null) {
    		  temp = temp.next;
    		  count++;
    	  }
    	  return count;
      }
      
	public static void main(String[] args) {
		LinkedListLength list = new LinkedListLength();
		list.insert(5);
		list.insert(8);
		list.insert(9);
		list.insert(15);
		System.out.println(list.printLength());

	}

}
