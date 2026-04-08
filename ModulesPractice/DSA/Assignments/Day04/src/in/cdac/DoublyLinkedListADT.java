package in.cdac;


public class DoublyLinkedListADT implements DoublyList {
	public class DLLNode{
		int data;
		DLLNode next;
		DLLNode prev;
	}
	
	private DLLNode head;
	private DLLNode tail;
	
	public DoublyLinkedListADT() {
		this.head = null;
		this.tail = null;
	}
	
	private boolean isEmpty() {
	    return head == null;
	}
	
	@Override
	public void addFirst(int data) {
	
		DLLNode newNode = new DLLNode();
		newNode.data = data;
		newNode.next = head;
		newNode.prev = null;
		
		
		if (isEmpty()) {
	        tail = newNode; 
	    } else {
	        head.prev = newNode;
	    }
	    head = newNode;
	}

	
	@Override
	public void addLast(int data) {
	    DLLNode newNode = new DLLNode();
	    newNode.data = data;
	    newNode.next = null;

	    if (isEmpty()) {
	        newNode.prev = null;
	        head = newNode; 
	        tail = newNode;
	    } else {
	        newNode.prev = tail;
	        tail.next = newNode; 
	        tail = newNode;   
	    }
	}

	@Override
	public int deleteFirst() {
		if(isEmpty()) {
			throw new RuntimeException("The list is Empty.");
		}
		DLLNode newNode = head;
		head = head.next;
		head.prev = null;
		if(isEmpty()) {
			tail = null;
		}
		return newNode.data;
	}

	@Override
	public int deleteLast() {
	    if(isEmpty()) 
	    	throw new RuntimeException("The list is Empty.");
	    
	    int data = tail.data;
	    if (head == tail) {
	        head = tail = null;
	    } 
	    else {
	        tail = tail.prev;
	        tail.next = null;
	    }
	    return data;
	}
	@Override
	public int deleteByValue(int value) {
	    if (isEmpty()) 
	    	throw new RuntimeException("List is Empty.");

	    DLLNode current = head;

	    while (current != null && current.data != value) {
	        current = current.next;
	    }

	    if (current == null) 
	    	throw new RuntimeException("Value not found.");

	    if (current == head) 
	    	return deleteFirst();

	    if (current == tail) 
	    	return deleteLast();

	    current.prev.next = current.next;
	    current.next.prev = current.prev;

	    return current.data;
	}

	@Override
	public void deleteAll(int value) {
	    if (isEmpty()) 
	    	throw new RuntimeException("The list is empty.");
	    DLLNode current = head;
	    while (current != null) 
	    {
	        DLLNode nextNode = current.next; 
	        if(current.data == value) 
	        {
	            if(current == head) { 
	            	deleteFirst();
	            }
	            else if(current == tail) {
	            	deleteLast();
	            }
	            else {
	                current.prev.next = current.next;
	                current.next.prev = current.prev;
	            }
	        }
	        current = nextNode;
	    }
	}
	
	public int getHead() {
		return head.data;
	}
	
	
	public boolean searchValue(int value) {
	    DLLNode current = head;
	    while (current != null) 
	    { 
	        if (current.data == value) {
	            return true;
	        }
	        current = current.next;
	    }
	    return false;
	}
	
	
	@Override
	public void displayList() {
	    if (isEmpty()) {
	        throw new RuntimeException("List is empty.");
	    }
	    DLLNode current = head;
	    System.out.print("Forward:  ");
	    while (current != null) {
	        System.out.print(current.data + " ");
	        current = current.next;
	    }
	    System.out.println("NULL");
	}

	public void displayReverse() {
	    if (isEmpty()) return;
	    
	    DLLNode current = tail;
	    System.out.print("Backward: ");
	    while (current != null) {
	        System.out.print(current.data + " ");
	        current = current.prev;
	    }
	    System.out.println("NULL");
	}

	
}
