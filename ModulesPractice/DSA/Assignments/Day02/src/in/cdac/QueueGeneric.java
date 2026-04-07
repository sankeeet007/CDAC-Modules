package in.cdac;

public interface QueueGeneric<T> {
	
	public void enqueue(T data) throws Exception;
	public T dequeue() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
}
