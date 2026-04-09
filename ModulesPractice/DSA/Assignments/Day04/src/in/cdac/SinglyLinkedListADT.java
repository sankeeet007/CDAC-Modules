package in.cdac;

public class SinglyLinkedListADT implements List {
	public class Node {
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	
	public SinglyLinkedListADT() {
		this.head = null;
		this.tail = null;
	}
	
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	@Override
	public void addFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		
		if (tail == null) {
			tail = head;
		}
	}

	@Override
	public void addLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(isEmpty()) {
			head = newNode;
			tail = newNode;			
		}
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public int deleteFirst(){
		if(head == null) {
			throw new RuntimeException("The list is Empty. ");
		}
		Node deletedNode = head;
		head = head.next;
		if(isEmpty()) {
			tail = null;
		}
		return deletedNode.data;
	}
	
	@Override
	public int deleteLast(){
		if(isEmpty()) {
			throw new RuntimeException("The List is Empty");
		}
		Node deletedNode = tail;
		Node tmpNode = head;
		while(tmpNode.next != tail) {
			tmpNode = tmpNode.next;
		}
		tail = tmpNode;
		tmpNode.next = null;
		
		return deletedNode.data;
	}
	
	// Deletion for the first occurrence
	public int deleteByValue(int value) {
		if(isEmpty()) {
			throw new RuntimeException("LinkedList is Empty.");
		}
		Node SearcherNode = head;
		if(head.data == value) {
			int deletedValue = head.data;

			deleteFirst();
			return deletedValue;
		}
		while(SearcherNode.next.data != value) {
			SearcherNode = SearcherNode.next;
			if(SearcherNode.next == null) {
				throw new RuntimeException("Data NOT found.");
			}
		}
		int deletedValue = SearcherNode.next.data;
		SearcherNode.next  = SearcherNode.next.next;
		return deletedValue;
	}
	
	// Deleting all the occurrences of value 
	public void deleteAll(int value) {
		if(isEmpty()) {
			throw new RuntimeException("LinkedList is Empty.");
		}
		Node SearcherNode = head;

		while(SearcherNode != null) {
			if(SearcherNode.data == value) {
				deleteByValue(SearcherNode.data);
			}
			SearcherNode = SearcherNode.next;
		}
	}
	
	public boolean searchValue(int value) {
		
		Node SearcherNode = head;
		if(head.data == value) {
			return true;
		}
		if(tail.data == value) {
			return true;
		}
		while(SearcherNode.next != null) {
			if(SearcherNode.data == value) {
				return true;
			}
			SearcherNode = SearcherNode.next;
			
		}
		return false;
	}
	
	public int getHead() {
		return head.data;
	}
	
	public int findMid() {
		if(isEmpty()) throw new RuntimeException("List is Empty.");
		Node FastNode = head;
		Node SlowNode = head;
		int i=0;
		while(FastNode != null) {
			i++;
			FastNode = FastNode.next;
			if(i % 2 == 0) {
				SlowNode = SlowNode.next;
			}
		}
		return SlowNode.data;
	}
	
	@Override
	public void displayList(){
		if(isEmpty()) {
			throw new RuntimeException("The List is Empty");
		}
		Node traversalNode = head; 
		while(traversalNode != null) {
			System.out.print(traversalNode.data + " ");
			traversalNode = traversalNode.next;
		}
		System.out.println();
	}
}
