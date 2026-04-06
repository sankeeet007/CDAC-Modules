package in.cdac;

public class CircularQueue<T> implements Queue<T> {
	private T[] arr;
	private int rear;
	private int front;
	private int size;
	private int currCapacity;
	
	// Parameterized Constructor
	@SuppressWarnings("unchecked")
	public CircularQueue(int s) {
		this.size = s;
		this.arr = (T[]) new Object[size];
		this.front = 0;
		this.rear = -1;
		this.currCapacity = 0;
	}
	
	@Override
	public boolean isEmpty() {
		
		return currCapacity == 0;
	}

	@Override
	public boolean isFull() {
		
		return currCapacity == size;
	}
	
	@Override
	public void enqueue(T data) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is Full");
		}
		rear = (rear + 1) % size;
		arr[rear] = data;
		currCapacity++;
	}

	@Override
	public T dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		
		T dequeuedElement = arr[front];
		arr[front] = null;
		front = (front + 1) % size;
		currCapacity--;
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
