package in.cdac;

public class StackADT implements Stack {
	private int []arr;
	private int top;
	private int size;
	
	// Parameterized Constructor
	
	public StackADT(int s) {
		this.size = s;
		arr = new int[this.size];
		top = -1;
	}
	
	@Override
	public int peek() {
		return arr[top];
	}

	@Override
	public void push(int data) {
		if(top==size-1) {
			System.out.println("Stack is Full.");
		}
		arr[++top] = data;
	}

	@Override
	public int pop() {
		
		if(isEmpty() || top<0) {
			System.out.println("Stack is Empty.");
			return -1;
		}
		return arr[top--];
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
