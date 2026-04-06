package in.cdac;

public class QueueADT implements Queue {
	private int arr[];
	private int rear;
	private int front;
	private int size;
	
	// Parameterized Constructor
	public QueueADT(int s) {
		arr = new int[s];
		this.size = s;
		front = -1;
		rear = -1;
	}
	
	@Override
	public void enqueue(int data) throws Exception {

		if(isEmpty()) {
			rear++;
			front++;
			arr[rear] = data;
		}else if(isFull()) {
			throw new Exception("Queue is Full");
		}
		else {
			arr[++rear] = data;
		}
		
	}

	@Override
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Empty");
		}
			return arr[front++];
	}

	@Override
	public boolean isEmpty() {
		if((rear == front) && (front == -1))
			return true;
		else
			return false;
	}

	@Override
	public boolean isFull() {
		if(rear == size) {
			return true;
		}
		return false;
	}
	
	public void displayQueue() {
		System.out.println("Queue: ");
		for(int i=front; i<=rear; i++) {
			System.out.print(arr[i] + " ");
		}
	}
		
}
