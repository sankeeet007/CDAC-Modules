package in.cdac;

public interface Queue<T> {
	
	public void enqueue(T data) throws Exception;
	public T dequeue() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
}
