package in.cdac;

public class Node {
	
	Object data;  //Object is a Top level class in java (All classes are inherited from Object class in java)
	Node previous;	
	Node next;
	
	public Node(Object tmp) {
		data = tmp;
	}
}
