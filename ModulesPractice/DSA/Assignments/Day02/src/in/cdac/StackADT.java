package in.cdac;

public class StackADT<T> implements StackGeneric<T> {
	private T[] arr;
	private int top;
	private int size;
	
	// Parameterized Constructor
	
	@SuppressWarnings("unchecked")
	public StackADT(int s) {
		this.size = s;
		this.arr = (T[]) new Object[this.size];
		this.top = -1;
	}
	
	@Override
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public T peek() {
		if(isEmpty()) return null;
		return arr[top];
	}

	@Override
	public void push(T data) throws Exception{
		if(top == size - 1) {
			throw new Exception("Stack is Full.");
		}
		arr[++top] = data;
	}

	@Override
	public T pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty.");
			return null;
		}
		T popedElemenT = arr[top];
		arr[top] = null;
		top--;
		return popedElemenT;
	}



	@Override
	public void displayStack() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		System.out.println("Stack elements Top to Down manner.");
		for(int i=top; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
