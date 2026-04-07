package in.cdac;

public class QueueADT<T> implements QueueGeneric<T> {
	private T[] arr;
	private int rear;
	private int front;
	private int size;
	
	// Parameterized Constructor
	@SuppressWarnings("unchecked")
	public QueueADT(int s) {
		this.size = s;
		this.arr = (T[]) new Object[size];
		this.front = 0;
		this.rear = -1;
	}
	
	@Override
	public boolean isEmpty() {
		
		return front > rear;
	}

	@Override
	public boolean isFull() {
		
		return rear == size - 1;
	}
	
	@Override
	public void enqueue(T data) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		arr[++rear] = data;
	}

	@Override
	public T dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		T dequeuedElement = arr[front];
		arr[front] = null;
		front++;
		return dequeuedElement;
	}  

	public void displayQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
		}
		
		System.out.println("Queue: ");
		for(int i = front; i <= rear; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
		
}
