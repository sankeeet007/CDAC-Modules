package in.cdac;

public interface StackGeneric<T> {
	
	public T peek();
	public void push(T data) throws Exception;
	public T pop();
	public boolean isEmpty();
	public void displayStack();
}
