package in.cdac;

public class LinkedList {
	Node start;
	Node end;
	Node current;
	int maxCount;
	
	//Adding a Node into LinkedList
	public void add(Object data) {
		Node tmpNode = new Node(data);
		if(start==null) {
			start = end = current = tmpNode;
		}
		else {
			end.next = tmpNode;
			tmpNode.previous = end;
			end = tmpNode;
		}
		maxCount++;
	}
	
	//Deleting a Node from LinkedList (Specific Index)
	
	public void delete(int index) {
		if(start == null || index > maxCount-1) {
			return;
		}
		
		if(start == end) {
			start = end = current = null;
		} else if(index == 0) {
			start = start.next;
			start.previous = null;
		}
		else if(index == maxCount-1) {
			end = end.previous;
			end.next=null;
		}
		else {
			Node tmpNode = start;
			
			for(int iTmp=0; iTmp<index-1;iTmp++, tmpNode = tmpNode.next);
				
			tmpNode.previous.next = tmpNode.next;
			tmpNode.next.previous = tmpNode.previous;
			tmpNode = null;
		}
		maxCount--;
	}
	
	//Accessing First Node of the ListedList
	public Object getFirst() {
		if(start == null) {
			return null;
		}
		current = start;
		return current.data;
	}
	
	//Accessing Last Node of the ListedList
	public Object getLast() {
		if(start == null) {
			return null;
	     }
		current = end;
		return current.data;
	}
	
	//Accessing previous Node
	public Object getPrevious() {
		if(start == null || current == start) {
			return null;
	     }
		current = current.previous;
		return current.data;
	}
	
	//Accessing previous Node
	public Object getNext() {
		if(start == null || current == end) {
			return null;
	     }
		current = current.next;
		return current.data;
	}
	
	public int getMaxCount() {
		return maxCount;
	}
	//	public Node deepCopy(Node head) {
//	    if (head == null) 
//	    	return null;
//	    Node newHead = new Node(head.data);
//	    Node newCurrent = newHead;
//	    Node oldCurrent = head.next;
//	    
//	    while (oldCurrent != null) {
//	        newCurrent.next = new Node(oldCurrent.data);
//	        newCurrent = newCurrent.next;
//	        oldCurrent = newCurrent.next;
//	    }
//	    return newHead;
//	}

}
























