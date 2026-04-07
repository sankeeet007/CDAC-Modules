package in.cdac;

public interface Queue {
	
	public void enqueue(int data);
	public int dequeue();
	public boolean isEmpty();
	public void displayQueue();
}
