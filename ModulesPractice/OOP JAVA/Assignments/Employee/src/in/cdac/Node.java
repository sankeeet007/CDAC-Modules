package in.cdac;
//USING GENERICS
public class Node<T> {
	
	T data;  //Object<T> is a Top level class in java (All classes are inherited from Object class in java)
	Node<T> previous;	
	Node<T> next;
	
	public Node(T tmp) {
		this.data = tmp;
		this.previous = null;
	    this.next = null;
	}
}
