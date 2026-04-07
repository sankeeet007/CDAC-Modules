package in.cdac;

public class QueueWithLinkedListADT implements Queue{

	SinglyLinkedListADT queueObj = new SinglyLinkedListADT();
	
	@Override
	public void enqueue(int data) {
		queueObj.addLast(data);
	}
	
	@Override
	public int dequeue() {
		return queueObj.deleteFirst();
	}


	@Override
	public boolean isEmpty() {
		return queueObj.isEmpty();
	}

	@Override
	public void displayQueue() {
		queueObj.displayList();
	}
	
}
