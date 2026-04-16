package in.cdac.Chaining;


public class LinkedList {
	Node head;

	public boolean isEmpty() {
		if(head == null) return true;
		return false;
	}
	
	public void add(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
	
		if(isEmpty()) {
			head = newNode;
		} else {
			Node curr = head;
			while(curr.next!=null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}
	
	public boolean search(int data) {
		if(isEmpty()) 	return false;
		Node searcherNode = head;
		while(searcherNode != null) {
			if(searcherNode.data == data) {
				return true;
			}
			searcherNode = searcherNode.next;
		}
		return false;
	}
	
	public String display() {
		String str = "";
		Node dispNode = head;
		while(dispNode != null) {
			str += dispNode.data + " <-> ";
			dispNode = dispNode.next;
		}
		str += " null";
		return str.toString();
	}
}
