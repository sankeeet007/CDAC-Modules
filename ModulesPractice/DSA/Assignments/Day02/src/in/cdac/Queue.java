package in.cdac;

public interface Queue {
	
	public void enqueue(int data) throws Exception;
	public int dequeue() throws Exception;
	public boolean isEmpty();
	public boolean isFull();
	
}
