package linkedList;

public class InsertNode {
	private Node head;
	public InsertNode() {
		this.head = null;
	}
	public Node InsertNode(int data) {
		if(head == null) {
			head = new Node(data);
		}
		else {
			Node node = head;
			while(node.next != null) {
				node =node.next;
			}
			node.next = new Node(data);
		}
		return head;
	}
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		InsertNode list = new InsertNode();
		list.InsertNode(4);
		list.InsertNode(7);
		list.InsertNode(8);
		list.print();
	}

}
