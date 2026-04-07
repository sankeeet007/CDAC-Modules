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
	
	public int getHead() {
		return head.data;
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
