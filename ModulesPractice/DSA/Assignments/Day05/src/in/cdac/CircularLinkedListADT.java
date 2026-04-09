package in.cdac;

public class CircularLinkedListADT implements CircularList {
	// Inner Class
	public class CircularNode{
		int data;
		CircularNode next;
		
	}
	
	CircularNode head = new CircularNode();
	
	public boolean isEmpty() {
		if(head == null) return true;
		return false;
	}
	
	@Override
	public void addFirst(int data) {
		if(isEmpty()) {
			
		}
		CircularNode newNode = new CircularNode();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		while(newNode.next != head) {
			newNode = newNode.next;
		}
		newNode.next = head;
	}

	@Override
	public void addLast(int data) {
		CircularNode newNode = new CircularNode();
		newNode = head;
		while(newNode.next != head) {
			newNode = newNode.next;
		}
		newNode.data = data;
		newNode.next = head;
	}

	@Override
	public int deleteFirst() {
		if(isEmpty()) throw new RuntimeException("List is Empty.");
		
		CircularNode deletedNode = head;
		head = head.next;
		return deletedNode.data;
	}

	@Override
	public int deleteLast() {
		if(isEmpty()) throw new RuntimeException("List is Empty.");
		
		CircularNode tmpNode = head;
		while(tmpNode.next != null) {
			tmpNode = tmpNode.next;
		}
		tmpNode = null;
		return 0;
	}

	public void deleteAll(int value) {
		if(isEmpty()) throw new RuntimeException("List is Empty.");
		
		CircularNode searcherNode = head;
		
		while(searcherNode.next != null) {
			if(head.data == value) head = head.next;
			if(searcherNode.next.data == value) {
				
			}
			searcherNode = searcherNode.next;
		}
		
	}

	public int search() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void displayList() {
		if(isEmpty()) throw new RuntimeException("List is Empty.");
		CircularNode tmpNode = head;
		while(tmpNode.next == head) {
			System.out.print(tmpNode.data + " ");
			tmpNode = tmpNode.next;
		}
	}
}
